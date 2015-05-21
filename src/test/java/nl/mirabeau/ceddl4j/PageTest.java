package nl.mirabeau.ceddl4j;

import java.io.IOException;
import java.util.Date;

import org.json.JSONException;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

public class PageTest {

	@Test
	public void testPage() throws IOException, JSONException {

		final Date date = new Date(0);

		final DigitalData ddb = DigitalData.create()
				.pageInstanceId("ProductDetailPageNikonCamera-Staging")
				.page()
				.pageInfo()
				.pageID("ProductDetailPageNikonCamera")
				.pageName("Nikon SLR Camera")
				.destinationURL("http://www,testshop.nl/nikon/")
				.referringURL("http://www,testshop.nl/home/")
				.sysEnv("staging")
				.variant("Variant A")
				.version("78")
				.breadCrumbs("camera", "Nikon", "SLR")
				.author("S. Veenstra")
				.issueDate(date)
				.effectiveDate(date)
				.expiryDate(date)
				.language("nl")
				.geoRegion("The Netherlands")
				.industryCodes("test")
				.publisher("me")
				.onsiteSearchTerm("search terms")
				.onsiteSearchResults(42)
				.custom("custom pageinfo", "example")
				.endPageInfo()
				.addPrimaryCategory("Cameras")
				.addCategory("subCategory1", "Nikon")
				.addAttribute("Seasonal", "Christmas")
				.addAttribute("customdateattribuut", date)
				.attributes()
				.attribute("customnumberattribuut", 100)
				.endAttributes()
				.category()
				.category("test", "testvalue")
				.endCategory()
				.endPage()
				.version();

		System.out.println(ddb.toString());

		final String expected = new TestUtil().loadJsonFromFile("/pageTest.json");

		JSONAssert.assertEquals(expected, ddb.toString(), true);
	}

	@Test
	public void testPage2() throws IOException, JSONException {

		final Date date = new Date(0);

		final DigitalData ddb = DigitalData.create()
				.pageInstanceId("ProductDetailPageNikonCamera-Staging")
				.page()
				.pageInfo()
				.pageID("ProductDetailPageNikonCamera")
				.pageName("Nikon SLR Camera")
				.destinationURL("http://www,testshop.nl/nikon/")
				.referringURL("http://www,testshop.nl/home/")
				.sysEnv("staging")
				.variant("Variant A")
				.version("78")
				.breadCrumbs("camera", "Nikon", "SLR")
				.author("S. Veenstra")
				.issueDate("1970-01-01T00:00:00Z")
				.effectiveDate("1970-01-01T00:00:00Z")
				.expiryDate("1970-01-01T00:00:00Z")
				.language("nl")
				.geoRegion("The Netherlands")
				.industryCodes("test")
				.publisher("me")
				.onsiteSearchTerm("search terms")
				.onsiteSearchResults(42)
				.custom("custom pageinfo", "example")
				.endPageInfo()
				.addPrimaryCategory("Cameras")
				.addCategory("subCategory1", "Nikon")
				.addAttribute("Seasonal", "Christmas")
				.addAttribute("customdateattribuut", date)
				.attributes()
				.attribute("customnumberattribuut", 100)
				.endAttributes()
				.category()
				.category("test", "testvalue")
				.endCategory()
				.endPage()
				.version();

		System.out.println(ddb.toString());

		final String expected = new TestUtil().loadJsonFromFile("/pageTest.json");

		JSONAssert.assertEquals(expected, ddb.toString(), true);
	}
}
