package nl.mirabeau.ceddl4j.shared;

import nl.mirabeau.ceddl4j.internal.BaseItem;

/**
 * An extensible object for providing information about the user.
 *
 * @param <T> Parent object type
 */
public class ProfileInfo<T> extends BaseItem<ProfileInfo<T>> {

	private static final String PROFILE_ID = "profileID";
	private static final String USER_NAME = "userName";
	private static final String EMAIL = "email";
	private static final String LANGUAGE = "language";
	private static final String RETURNING_STATUS = "returningStatus";
	private static final String TYPE = "type";

	private final T parent;

	/**
	 * Constructs a ProfileInfo object.
	 * 
	 * @param parent The parent object
	 */
	public ProfileInfo(final T parent) {
		super();
		this.parent = parent;
	}

	/**
	 * Returns to the parent object.
	 * 
	 * @return parent object
	 */
	public T endProfileInfo() {
		return parent;
	}

	/**
	 * Sets the profileID.
	 * 
	 * @param profileID String
	 * @return {@code this}
	 */
	public ProfileInfo<T> profileID(final String profileID) {
		addItem(PROFILE_ID, profileID);
		return this;
	}

	/**
	 * Sets the userName.
	 * 
	 * @param userName String
	 * @return {@code this}
	 */
	public ProfileInfo<T> userName(final String userName) {
		addItem(USER_NAME, userName);
		return this;
	}

	/**
	 * Sets the email.
	 * 
	 * @param email String
	 * @return {@code this}
	 */
	public ProfileInfo<T> email(final String email) {
		addItem(EMAIL, email);
		return this;
	}

	/**
	 * Sets the language.
	 * 
	 * @param language String
	 * @return {@code this}
	 */
	public ProfileInfo<T> language(final String language) {
		addItem(LANGUAGE, language);
		return this;
	}

	/**
	 * Sets the returningStatus.
	 * 
	 * @param returningStatus String
	 * @return {@code this}
	 */
	public ProfileInfo<T> returningStatus(final String returningStatus) {
		addItem(RETURNING_STATUS, returningStatus);
		return this;
	}

	/**
	 * Sets the type.
	 * 
	 * @param type String
	 * @return {@code this}
	 */
	public ProfileInfo<T> type(final String type) {
		addItem(TYPE, type);
		return this;
	}

	@Override
	protected ProfileInfo<T> returnSelf() {
		return this;
	}
}