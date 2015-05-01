package nl.mirabeau.ceddl4j;

import org.json.JSONException;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

public class CartTest {

	@Test
	public void testCart() throws JSONException {

		final DigitalData ddb = DigitalData.create().cart()
				.cartID("test1234")
				.price()
				.basePrice(200.20)
				.voucherCode("Alpha")
				.voucherDiscount(0.50)
				.currency("EUR")
				.taxRate(0.20)
				.shipping(5.00)
				.shippingMethod("UPS")
				.priceWithTax(120)
				.cartTotal(120)
				.custom("customString", "example")
				.custom("customDouble", 123)
				.endPrice()
				.addAttribuut("customAttribuut", "example")
				.addItem()
				.productInfo()
				.productID("testproductid")
				.endProductInfo()
				.addPrimaryCategory("testCategory")
				.quantity(10)
				.price()
				.basePrice(20.20)
				.voucherCode("AlphaProduct")
				.voucherDiscount(0.55)
				.currency("USD")
				.taxRate(0.30)
				.shipping(6.00)
				.shippingMethod("None")
				.priceWithTax(300)
				.endPrice()
				.addLinkedProduct().productInfo().productID("linkedProd1").endProductInfo().endLinkedProduct()
				.addLinkedProduct().productInfo().productID("linkedProd2").endProductInfo().endLinkedProduct()
				.addAttribuut("test1", "test2")
				.endItem()
				.endCart();

		System.out.println(ddb.toString());

		final String expected = new TestUtil().loadJsonFromFile("/tests/cartTest.json");

		JSONAssert.assertEquals(expected, ddb.toString(), true);
	}

}
