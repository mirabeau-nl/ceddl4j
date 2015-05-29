package nl.mirabeau.ceddl4j;

import java.io.IOException;

import org.json.JSONException;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

public class SecurityTest {

	@Test
	public void testSecurity() throws IOException, JSONException {

		final DigitalData ddb = DigitalData.create()
				.pageInstanceId("ProductDetailPageNikonCamera-Staging")
				.page()
				.pageInfo()
				.pageID("ProductDetailPageNikonCamera").defaultSecurity()
				.pageName("Nikon SLR Camera").security("Analytics", "Personalization")
				.destinationURL("http://www,testshop.nl/nikon/").security("Analytics")
				.custom("custom pageinfo", "example").defaultSecurity()
				.endPageInfo()
				.attributes()
				.attribute("test", "example").security("Analytics", "Personalization")
				.endAttributes()
				.endPage();

		System.out.println(ddb.toString());

		final String expected = new TestUtil().loadJsonFromFile("/securityTest.json");

		JSONAssert.assertEquals(expected, ddb.toString(), true);
	}
}
