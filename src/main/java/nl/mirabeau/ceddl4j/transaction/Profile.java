package nl.mirabeau.ceddl4j.transaction;

import nl.mirabeau.ceddl4j.shared.Address;
import nl.mirabeau.ceddl4j.shared.ProfileInfo;
import nl.mirabeau.ceddl4j.shared.impl.AddressImpl;
import nl.mirabeau.ceddl4j.shared.impl.ProfileInfoImpl;

import com.google.gson.annotations.Expose;

/**
 * A profile for information about the purchaser, typically associated with a
 * registered user.
 */
public class Profile {

	private Transaction parent;

	@Expose
	private ProfileInfoImpl<Profile> profileInfo;

	@Expose
	private AddressImpl<Profile> address;

	@Expose
	private AddressImpl<Profile> shippingAddress;

	/**
	 * Constructor, does not set the parent
	 */
	public Profile() {
		super();
	}

	/**
	 * Constructor, sets the parent
	 * 
	 * @param parent
	 */
	public Profile(final Transaction parent) {
		super();
		this.parent = parent;
	}

	/**
	 * Return to the parent Transaction object
	 * 
	 * @return Transaction parent object or {@code null} when not available
	 */
	public Transaction endProfile() {
		return parent;
	}

	/**
	 * Provides access to the ProfileInfo object
	 * 
	 * An extensible object for providing information about the purchaser.
	 * 
	 * @return the ProfileInfo object for this Profile
	 */
	public ProfileInfo<Profile> profileInfo() {
		if (profileInfo == null) {
			profileInfo = new ProfileInfoImpl<Profile>(this);
		}
		return profileInfo;
	}

	/**
	 * Provides access to the Address object.
	 * 
	 * An extensible object for providing (billing) address information for the
	 * purchaser.
	 * 
	 * @return The Address object for this Profile
	 */
	public Address<Profile> address() {
		if (address == null) {
			address = new AddressImpl<Profile>(this);
		}
		return address;
	}

	/**
	 * Provides access to the Shipping Address object.
	 * 
	 * An extensible object for providing shipping address information for the
	 * purchaser.
	 * 
	 * @return The Shipping Address for this Profile
	 */
	public Address<Profile> shippingAddress() {
		if (shippingAddress == null) {
			shippingAddress = new AddressImpl<Profile>(this);
		}
		return shippingAddress;
	}

}
