package nl.mirabeau.ceddl4j.user;

import nl.mirabeau.ceddl4j.shared.Address;
import nl.mirabeau.ceddl4j.shared.Attributes;
import nl.mirabeau.ceddl4j.shared.ProfileInfo;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A profile for information about the user, typically associated with a
 * registered user.
 */
public class UserProfile {

	private final User parent;

	@JsonProperty
	private ProfileInfo<UserProfile> profileInfo;

	@JsonProperty
	private Address<UserProfile> address;

	@JsonProperty
	private Social social;

	@JsonProperty
	private Attributes<UserProfile> attributes;

	/**
	 * Constructs an (User)Profile object.
	 * 
	 * @param parent
	 *            The parent Object
	 */
	public UserProfile(final User parent) {
		super();
		this.parent = parent;
	}

	/**
	 * Returns to the parent object.
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
	public ProfileInfo<UserProfile> profileInfo() {
		if (profileInfo == null) {
			profileInfo = new ProfileInfo<>(this);
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
	public Address<UserProfile> address() {
		if (address == null) {
			address = new Address<>(this);
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
			social = new Social(this);
		}
		return social;
	}

	/**
	 * Directly adds new social information to the Profile.
	 * 
	 * @param name
	 *            Name of the social information
	 * @param value
	 *            Value for the social information
	 * @return {@code this}
	 */
	public UserProfile addSocial(final String name, final String value) {
		if (social == null) {
			social = new Social(this);
		}
		social.social(name, value);
		return this;
	}

	/**
	 * Provides access to the attributes object for the user profile.
	 * 
	 * This object provides extensibility to the profile.
	 * 
	 * @return Attributes object for the Profile
	 */
	public Attributes<UserProfile> attributes() {
		if (attributes == null) {
			attributes = new Attributes<>(this);
		}
		return attributes;
	}

	/**
	 * Directly adds a new attribute to the Profile's Attributes
	 * 
	 * @param name
	 *            Name of the attribute
	 * @param value
	 *            Value for the attribute
	 * @return {@code this}
	 */
	public UserProfile addAttribute(final String name, final String value) {
		if (attributes == null) {
			attributes = new Attributes<>(this);
		}
		attributes.attribute(name, value);
		return this;
	}
}
