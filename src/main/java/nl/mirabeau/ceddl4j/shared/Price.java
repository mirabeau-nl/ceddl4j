package nl.mirabeau.ceddl4j.shared;

import nl.mirabeau.ceddl4j.internal.BaseItem;

/**
 * This object provides details of the Price.
 *
 * @param <T> Parent object type
 */
public class Price<T> extends BaseItem<Price<T>> {

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
	 * Constructs a Price object
	 * 
	 * @param parent The parent object
	 */
	public Price(final T parent) {
		super();
		this.parent = parent;
	}

	/**
	 * Returns to the parent object
	 * 
	 * @return parent object

	 */
	public T endPrice() {
		return parent;
	}

	/**
	 * Sets the basePrice.
	 * 
	 * The basePrice SHOULD be the price of the items before applicable
	 * discounts, shipping charges, and tax.
	 * 
	 * @param basePrice
	 *            Number
	 * @return {@code this}
	 */
	public Price<T> basePrice(final Number basePrice) {
		addItem(BASE_PRICE, basePrice);
		return this;
	}

	/**
	 * Sets the voucherCode.
	 * 
	 * @param voucherCode
	 *            String
	 * @return {@code this}
	 */
	public Price<T> voucherCode(final String voucherCode) {
		addItem(VOUCHER_CODE, voucherCode);
		return this;
	}

	/**
	 * Sets the voucherDiscount.
	 * 
	 * @param voucherDiscount
	 *            Number
	 * @return {@code this}
	 */
	public Price<T> voucherDiscount(final Number voucherDiscount) {
		addItem(VOUCHER_DISCOUNT, voucherDiscount);
		return this;
	}

	/**
	 * Sets the currency.
	 * 
	 * For currency values, ISO 4217 is RECOMMENDED.
	 * 
	 * @param currency
	 *            String.
	 * @return {@code this}
	 */
	public Price<T> currency(final String currency) {
		addItem(CURRENCY, currency);
		return this;
	}

	/**
	 * Sets the tax rate.
	 * 
	 * @param taxRate
	 *            Number
	 * @return {@code this}
	 */
	public Price<T> taxRate(final Number taxRate) {
		addItem(TAX_RATE, taxRate);
		return this;
	}

	/**
	 * Sets the shipping.
	 * 
	 * @param shipping
	 *            Number
	 * @return {@code this}
	 */
	public Price<T> shipping(final Number shipping) {
		addItem(SHIPPING, shipping);
		return this;
	}

	/**
	 * Sets the shippingMethod.
	 * 
	 * @param shippingMethod
	 *            String
	 * @return {@code this}
	 */
	public Price<T> shippingMethod(final String shippingMethod) {
		addItem(SHIPPING_METHOD, shippingMethod);
		return this;
	}

	/**
	 * Sets the PriceWithTax.
	 * 
	 * @param priceWithTax
	 *            Number
	 * @return {@code this}
	 */
	public Price<T> priceWithTax(final Number priceWithTax) {
		addItem(PRICE_WITH_TAX, priceWithTax);
		return this;
	}

	/**
	 * Sets the cartTotal.
	 * 
	 * The cartTotal SHOULD be the total price inclusive of all discounts,
	 * charges, and tax.
	 * 
	 * @param cartTotal
	 *            Number
	 * @return {@code this}
	 */
	public Price<T> cartTotal(final Number cartTotal) {
		addItem(CART_TOTAL, cartTotal);
		return this;
	}

	/**
	 * Sets the transactionTotal.
	 * 
	 * The transactionTotal SHOULD be the total price inclusive of all
	 * discounts, charges, and tax.
	 * 
	 * @param transactionTotal Number
	 * @return {@code this}
	 */
	public Price<T> transactionTotal(final Number transactionTotal) {
		addItem(TRANSACTION_TOTAL, transactionTotal);
		return this;
	}

	@Override
	protected Price<T> returnSelf() {
		return this;
	}
}
