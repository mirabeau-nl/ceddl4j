package nl.mirabeau.ceddl4j.user;

import nl.mirabeau.ceddl4j.internal.BaseItem;

/**
 * This object provides population segmentation information for the user, such
 * as premium versus basic membership, or any other forms of segmentation that
 * are desirable. Any additional dimensions related to the user can be provided.
 * All names are optional and should fit the individual implementation needs in
 * both naming and values passed.
 */
public class Segment extends BaseItem<Segment> {

	private final User parent;

	/**
	 * Constructs an Segment object.
	 * 
	 * @param parent
	 *            The parent Object
	 */
	public Segment(final User parent) {
		this.parent = parent;
	}

	/**
	 * Returns to the parent object.
	 * 
	 * @return parent object
	 */
	public User endSegment() {
		return parent;
	}

	/**
	 * Adds a segment information item.
	 * 
	 * @param name
	 *            Name of the segment information item
	 * @param value
	 *            value of the segment information item
	 * @return {@code this}
	 */
	public Segment segment(final String name, final Object value) {
		return custom(name, value);
	}

	@Override
	protected Segment returnSelf() {
		return this;
	}
}
