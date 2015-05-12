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

	private DigitalData parent;

	@JsonProperty
	private Segment segment;

	@JsonProperty
	private List<UserProfile> profile;

	/**
	 * Constructs an User object.
	 */
	public User() {
		super();
	}

	/**
	 * Constructs an User object.
	 * 
	 * @param parent
	 *            The parent Object
	 */
	public User(final DigitalData parent) {
		super();
		this.parent = parent;
	}

	/**
	 * Returns to the parent object.
	 * 
	 * @return parent object or {@code null} when not available
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
	 * Directly adds a new segment to the Profile.
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
	 * Adds a new profile for the user.
	 * 
	 * A profile for information about the user, typically associated with a
	 * registered user. (Although typically a user might have only a single
	 * profile, this object is an array and can capture multiple profiles per
	 * user.)
	 * 
	 * @return  a new (User)Profile object
	 */
	public UserProfile addProfile() {
		if (profile == null) {
			profile = new ArrayList<UserProfile>();
		}
		final UserProfile userProfile = new UserProfile(this);
		profile.add(userProfile);
		return userProfile;
	}
}
