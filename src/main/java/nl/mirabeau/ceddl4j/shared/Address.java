package nl.mirabeau.ceddl4j.shared;

/**
 * An extensible object for providing address information for the user.
 * 
 * @param <T>
 *            Parent object type
 */
public interface Address<T> {

	/**
	 * Return to the parent object
	 * 
	 * @return parent object
	 */
	T endAddress();

	/**
	 * Address line 1
	 * 
	 * @param line1
	 *            String
	 * @return {@code this}
	 */
	Address<T> line1(Object line1);

	/**
	 * Address line 2
	 * 
	 * @param line2
	 *            String
	 */
	Address<T> line2(Object line2);

	/**
	 * @param city
	 * @return {@code this}
	 */
	Address<T> city(Object city);

	/**
	 * State or Province
	 * 
	 * @param stateProvince
	 *            String
	 * @return {@code this}
	 */
	Address<T> stateProvince(Object stateProvince);

	/**
	 * PostalCode
	 * 
	 * @param postalCode
	 *            String
	 * @return {@code this}
	 */
	Address<T> postalCode(Object postalCode);

	/**
	 * Country
	 * 
	 * @param country
	 *            String
	 * @return {@code this}
	 */
	Address<T> country(Object country);

	/**
	 * Custom Address property
	 * 
	 * @param name
	 *            Custom property name
	 * @param value
	 *            Custom property value
	 * @return {@code this}
	 */
	Address<T> custom(String name, Object value);

}