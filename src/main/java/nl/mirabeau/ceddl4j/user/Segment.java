package nl.mirabeau.ceddl4j.user;

import nl.mirabeau.ceddl4j.BaseItem;

/**
 * This object provides population segmentation information for the user, such
 * as premium versus basic membership, or any other forms of segmentation that
 * are desirable. Any additional dimensions related to the user can be provided.
 * All names are optional and should fit the individual implementation needs in
 * both naming and values passed.
 */
public class Segment extends BaseItem {

	private final User parent;

	/**
	 * Constructor, sets the parent
	 * 
	 * @param parent
	 */
	public Segment(final User parent) {
		this.parent = parent;
	}

	/**
	 * Return to the parent object
	 * 
	 * @return parent object
	 */
	public User endSegment() {
		return parent;
	}

	/**
	 * Add a segment information item
	 * 
	 * @param name
	 *            Name of the segment information item
	 * @param value
	 *            value of the segment information item
	 * @return {@code this}
	 */
	public Segment segment(final String name, final Object value) {
		items.put(name, value);
		return this;
	}
}
