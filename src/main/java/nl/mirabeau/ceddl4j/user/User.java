package nl.mirabeau.ceddl4j.user;

import java.util.ArrayList;
import java.util.List;

import nl.mirabeau.ceddl4j.DigitalData;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The User object captures the profile of a user who is interacting with the
 * website.
 */
public class User {

	private final DigitalData parent;

	@JsonProperty
	private Segment segment;

	@JsonProperty
	private List<Profile> profile;

	/**
	 * Constructor. Sets the parent.
	 * 
	 * @param parent
	 */
	public User(final DigitalData parent) {
		super();
		this.parent = parent;
	}

	/**
	 * Return to the parent DigitalData object
	 * 
	 * @return parent DigitalData object or {@code null} when not available
	 */
	public DigitalData endUser() {
		return parent;
	}

	/**
	 * Provides access to the segment object.
	 * 
	 * This object provides population segmentation information for the user,
	 * such as premium versus basic membership, or any other forms of
	 * segmentation that are desirable. Any additional dimensions related to the
	 * user can be provided. All names are optional and should fit the
	 * individual implementation needs in both naming and values passed.
	 * 
	 * @return Attributes object
	 */
	public Segment segment() {
		if (segment == null) {
			segment = new Segment(this);
		}
		return segment;
	}

	/**
	 * Directly add a new segment to the Profile.
	 * 
	 * @param name
	 *            Name of the segment
	 * @param value
	 *            Value for the segment
	 * @return {@code this}
	 */
	public User addSegment(final String name, final String value) {
		if (segment == null) {
			segment = new Segment(this);
		}
		segment.segment(name, value);
		return this;
	}

	/**
	 * Add a new profile for the user.
	 * 
	 * A profile for information about the user, typically associated with a
	 * registered user. (Although typically a user might have only a single
	 * profile, this object is an array and can capture multiple profiles per
	 * user.)
	 * 
	 * @return  a new Profile object
	 */
	public Profile addProfile() {
		if (profile == null) {
			profile = new ArrayList<Profile>();
		}
		final Profile userProfile = new Profile(this);
		profile.add(userProfile);
		return userProfile;
	}
}
