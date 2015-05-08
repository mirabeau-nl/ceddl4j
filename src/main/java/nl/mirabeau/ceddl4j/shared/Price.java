package nl.mirabeau.ceddl4j.shared;

import nl.mirabeau.ceddl4j.BaseItem;

/**
 * This object provides details of the Price.
 *
 * @param <T> Parent object type
 */
public class Price<T> extends BaseItem {

	private static final String BASE_PRICE = "basePrice";
	private static final String VOUCHER_CODE = "voucherCode";
	private static final String VOUCHER_DISCOUNT = "voucherDiscount";
	private static final String CURRENCY = "currency";
	private static final String TAX_RATE = "taxRate";
	private static final String SHIPPING = "shipping";
	private static final String SHIPPING_METHOD = "shippingMethod";
	private static final String PRICE_WITH_TAX = "priceWithTax";
	private static final String CART_TOTAL = "cartTotal";
	private static final String TRANSACTION_TOTAL = "transactionTotal";

	private final T parent;

	/**
	 * Constructor, sets the parent
	 * 
	 * @param parent
	 */
	public Price(final T parent) {
		super();
		this.parent = parent;
	}

	/**
	 * Return to the parent object
	 * 
	 * @return parent object

	 */
	public T endPrice() {
		return parent;
	}

	/**
	 * 
	 * The basePrice SHOULD be the price of the items before applicable
	 * discounts, shipping charges, and tax.
	 * 
	 * @param basePrice
	 *            Number
	 * @return {@code this}
	 */
	public Price<T> basePrice(final Object basePrice) {
		items.put(BASE_PRICE, basePrice);
		return this;
	}

	/**
	 * voucherCode
	 * 
	 * @param voucherCode
	 *            String
	 * @return {@code this}
	 */
	public Price<T> voucherCode(final Object voucherCode) {
		items.put(VOUCHER_CODE, voucherCode);
		return this;
	}

	/**
	 * voucherDiscount
	 * 
	 * @param voucherDiscount
	 *            Number
	 * @return {@code this}
	 */
	public Price<T> voucherDiscount(final Object voucherDiscount) {
		items.put(VOUCHER_DISCOUNT, voucherDiscount);
		return this;
	}

	/**
	 * Currency.
	 * 
	 * @param currency
	 *            String. For currency values, ISO 4217 is RECOMMENDED.
	 * @return {@code this}
	 */
	public Price<T> currency(final Object currency) {
		items.put(CURRENCY, currency);
		return this;
	}

	/**
	 * Taxrate
	 * 
	 * @param taxRate
	 *            Number
	 * @return {@code this}
	 */
	public Price<T> taxRate(final Object taxRate) {
		items.put(TAX_RATE, taxRate);
		return this;
	}

	/**
	 * Shipping
	 * 
	 * @param shipping
	 *            Number
	 * @return {@code this}
	 */
	public Price<T> shipping(final Object shipping) {
		items.put(SHIPPING, shipping);
		return this;
	}

	/**
	 * ShippingMethod
	 * 
	 * @param shippingMethod
	 *            String
	 * @return {@code this}
	 */
	public Price<T> shippingMethod(final Object shippingMethod) {
		items.put(SHIPPING_METHOD, shippingMethod);
		return this;
	}

	/**
	 * PriceWithTax
	 * 
	 * @param priceWithTax
	 *            Number
	 * @return {@code this}
	 */
	public Price<T> priceWithTax(final Object priceWithTax) {
		items.put(PRICE_WITH_TAX, priceWithTax);
		return this;
	}

	/**
	 * The cartTotal SHOULD be the total price inclusive of all discounts,
	 * charges, and tax.
	 * 
	 * @param cartTotal
	 *            Number
	 * @return {@code this}
	 */
	public Price<T> cartTotal(final Object cartTotal) {
		items.put(CART_TOTAL, cartTotal);
		return this;
	}

	/**
	 * The transactionTotal SHOULD be the total price inclusive of all
	 * discounts, charges, and tax.
	 * 
	 * @param transactionTotal Number
	 * @return {@code this}
	 */
	public Price<T> transactionTotal(final Object transactionTotal) {
		items.put(TRANSACTION_TOTAL, transactionTotal);
		return this;
	}

	/**
	 * Custom Price property
	 * 
	 * @param name
	 *            Name for the custom property
	 * @param value
	 *            Value for the custom property
	 * @return {@code this}
	 */
	public Price<T> custom(final String name, final Object value) {
		items.put(name, value);
		return this;
	}
}
