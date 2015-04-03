package nl.mirabeau.ceddl4j.shared;

/**
 * This object provides details of the Price.
 * 
 * @param <T>
 *            Parent object type
 */
public interface Price<T> {

	/**
	 * Return to the parent object
	 * 
	 * @return parent object or {@code null) when not available
	 */
	T endPrice();

	/**
	 * 
	 * The basePrice SHOULD be the price of the items before applicable
	 * discounts, shipping charges, and tax.
	 * 
	 * @param basePrice
	 *            Number
	 * @return {@code this}
	 */
	Price<T> basePrice(Object basePrice);

	/**
	 * voucherCode
	 * 
	 * @param voucherCode
	 *            String
	 * @return {@code this}
	 */
	Price<T> voucherCode(Object voucherCode);

	/**
	 * voucherDiscount
	 * 
	 * @param voucherDiscount
	 *            Number
	 * @return {@code this}
	 */
	Price<T> voucherDiscount(Object voucherDiscount);

	/**
	 * Currency.
	 * 
	 * @param currency
	 *            String. For currency values, ISO 4217 is RECOMMENDED.
	 * @return {@code this}
	 */
	Price<T> currency(Object currency);

	/**
	 * Taxrate
	 * 
	 * @param taxRate
	 *            Number
	 * @return {@code this}
	 */
	Price<T> taxRate(Object taxRate);

	/**
	 * Shipping
	 * 
	 * @param shipping
	 *            Number
	 * @return {@code this}
	 */
	Price<T> shipping(Object shipping);

	/**
	 * ShippingMethod
	 * 
	 * @param shippingMethod
	 *            String
	 * @return {@code this}
	 */
	Price<T> shippingMethod(Object shippingMethod);

	/**
	 * PriceWithTax
	 * 
	 * @param priceWithTax
	 *            Number
	 * @return {@code this}
	 */
	Price<T> priceWithTax(Object priceWithTax);

	/**
	 * The cartTotal SHOULD be the total price inclusive of all discounts,
	 * charges, and tax.
	 * 
	 * @param cartTotal
	 *            Number
	 * @return {@code this}
	 */
	Price<T> cartTotal(Object cartTotal);

	/**
	 * The transactionTotal SHOULD be the total price inclusive of all
	 * discounts, charges, and tax.
	 * 
	 * @param transactionTotal Number
	 * @return {@code this}
	 */
	Price<T> transactionTotal(Object transactionTotal);

	/**
	 * Custom Price property
	 * 
	 * @param name
	 *            Name for the custom property
	 * @param value
	 *            Value for the custom property
	 * @return {@code this}
	 */
	Price<T> custom(String name, Object value);

}