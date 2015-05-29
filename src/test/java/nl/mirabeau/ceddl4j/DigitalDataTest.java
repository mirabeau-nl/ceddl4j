package nl.mirabeau.ceddl4j;

import java.io.IOException;

import nl.mirabeau.ceddl4j.cart.Cart;
import nl.mirabeau.ceddl4j.component.Component;
import nl.mirabeau.ceddl4j.event.Event;
import nl.mirabeau.ceddl4j.page.Page;
import nl.mirabeau.ceddl4j.privacy.Privacy;
import nl.mirabeau.ceddl4j.product.Product;
import nl.mirabeau.ceddl4j.transaction.Transaction;
import nl.mirabeau.ceddl4j.user.User;

import org.json.JSONException;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;


public class DigitalDataTest {

	@Test
	public void testDigitalDataSetters() throws IOException, JSONException {

		final DigitalData ddb = DigitalData.create("pageInstanceID");

		final Page page = new Page();
		page.pageInfo().pageID("pageID");
		ddb.setPage(page);

		final Product product = new Product();
		product.productInfo().productID("productID");
		ddb.addProduct(product);

		final Cart cart = new Cart();
		cart.cartID("cartID");
		ddb.setCart(cart);

		final Transaction transaction = new Transaction();
		transaction.transactionID("transactionID");
		ddb.setTransaction(transaction);

		final Event event = new Event();
		event.eventInfo().eventName("ëventName");
		ddb.addEvent(event);

		final User user = new User();
		ddb.addUser(user);

		final Component component = new Component();
		component.componentInfo().componentID("componentID");
		ddb.addComponent(component);

		final Privacy privacy = new Privacy();
		privacy.addDefaultAccessCategory().domains("www.example.com");
		ddb.setPrivacy(privacy);

		ddb.version("1.0");


		System.out.println(ddb.toString());

		final String expected = new TestUtil()
		.loadJsonFromFile("/settersTest.json");

		JSONAssert.assertEquals(expected, ddb.toString(), true);
	}
}
