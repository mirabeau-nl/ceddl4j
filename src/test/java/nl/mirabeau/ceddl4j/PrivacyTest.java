package nl.mirabeau.ceddl4j;

import java.io.IOException;

import org.json.JSONException;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

public class PrivacyTest {

	@Test
	public void testPrivacy() throws IOException, JSONException {

		final DigitalData ddb = DigitalData.create()
				.privacy()
				.addDefaultAccessCategory()
				.domains("nonexistent-store.com", "audit.com")
				.endAccessCategory()
				.addAccessCategory()
				.categoryName("Analytics")
				.domains("calc.com")
				.endAccessCategory()
				.addAccessCategory()
				.categoryName("Recommendations")
				.domains("adsRus.com")
				.endAccessCategory()
				.endPrivacy();

		System.out.println(ddb.toString());

		final String expected = new TestUtil().loadJsonFromFile("/privacyTest.json");

		JSONAssert.assertEquals(expected, ddb.toString(), true);
	}
}
