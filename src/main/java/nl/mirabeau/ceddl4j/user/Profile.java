package nl.mirabeau.ceddl4j.user;

import nl.mirabeau.ceddl4j.shared.Address;
import nl.mirabeau.ceddl4j.shared.Attributes;
import nl.mirabeau.ceddl4j.shared.ProfileInfo;
import nl.mirabeau.ceddl4j.shared.impl.AddressImpl;
import nl.mirabeau.ceddl4j.shared.impl.AttributesImpl;
import nl.mirabeau.ceddl4j.shared.impl.ProfileInfoImpl;

import com.google.gson.annotations.Expose;

/**
 * A profile for information about the user, typically associated with a
 * registered user.
 */
public class Profile {

	private User parent;

	@Expose
	private ProfileInfoImpl<Profile> profileInfo;

	@Expose
	private AddressImpl<Profile> address;

	@Expose
	private SocialImpl social;

	@Expose
	private AttributesImpl<Profile> attributes;

	/**
	 * Constructor, does not set the parent.
	 */
	public Profile() {
		super();
	}

	/**
	 * Constructor, sets the parent
	 * 
	 * @param parent
	 *            User parent Object
	 */
	public Profile(final User parent) {
		super();
		this.parent = parent;
	}

	/**
	 * Return to the parent User object
	 * 
	 * @return User parent object or {@code null} when not available
	 */
	public User endProfile() {
		return parent;
	}

	/**
	 * Provides access to the ProfileInfo object for the user profile.
	 * 
	 * An extensible object for providing information about the user.
	 * 
	 * @return ProfileInfo object for the Profile
	 */
	public ProfileInfo<Profile> profileInfo() {
		if (profileInfo == null) {
			profileInfo = new ProfileInfoImpl<Profile>(this);
		}
		return profileInfo;
	}

	/**
	 * Provides access to the address information object for the user profile.
	 * 
	 * An extensible object for providing address information for the user.
	 * 
	 * @return Address object for the Profile
	 */
	public Address<Profile> address() {
		if (address == null) {
			address = new AddressImpl<Profile>(this);
		}
		return address;
	}

	/**
	 * Provides access to the social information object for the user profile.
	 * 
	 * An extensible object for providing social information for the user
	 * profile.
	 * 
	 * @return Social object for the Profile
	 */
	public Social social() {
		if (social == null) {
			social = new SocialImpl(this);
		}
		return social;
	}

	/**
	 * Directly add new social information to the Profile
	 * 
	 * @param name
	 *            Name of the social information
	 * @param value
	 *            Value for the social information
	 * @return {@code this}
	 */
	public Profile addSocial(final String name, final String value) {
		if (social == null) {
			social = new SocialImpl(this);
		}
		social.social(name, value);
		return this;
	}

	/**
	 * Gives access to the attributes object for the user profile.
	 * 
	 * This object provides extensibility to the profile.
	 * 
	 * @return Attributes object for the Profile
	 */
	public Attributes<Profile> attributes() {
		if (attributes == null) {
			attributes = new AttributesImpl<Profile>(this);
		}
		return attributes;
	}

	/**
	 * Directly add a new attribute to the Profile's Attributes
	 * 
	 * @param name
	 *            Name of the attribute
	 * @param value
	 *            Value for the attribute
	 * @return {@code this}
	 */
	public Profile addAttribute(final String name, final String value) {
		if (attributes == null) {
			attributes = new AttributesImpl<Profile>(this);
		}
		attributes.attribute(name, value);
		return this;
	}
}
