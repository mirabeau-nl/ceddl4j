package nl.mirabeau.ceddl4j.shared;

import nl.mirabeau.ceddl4j.BaseItem;

/**
 * An extensible object for providing information about the user.
 *
 * @param <T> Parent object type
 */
public class ProfileInfo<T> extends BaseItem {

	private static final String PROFILE_ID = "profileID";
	private static final String USER_NAME = "userName";
	private static final String EMAIL = "email";
	private static final String LANGUAGE = "language";
	private static final String RETURNING_STATUS = "returningStatus";
	private static final String TYPE = "type";

	private final T parent;

	/**
	 * Constructor, sets the parent
	 * 
	 * @param parent
	 */
	public ProfileInfo(final T parent) {
		super();
		this.parent = parent;
	}

	/**
	 * Return to the parent object
	 * 
	 * @return parent object
	 */
	public T endProfileInfo() {
		return parent;
	}

	/**
	 * profileID
	 * 
	 * @param profileID String
	 * @return {@code this}
	 */
	public ProfileInfo<T> profileID(final String profileID) {
		items.put(PROFILE_ID, profileID);
		return this;
	}

	/**
	 * userName
	 * 
	 * @param userName String
	 * @return {@code this}
	 */
	public ProfileInfo<T> userName(final String userName) {
		items.put(USER_NAME, userName);
		return this;
	}

	/**
	 * email
	 * 
	 * @param email String
	 * @return {@code this}
	 */
	public ProfileInfo<T> email(final String email) {
		items.put(EMAIL, email);
		return this;
	}

	/**
	 * language
	 * 
	 * @param language String
	 * @return {@code this}
	 */
	public ProfileInfo<T> language(final String language) {
		items.put(LANGUAGE, language);
		return this;
	}

	/**
	 * returningStatus
	 * 
	 * @param returningStatus String
	 * @return {@code this}
	 */
	public ProfileInfo<T> returningStatus(final String returningStatus) {
		items.put(RETURNING_STATUS, returningStatus);
		return this;
	}

	/**
	 * type
	 * 
	 * @param type String
	 * @return {@code this}
	 */
	public ProfileInfo<T> type(final String type) {
		items.put(TYPE, type);
		return this;
	}

	/**
	 * Custom ProfileInfo property
	 * 
	 * @param name Name for the custom property
	 * @param value Value for the custom property
	 * @return {@code this}
	 */
	public ProfileInfo<T> custom(final String name, final Object value) {
		items.put(name, value);
		return this;
	}
}