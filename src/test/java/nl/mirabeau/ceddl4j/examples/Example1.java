package nl.mirabeau.ceddl4j.examples;

import java.io.IOException;

import nl.mirabeau.ceddl4j.DigitalData;
import nl.mirabeau.ceddl4j.TestUtil;

import org.json.JSONException;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

public class Example1 {

	/**
	 * Generate the following example from the CEDDL spec on page 9.
	 * 
	 * <pre>
	 * {@code
	 * digitalData = {
	 * 		pageInstanceID: "MyHomePage-Production",
	 * 		page:{
	 * 			pageInfo:{
	 * 				pageID: "Home Page",
	 * 				destinationURL: "http://mysite.com/index.html"
	 * 			},
	 * 			category:{
	 * 				primaryCategory: "FAQ Pages",
	 * 				subCategory1: "ProductInfo",
	 * 				pageType: "FAQ"
	 * 			},
	 * 			attributes:{
	 * 				country: "US",
	 * 				language: "en-US"
	 * 			}
	 * 		 }
	 * };
	 * }
	 * </pre>
	 * @throws IOException
	 * @throws JSONException
	 */
	@Test
	public void exampleFromSpec1() throws IOException, JSONException {

		final DigitalData ddb = DigitalData.create("MyHomePage-Production")
				.page().pageInfo()
				.pageID("Home Page")
				.destinationURL("http://mysite.com/index.html")
				.endPageInfo()
				.addPrimaryCategory("FAQ Pages")
				.addCategory("subCategory1", "ProductInfo")
				.addCategory("pageType", "FAQ")
				.addAttribute("country", "US")
				.addAttribute("language", "en-US")
				.endPage();

		System.out.println(ddb.toString());

		final String expected = new TestUtil()
		.loadJsonFromFile("/examples/example1.json");

		JSONAssert.assertEquals(expected, ddb.toString(), false);
	}

}
