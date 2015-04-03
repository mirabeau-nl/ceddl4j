package nl.mirabeau.ceddl4j.shared.impl;

import java.util.LinkedHashMap;

import nl.mirabeau.ceddl4j.shared.ProfileInfo;

/**
 * An extensible object for providing information about the user.
 *
 * @param <T> Parent object type
 */
public class ProfileInfoImpl<T> extends LinkedHashMap<String, Object> implements ProfileInfo<T> {

	private static final long serialVersionUID = 3295729516260758193L;

	private static final String PROFILE_ID = "profileID";
	private static final String USER_NAME = "userName";
	private static final String EMAIL = "email";
	private static final String LANGUAGE = "language";
	private static final String RETURNING_STATUS = "returningStatus";
	private static final String TYPE = "type";

	private T parent;

	/**
	 * Constructor, does not set the parent
	 */
	public ProfileInfoImpl() {
		super();
	}

	/**
	 * Constructor, sets the parent
	 * 
	 * @param parent
	 */
	public ProfileInfoImpl(final T parent) {
		super();
		this.parent = parent;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.shared.IProfileInfo#endProfileInfo()
	 */
	public T endProfileInfo() {
		return parent;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.shared.IProfileInfo#profileID(java.lang.String)
	 */
	public ProfileInfo<T> profileID(final Object profileID) {
		put(PROFILE_ID, profileID);
		return this;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.shared.IProfileInfo#userName(java.lang.String)
	 */
	public ProfileInfo<T> userName(final Object userName) {
		put(USER_NAME, userName);
		return this;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.shared.IProfileInfo#email(java.lang.String)
	 */
	public ProfileInfo<T> email(final Object email) {
		put(EMAIL, email);
		return this;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.shared.IProfileInfo#language(java.lang.String)
	 */
	public ProfileInfo<T> language(final Object language) {
		put(LANGUAGE, language);
		return this;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.shared.IProfileInfo#returningStatus(java.lang.String)
	 */
	public ProfileInfo<T> returningStatus(final Object returningStatus) {
		put(RETURNING_STATUS, returningStatus);
		return this;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.shared.IProfileInfo#type(java.lang.String)
	 */
	public ProfileInfo<T> type(final Object type) {
		put(TYPE, type);
		return this;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.shared.IProfileInfo#custom(java.lang.String, java.lang.String)
	 */
	public ProfileInfo<T> custom(final String name, final Object value) {
		put(name, value);
		return this;
	}
}