package nl.mirabeau.ceddl4j;

import java.io.IOException;
import java.util.Date;

import org.json.JSONException;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

public class EventTest {


	@Test
	public void testEvent() throws IOException, JSONException {

		final Date date = new Date(0);

		final DigitalData ddb = DigitalData.create()
				.addEvent().eventInfo()
				.eventName("Add News Portal")
				.eventAction("addportal")
				.eventPoints(200d)
				.type("contentModifier")
				.timeStamp(date)
				.effect("include portal 1234")
				.endEventInfo()
				.addAttribute("customAttribuut", "example")
				.addPrimaryCategory("content events")
				.addCategory("cat2", "example")
				.endEvent()
				.addEvent().eventInfo()
				.eventName("Another event")
				.endEventInfo()
				.endEvent();

		System.out.println(ddb.toString());

		final String expected = new TestUtil().loadJsonFromFile("/tests/eventTest.json");

		JSONAssert.assertEquals(expected, ddb.toString(), false);
	}




}
