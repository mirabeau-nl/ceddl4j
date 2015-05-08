package nl.mirabeau.ceddl4j.user;

import nl.mirabeau.ceddl4j.BaseItem;

/**
 * An extensible object for providing social information for the user profile.
 * All names are optional and should fit the individual implementation needs in
 * both naming and values passed.
 */
public class Social extends BaseItem {

	private final Profile parent;

	/**
	 * Constructor, sets the parent
	 * 
	 * @param parent
	 */
	public Social(final Profile parent) {
		this.parent = parent;
	}

	/**
	 * Return to the parent object
	 * 
	 * @return parent object
	 */
	public Profile endSocial() {
		return parent;
	}

	/**
	 * Add a social information item
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
