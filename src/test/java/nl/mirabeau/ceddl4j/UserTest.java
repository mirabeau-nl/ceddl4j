package nl.mirabeau.ceddl4j;

import java.io.IOException;

import org.json.JSONException;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

public class UserTest {

	@Test
	public void testUser() throws IOException, JSONException {

		final DigitalData ddb = DigitalData.create()
				.addUser()
				.addSegment("membership", "basic membership")
				.addProfile()
				.profileInfo()
				.profileID("humanbeing12345")
				.userName("me")
				.email("me@humanbeing12345.nl")
				.language("nl")
				.returningStatus("new")
				.type("user")
				.endProfileInfo()
				.address()
				.line1("673 My Street")
				.line2("Apt 1")
				.city("Austin")
				.stateProvince("TX")
				.postalCode("78610")
				.country("USA")
				.custom("extra adress info", "ring twice")
				.endAddress()
				.addSocial("twitter:", "somebody")
				.addSocial("facebook", "othervalue")
				.addAttribute("example", "something")
				.endProfile()
				.endUser();

		System.out.println(ddb.toString());

		final String expected = new TestUtil().loadJsonFromFile("/userTest.json");

		JSONAssert.assertEquals(expected, ddb.toString(), true);
	}

	@Test
	public void testUser2() throws IOException, JSONException {

		final DigitalData ddb = DigitalData.create()
				.addUser()
				.segment()
				.segment("membership", "basic membership")
				.endSegment()
				.addProfile()
				.profileInfo()
				.profileID("humanbeing12345")
				.userName("me")
				.email("me@humanbeing12345.nl")
				.language("nl")
				.returningStatus("new")
				.type("user")
				.endProfileInfo()
				.address()
				.line1("673 My Street")
				.line2("Apt 1")
				.city("Austin")
				.stateProvince("TX")
				.postalCode("78610")
				.country("USA")
				.custom("extra adress info", "ring twice")
				.endAddress()
				.social()
				.social("twitter:", "somebody")
				.social("facebook", "othervalue")
				.endSocial()
				.attributes()
				.attribute("example", "something")
				.endAttributes()
				.endProfile()
				.endUser();

		System.out.println(ddb.toString());

		final String expected = new TestUtil().loadJsonFromFile("/userTest.json");

		JSONAssert.assertEquals(expected, ddb.toString(), true);
	}





}
