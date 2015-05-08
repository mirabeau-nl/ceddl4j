package nl.mirabeau.ceddl4j.shared;

import nl.mirabeau.ceddl4j.BaseItem;

/**
 * An extensible object for providing address information for the user.
 *
 * @param <T> Parent object type
 */
public class Address<T> extends BaseItem {

	private static final String LINE1 = "line1";
	private static final String LINE2 = "line2";
	private static final String CITY = "city";
	private static final String STATE_PROVINCE = "stateProvince";
	private static final String POSTAL_CODE = "postalCode";
	private static final String COUNTRY = "country";

	private final T parent;

	/**
	 * Constructor, sets the parent
	 * 
	 * @param parent
	 */
	public Address(final T parent) {
		super();
		this.parent = parent;
	}

	/**
	 * Return to the parent object
	 * 
	 * @return parent object
	 */
	public T endAddress() {
		return parent;
	}

	/**
	 * Address line 1
	 * 
	 * @param line1
	 *            String
	 * @return {@code this}
	 */
	public Address<T> line1(final Object line1) {
		items.put(LINE1, line1);
		return this;
	}

	/**
	 * Address line 2
	 * 
	 * @param line2
	 *            String
	 */
	public Address<T> line2(final Object line2) {
		items.put(LINE2, line2);
		return this;
	}

	/**
	 * @param city
	 * @return {@code this}
	 */
	public Address<T> city(final Object city) {
		items.put(CITY, city);
		return this;
	}

	/**
	 * State or Province
	 * 
	 * @param stateProvince
	 *            String
	 * @return {@code this}
	 */
	public Address<T> stateProvince(final Object stateProvince) {
		items.put(STATE_PROVINCE, stateProvince);
		return this;
	}

	/**
	 * PostalCode
	 * 
	 * @param postalCode
	 *            String
	 * @return {@code this}
	 */
	public Address<T> postalCode(final Object postalCode) {
		items.put(POSTAL_CODE, postalCode);
		return this;
	}

	/**
	 * Country
	 * 
	 * @param country
	 *            String
	 * @return {@code this}
	 */
	public Address<T> country(final Object country) {
		items.put(COUNTRY, country);
		return this;
	}

	/**
	 * Custom Address property
	 * 
	 * @param name
	 *            Custom property name
	 * @param value
	 *            Custom property value
	 * @return {@code this}
	 */
	public Address<T> custom(final String name, final Object value) {
		items.put(name, value);
		return this;
	}
}
