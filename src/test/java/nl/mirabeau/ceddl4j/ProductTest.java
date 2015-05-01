package nl.mirabeau.ceddl4j;

import org.json.JSONException;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

public class ProductTest {

	@Test
	public void testProduct() throws JSONException {

		final DigitalData ddb = DigitalData.create().addProduct().productInfo()
				.productID("rog3000")
				.productName("Rogaine")
				.description("Hair Regrowth")
				.productURL("http://site.com/r.html")
				.productImage("http://site.com/rog300_large.png")
				.productThumbnail("http://site.com/rog300_large.png")
				.manufacturer("Pharma")
				.size( "300ml")
				.sku("sku123")
				.custom("customprop1", "example1")
				.endProductInfo().addLinkedProduct()
				.productInfo()
				.description("test")
				.endProductInfo()
				.endLinkedProduct()
				.endProduct()
				.addProduct().productInfo()
				.productID("rog4000")
				.custom("customprop1", "example2")
				.endProductInfo()
				.addPrimaryCategory("Hair")
				.category()
				.category("testcategory", "testvalue")
				.endCategory()
				.addCategory("anothertestcategory", "anothertestvalue")
				.addAttribute("testattribuut", "testvalue")
				.attributes()
				.attribute("anothertestattribuut", "anothertestvalue")
				.endAttributes()
				.endProduct();

		System.out.println(ddb.toString());

		final String expected = new TestUtil().loadJsonFromFile("/tests/productTest.json");

		JSONAssert.assertEquals(expected, ddb.toString(), true);

	}

}
