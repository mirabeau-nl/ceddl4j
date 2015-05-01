package nl.mirabeau.ceddl4j.shared.impl;

import java.util.LinkedHashMap;

import nl.mirabeau.ceddl4j.shared.Address;

/**
 * An extensible object for providing address information for the user.
 *
 * @param <T> Parent object type
 */
public class AddressImpl<T> extends LinkedHashMap<String, Object> implements Address<T> {

	private static final long serialVersionUID = 3295729516260758193L;

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
	public AddressImpl(final T parent) {
		super();
		this.parent = parent;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.shared.Address#endAddress()
	 */
	public T endAddress() {
		return parent;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.shared.Address#line1(java.lang.String)
	 */
	public Address<T> line1(final Object line1) {
		put(LINE1, line1);
		return this;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.shared.Address#line2(java.lang.String)
	 */
	public Address<T> line2(final Object line2) {
		put(LINE2, line2);
		return this;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.shared.Address#city(java.lang.String)
	 */
	public Address<T> city(final Object city) {
		put(CITY, city);
		return this;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.shared.Address#stateProvince(java.lang.String)
	 */
	public Address<T> stateProvince(final Object stateProvince) {
		put(STATE_PROVINCE, stateProvince);
		return this;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.shared.Address#postalCode(java.lang.String)
	 */
	public Address<T> postalCode(final Object postalCode) {
		put(POSTAL_CODE, postalCode);
		return this;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.shared.Address#country(java.lang.String)
	 */
	public Address<T> country(final Object country) {
		put(COUNTRY, country);
		return this;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.shared.Address#custom(java.lang.String, java.lang.String)
	 */
	public Address<T> custom(final String name, final Object value) {
		put(name, value);
		return this;
	}
}
