package nl.mirabeau.ceddl4j.shared.impl;

import java.util.LinkedHashMap;

import nl.mirabeau.ceddl4j.shared.Price;

/**
 * This object provides details of the Price.
 *
 * @param <T> Parent object type
 */
public class PriceImpl<T> extends LinkedHashMap<String, Object> implements Price<T> {

	private static final long serialVersionUID = 9040917798618516574L;

	private T parent;

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

	/**
	 * Constructor, does not set the parent
	 */
	public PriceImpl() {
		super();
	}

	/**
	 * Constructor, sets the parent
	 * 
	 * @param parent
	 */
	public PriceImpl(final T parent) {
		super();
		this.parent = parent;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.shared.Price#endPrice()
	 */
	public T endPrice() {
		return parent;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.shared.Price#basePrice(java.lang.Object)
	 */
	public Price<T> basePrice(final Object basePrice) {
		put(BASE_PRICE, basePrice);
		return this;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.shared.Price#voucherCode(java.lang.Object)
	 */
	public Price<T> voucherCode(final Object voucherCode) {
		put(VOUCHER_CODE, voucherCode);
		return this;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.shared.Price#voucherDiscount(java.lang.Object)
	 */
	public Price<T> voucherDiscount(final Object voucherDiscount) {
		put(VOUCHER_DISCOUNT, voucherDiscount);
		return this;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.shared.Price#currency(java.lang.Object)
	 */
	public Price<T> currency(final Object currency) {
		put(CURRENCY, currency);
		return this;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.shared.Price#taxRate(java.lang.Object)
	 */
	public Price<T> taxRate(final Object taxRate) {
		put(TAX_RATE, taxRate);
		return this;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.shared.Price#shipping(java.lang.Object)
	 */
	public Price<T> shipping(final Object shipping) {
		put(SHIPPING, shipping);
		return this;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.shared.Price#shippingMethod(java.lang.Object)
	 */
	public Price<T> shippingMethod(final Object shippingMethod) {
		put(SHIPPING_METHOD, shippingMethod);
		return this;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.shared.Price#priceWithTax(java.lang.Object)
	 */
	public Price<T> priceWithTax(final Object priceWithTax) {
		put(PRICE_WITH_TAX, priceWithTax);
		return this;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.shared.Price#cartTotal(java.lang.Object)
	 */
	public Price<T> cartTotal(final Object cartTotal) {
		put(CART_TOTAL, cartTotal);
		return this;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.shared.Price#transactionTotal(java.lang.Object)
	 */
	public Price<T> transactionTotal(final Object transactionTotal) {
		put(TRANSACTION_TOTAL, transactionTotal);
		return this;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.shared.Price#custom(java.lang.String, java.lang.Object)
	 */
	public Price<T> custom(final String name, final Object value) {
		put(name, value);
		return this;
	}
}
