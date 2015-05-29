package nl.mirabeau.ceddl4j.examples.airline;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import nl.mirabeau.ceddl4j.DigitalData;
import nl.mirabeau.ceddl4j.TestUtil;
import nl.mirabeau.ceddl4j.cart.Cart;
import nl.mirabeau.ceddl4j.product.Product;
import nl.mirabeau.ceddl4j.user.User;

import org.json.JSONException;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

public class AirlineExample {

	/**
	 * Generates the air travel booking website example from the CEDDL specification on page 30.
	 * 
	 * @throws IOException
	 * @throws JSONException
	 */
	@Test
	public void airlineExample() throws IOException, JSONException {

		// Core flight reservation related data can be used to populate and extend the
		// productInfo field as shown below:
		//		digitalData.product[n].productInfo = {
		//				 productID: "734565538989889110",
		//				description: "Business Class One-Way Ticket",
		//				originAirportCode: "RDU",
		//				originCity: "Raleigh",
		//				originState: "North Carolina",
		//				originCounty: "USA",
		//				destinationAirportCode: "BOM",
		//				destinationState: "Maharashtra",
		//				destinationCountry: "India",
		//				departureDate: new Date("December 15, 2013 14:20:00"),
		//				arrivalDate: new Date("December 16, 2013 21:40:00"),
		//				numberOfTravellers: 1
		//				};

		// Setup the departureDate and arrivalDate.
		final GregorianCalendar departureDate = new GregorianCalendar();
		departureDate.setTimeZone(TimeZone.getTimeZone("UTC"));
		departureDate.set(Calendar.YEAR, 2013);
		departureDate.set(Calendar.MONTH, 11);
		departureDate.set(Calendar.DAY_OF_MONTH, 15);
		departureDate.set(Calendar.HOUR_OF_DAY, 14);
		departureDate.set(Calendar.MINUTE, 20);
		departureDate.set(Calendar.SECOND, 0);

		final GregorianCalendar arrivalDate = new GregorianCalendar();
		arrivalDate.setTimeZone(TimeZone.getTimeZone("UTC"));
		arrivalDate.set(Calendar.YEAR, 2013);
		arrivalDate.set(Calendar.MONTH, 11);
		arrivalDate.set(Calendar.DAY_OF_MONTH, 16);
		arrivalDate.set(Calendar.HOUR_OF_DAY, 21);
		arrivalDate.set(Calendar.MINUTE, 40);
		arrivalDate.set(Calendar.SECOND, 0);

		final Product product = new Product().productInfo()
				.productID("734565538989889110")
				.description("Business Class One-Way Ticket")
				.custom("originAirportCode", "RDU")
				.custom("originCity", "Raleigh")
				.custom("originState", "North Carolina")
				.custom("originCounty", "USA")
				.custom("destinationAirportCode", "BOM")
				.custom("destinationState", "Maharashtra")
				.custom("destinationCountry", "India")
				.custom("departureDate", departureDate.getTime())
				.custom("arrivalDate", arrivalDate.getTime())
				.custom("numberOfTravellers", 1)
				.endProductInfo();

		// As a travel product is moved into the cart details such as price, fees, and currency can
		// be used to populate or extend the digitalData.cart.price object literal. Additional
		// fields such as a confirmation number might extend the digitalData.transaction
		// objects.

		//	digitalData.cart.price = {
		//		basePrice: 1000.00,
		//		currency: "USD",
		//		fees: 200,
		//		taxRate: 0.08,
		//		cartTotal: 1296.00
		//	};

		final Cart cart = new Cart().price()
				.basePrice(1000.00)
				.currency("USD")
				.custom("fees", 200)
				.taxRate(0.08)
				.cartTotal(1296.00)
				.endPrice();

		//	A "frequent flyer club" property could be added to the
		//	digitalData.user[n].segment object to capture the customer’s loyalty
		//	level:
		//
		//	digitalData.user[n].segment = {
		//		frequentFlyerClub:
		//	};

		final User user = new User().addSegment("frequentFlyerClub", "Silver Elite");

		final DigitalData ddb = DigitalData.create()
				.addProduct(product)
				.setCart(cart)
				.addUser(user);

		System.out.println(ddb.toString());

		final String expected = new TestUtil().loadJsonFromFile("/airline-example.json");

		JSONAssert.assertEquals(expected, ddb.toString(), true);
	}

}
