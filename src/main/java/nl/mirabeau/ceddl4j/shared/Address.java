package nl.mirabeau.ceddl4j.shared;

import nl.mirabeau.ceddl4j.internal.BaseItem;

/**
 * An extensible object for providing address information for the user.
 * 
 * @param <T>
 *            Parent object type
 */
public class Address<T> extends BaseItem<Address<T>> {

	private static final String LINE1 = "line1";
	private static final String LINE2 = "line2";
	private static final String CITY = "city";
	private static final String STATE_PROVINCE = "stateProvince";
	private static final String POSTAL_CODE = "postalCode";
	private static final String COUNTRY = "country";

	private final T parent;

	/**
	 * Constructs an Address object
	 * 
	 * @param parent
	 *            The parent Object
	 */
	public Address(final T parent) {
		super();
		this.parent = parent;
	}

	/**
	 * Returns to the parent object
	 * 
	 * @return parent object
	 */
	public T endAddress() {
		return parent;
	}

	/**
	 * Sets the address line 1
	 * 
	 * @param line1
	 *            String
	 * @return {@code this}
	 */
	public Address<T> line1(final String line1) {
		addItem(LINE1, line1);
		return this;
	}

	/**
	 * Sets address line 2
	 * 
	 * @param line2
	 *            String
	 * @return {@code this}
	 */
	public Address<T> line2(final String line2) {
		addItem(LINE2, line2);
		return this;
	}

	/**
	 * Sets the city
	 * 
	 * @param city
	 *            String
	 * @return {@code this}
	 */
	public Address<T> city(final String city) {
		addItem(CITY, city);
		return this;
	}

	/**
	 * Sets the state or province
	 * 
	 * @param stateProvince
	 *            String
	 * @return {@code this}
	 */
	public Address<T> stateProvince(final String stateProvince) {
		addItem(STATE_PROVINCE, stateProvince);
		return this;
	}

	/**
	 * Sets the postalCode
	 * 
	 * @param postalCode
	 *            String
	 * @return {@code this}
	 */
	public Address<T> postalCode(final String postalCode) {
		addItem(POSTAL_CODE, postalCode);
		return this;
	}

	/**
	 * Sets the country
	 * 
	 * @param country
	 *            String
	 * @return {@code this}
	 */
	public Address<T> country(final String country) {
		addItem(COUNTRY, country);
		return this;
	}

	@Override
	protected Address<T> returnSelf() {
		return this;
	}
}
