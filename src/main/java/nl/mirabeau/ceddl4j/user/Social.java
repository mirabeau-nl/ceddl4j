package nl.mirabeau.ceddl4j.user;

import nl.mirabeau.ceddl4j.BaseItem;

/**
 * An extensible object for providing social information for the user profile.
 * All names are optional and should fit the individual implementation needs in
 * both naming and values passed.
 */
public class Social extends BaseItem {

	private final UserProfile parent;

	/**
	 * Constructs an Social object.
	 * 
	 * @param parent
	 *            The parent Object
	 */
	public Social(final UserProfile parent) {
		this.parent = parent;
	}

	/**
	 * Returns to the parent object.
	 * 
	 * @return parent object
	 */
	public UserProfile endSocial() {
		return parent;
	}

	/**
	 * Adds a social information item.
	 * 
	 * @param name Name of the social information item
	 * @param value value of the social information item
	 * @return {@code this}
	 */
	public Social social(final String name, final Object value) {
		items.put(name, value);
		return this;
	}
}
