package nl.mirabeau.ceddl4j.component;

import nl.mirabeau.ceddl4j.BaseItem;

/**
 * This object describes the component.
 */
public class ComponentInfo extends BaseItem {

	private final static String COMPONENT_ID_NAME = "componentID";

	private final Component parent;

	/**
	 * Constructs an ComponentInfo object.
	 * 
	 * @param parent
	 *            The parent Object
	 */
	public ComponentInfo(final Component parent) {
		super();
		this.parent = parent;
	}

	/**
	 * Returns to the parent Component object.
	 * 
	 * @return parent Component object
	 */
	public Component endComponentInfo() {
		return parent;
	}

	/**
	 * Sets the componentID.
	 * 
	 * @param componentID
	 *            String
	 * @return {@code this}
	 */
	public ComponentInfo componentID(final String componentID) {
		items.put(COMPONENT_ID_NAME, componentID);
		return this;
	}

	/**
	 * Sets a custom ComponentInfo property.
	 * 
	 * @param name
	 *            Custom property name
	 * @param value
	 *            Custom property value
	 * @return {@code this}
	 */
	public ComponentInfo custom(final String name, final Object value) {
		items.put(name, value);
		return this;
	}
}
