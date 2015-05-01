package nl.mirabeau.ceddl4j.shared;

/**
 * An extensible object for providing information about the user.
 *
 * @param <T> Parent object type
 */
public interface ProfileInfo<T> {

	/**
	 * Return to the parent object
	 * 
	 * @return parent object
	 */
	T endProfileInfo();

	/**
	 * profileID
	 * 
	 * @param profileID String
	 * @return {@code this}
	 */
	ProfileInfo<T> profileID(Object profileID);

	/**
	 * userName
	 * 
	 * @param userName String
	 * @return {@code this}
	 */
	ProfileInfo<T> userName(Object userName);

	/**
	 * email
	 * 
	 * @param email String
	 * @return {@code this}
	 */
	ProfileInfo<T> email(Object email);

	/**
	 * language
	 * 
	 * @param language String
	 * @return {@code this}
	 */
	ProfileInfo<T> language(Object language);

	/**
	 * returningStatus
	 * 
	 * @param returningStatus String
	 * @return {@code this}
	 */
	ProfileInfo<T> returningStatus(Object returningStatus);

	/**
	 * type
	 * 
	 * @param type String
	 * @return {@code this}
	 */
	ProfileInfo<T> type(Object type);

	/**
	 * Custom ProfileInfo property
	 * 
	 * @param name Name for the custom property
	 * @param value Value for the custom property
	 * @return {@code this}
	 */
	ProfileInfo<T> custom(String name, Object value);

}