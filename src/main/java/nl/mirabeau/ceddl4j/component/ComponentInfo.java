package nl.mirabeau.ceddl4j.component;

import nl.mirabeau.ceddl4j.internal.BaseItem;

/**
 * This object describes the component.
 */
public class ComponentInfo extends BaseItem<ComponentInfo> {

	private static final String COMPONENT_ID_NAME = "componentID";

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
		addItem(COMPONENT_ID_NAME, componentID);
		return this;
	}

	@Override
	protected ComponentInfo returnSelf() {
		return this;
	}
}
