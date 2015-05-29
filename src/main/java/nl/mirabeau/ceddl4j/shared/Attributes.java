package nl.mirabeau.ceddl4j.shared;

import nl.mirabeau.ceddl4j.internal.BaseItem;

/**
 * This object provides extensibility to the Parent object. All names are optional
 * and should fit the individual implementation needs in both naming and values
 * passed.
 * 
 * @param <T> Parent object type
 */
public class Attributes<T> extends BaseItem<Attributes<T>> {

	private final T parent;

	/**
	 * Constructs an Attributes object
	 * 
	 * @param parent The parent object
	 */
	public Attributes(final T parent) {
		this.parent = parent;
	}

	/**
	 * Returns to the parent object
	 * 
	 * @return parent object

	 */
	public T endAttributes() {
		return parent;
	}

	/**
	 * Sets a custom attribute
	 * 
	 * @param name
	 *            Custom attribute name
	 * @param value
	 *            Custom attribute value
	 * @return {@code this}
	 */
	public Attributes<T> attribute(final String name, final Object value) {
		addItem(name, value);
		return this;
	}

	@Override
	protected Attributes<T> returnSelf() {
		return this;
	}
}
