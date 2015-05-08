package nl.mirabeau.ceddl4j;

import java.io.IOException;

import org.json.JSONException;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

public class TransactionTest {

	@Test
	public void testTransaction() throws IOException, JSONException {

		final DigitalData ddb = DigitalData.create()
				.transaction()
				.transactionID("order1234")
				.profile()
				.profileInfo()
				.profileID("humanbeing12345")
				.userName("me")
				.email("test@example.com")
				.endProfileInfo()
				.address()
				.line1("673 My Street")
				.line2("Apt 1")
				.city("Austin")
				.stateProvince("TX")
				.postalCode("78610")
				.country("78610")
				.endAddress()
				.shippingAddress()
				.line1("674 My Street")
				.line2("Apt 2")
				.city("Austin")
				.stateProvince("TX")
				.postalCode("78610")
				.country("78610")
				.endAddress()
				.endProfile()
				.total()
				.basePrice(200d)
				.voucherCode("Alpha")
				.voucherDiscount(0.50d)
				.currency("EUR")
				.taxRate(0.20d)
				.shipping(5d)
				.shippingMethod("UPS")
				.priceWithTax(120)
				.transactionTotal(125d)
				.endPrice()
				.addAttribuut("testattribuut", "example")
				.attributes()
				.attribute("testattribuut2", "example2")
				.endAttributes()
				.addItem().productInfo()
				.productID("testproduct")
				.endProductInfo()
				.addPrimaryCategory("primary cat")
				.addCategory("other category", "other cat")
				.quantity(10d)
				.price()
				.basePrice(10d)
				.endPrice()
				.addLinkedProduct()
				.productInfo()
				.productID("linkedproduct1")
				.endProductInfo()
				.endLinkedProduct()
				.addAttribuut("custom attribuut", "value")
				.endItem()
				.endTransaction();

		System.out.println(ddb.toString());

		final String expected = new TestUtil().loadJsonFromFile("/tests/transactionTest.json");

		JSONAssert.assertEquals(expected, ddb.toString(), true);
	}

}
