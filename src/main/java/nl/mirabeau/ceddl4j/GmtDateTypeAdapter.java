package nl.mirabeau.ceddl4j;

import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonSyntaxException;

/**
 * Fix for known issue in GSON (The gson default serializer always defaults to
 * your local timezone, and doesn't allow you to specify the timezone.)
 * 
 * See:
 * 
 * http://stackoverflow.com/questions/26044881/java-date-to-utc-using-gson
 * 
 * https://code.google.com/p/google-gson/issues/detail?id=281
 */
public class GmtDateTypeAdapter implements JsonSerializer<Date>,
JsonDeserializer<Date> {
	private final DateFormat dateFormat;

	public GmtDateTypeAdapter() {
		dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
		dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
	}

	public synchronized JsonElement serialize(final Date date, final Type type,
			final JsonSerializationContext jsonSerializationContext) {
		synchronized (dateFormat) {
			final String dateFormatAsString = dateFormat.format(date);
			return new JsonPrimitive(dateFormatAsString);
		}
	}

	public synchronized Date deserialize(final JsonElement jsonElement,
			final Type type,
			final JsonDeserializationContext jsonDeserializationContext) {
		try {
			synchronized (dateFormat) {
				return dateFormat.parse(jsonElement.getAsString());
			}
		} catch (final ParseException e) {
			throw new JsonSyntaxException(jsonElement.getAsString(), e);
		}
	}
}