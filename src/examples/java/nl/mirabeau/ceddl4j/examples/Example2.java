package nl.mirabeau.ceddl4j.examples;

import java.io.IOException;

import nl.mirabeau.ceddl4j.DigitalData;
import nl.mirabeau.ceddl4j.TestUtil;

import org.json.JSONException;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

public class Example2 {

	/**
	 * Generate the following example from the CEDDL spec on page 10.
	 * 
	 * <pre>
	 * {@code
	 * digitalData = {
	 * 		pageInstanceID: "ProductDetailPageNikonCamera-Staging",
	 * 		page:{
	 * 			pageInfo:{
	 * 				pageID: "Nikon Camera",
	 * 				destinationURL: "http://mysite.com/products/NikonCamera.html"
	 * 			},
	 * 			category:{
	 * 				primaryCategory: "Cameras",
	 * 				subCategory1: "Nikon",
	 * 				pageType: "ProductDetail"
	 * 			},
	 * 			attributes:{
	 * 				Seasonal: "Christmas"}
	 * 			},
	 * 			product:[{
	 * 				productInfo:{
	 * 					productName: "Nikon SLR Camera",
	 * 					sku: "sku12345",
	 * 					manufacturer: "Nikon"},
	 * 				category:{
	 * 					primaryCategory: "Cameras"
	 * 				},
	 * 				attributes:{
	 * 					productType: "Special Offer"
	 * 				}
	 * 			}]
	 * };
	 * </pre>
	 * 
	 * @throws IOException
	 * @throws JSONException
	 */
	@Test
	public void exampleFromSpec2() throws IOException, JSONException {

		final DigitalData ddb = DigitalData.create("ProductDetailPageNikonCamera-Staging")
				.page().pageInfo().pageID("Nikon Camera")
				.destinationURL("http://mysite.com/products/NikonCamera.html")
				.endPageInfo()
				.addPrimaryCategory("Cameras")
				.addCategory("subCategory1", "Nikon")
				.addCategory("pageType", "ProductDetail")
				.addAttribute("Seasonal", "Christmas")
				.endPage()
				.addProduct()
				.productInfo()
				.productName("Nikon SLR Camera")
				.sku("sku12345")
				.manufacturer("Nikon")
				.endProductInfo()
				.addPrimaryCategory("Cameras")
				.addAttribute("productType", "Special Offer")
				.endProduct();

		System.out.println(ddb.toString());

		final String expected = new TestUtil()
		.loadJsonFromFile("/example2.json");

		JSONAssert.assertEquals(expected, ddb.toString(), false);
	}

}
