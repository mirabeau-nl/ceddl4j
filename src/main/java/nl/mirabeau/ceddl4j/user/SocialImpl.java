package nl.mirabeau.ceddl4j.user;

import java.util.LinkedHashMap;

/**
 * An extensible object for providing social information for the user profile.
 * All names are optional and should fit the individual implementation needs in
 * both naming and values passed.
 */
public class SocialImpl extends LinkedHashMap<String, Object> implements Social {

	private static final long serialVersionUID = -25138847794874317L;

	private Profile parent;

	/**
	 * Constructor, does not set the parent
	 */
	public SocialImpl() {
		super();
	}

	/**
	 * Constructor, sets the parent
	 * 
	 * @param parent
	 */
	public SocialImpl(final Profile parent) {
		this.parent = parent;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.user.Social#endSocial()
	 */
	public Profile endSocial() {
		return parent;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.user.Social#social(java.lang.String, java.lang.Object)
	 */
	public Social social(final String name, final Object value) {
		put(name, value);
		return this;
	}

}
