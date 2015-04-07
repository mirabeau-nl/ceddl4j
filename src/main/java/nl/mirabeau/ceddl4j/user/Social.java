package nl.mirabeau.ceddl4j.user;

/**
 * An extensible object for providing social information for the user profile.
 * All names are optional and should fit the individual implementation needs in
 * both naming and values passed.
 */
public interface Social {

	/**
	 * Return to the parent object
	 * 
	 * @return parent object or {@code null} when not available
	 */
	Profile endSocial();

	/**
	 * Add a social information item
	 * 
	 * @param name Name of the social information item
	 * @param value value of the social information item
	 * @return {@code this}
	 */
	Social social(String name, Object value);

}