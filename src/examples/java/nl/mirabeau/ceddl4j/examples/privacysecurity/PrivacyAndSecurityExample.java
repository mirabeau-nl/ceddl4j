package nl.mirabeau.ceddl4j.examples.privacysecurity;

import java.io.IOException;

import nl.mirabeau.ceddl4j.DigitalData;
import nl.mirabeau.ceddl4j.TestUtil;

import org.json.JSONException;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

/**
 * Generates the privacy and security example from the CEDDL specification on
 * page 12 and 13.
 * 
 * @throws IOException
 * @throws JSONException
 */
public class PrivacyAndSecurityExample {

	@Test
	public void testPrivacy() throws IOException, JSONException {

		// Consider the following example, of an e-commerce company, www.nonexistent-store.com,
		// which uses tools from the vendors calc.com, adsRus.com, and audit.com.
		// To use the data standard, first they will categorize their technology vendors into categories:
		// - Default: nonexistent-store.com, audit.com
		// - Analytics: calc.com
		// - Recommendations: adsRus.com

		// digitalData.privacy.accessCategories.categories[1] = {
		// categoryName: "Default",
		// domains: ["nonexistent-store.com", "audit.com"]};
		// digitalData.privacy.accessCategories.categories[2] = {
		// categoryName: "Analytics",
		// domains: ["calc.com"]};
		// digitalData.privacy.accessCategories.categories[3] = {
		// categoryName: "Recommendations",
		// domains: ["adsRus.com"]};


		final DigitalData ddb = DigitalData.create()
				.privacy()
				.addDefaultAccessCategory().domains("nonexistent-store.com", "audit.com").endAccessCategory()
				.addAccessCategory().categoryName("Analytics").domains("calc.com").endAccessCategory()
				.addAccessCategory().categoryName("Recommendations").domains("adsRus.com").endAccessCategory()
				.endPrivacy()

				// Second, they will identify any objects within the JSO that need data
				// security, and add security objects for those objects. (The Default category is always
				// allowed, because it represents the first party.) In this example, there is a need to
				// protect parts of the cart data from Recommendations category of tools
				// because one product is sensitive. The following will restrict the data to only the
				// “Analytics” and “Default” categories.
				.cart()
				.addItem()
				.productInfo()
				.productName("Example product name").security("Analytics")
				.description("Example description").security("Analytics")
				.productURL("http://www.exampleproducturl.com").security("Analytics")
				.endProductInfo()
				.endItem()
				.endCart();

		System.out.println(ddb.toString());

		final String expected = new TestUtil()
		.loadJsonFromFile("/privacyandsecurity-example.json");

		JSONAssert.assertEquals(expected, ddb.toString(), true);
	}
}
