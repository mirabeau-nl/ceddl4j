package nl.mirabeau.ceddl4j.component;

import java.util.LinkedHashMap;

/**
 * This object describes the component.
 */
public class ComponentInfoImpl extends LinkedHashMap<String, Object> implements ComponentInfo {

	private static final long serialVersionUID = -3019902756647091451L;

	private final static String COMPONENT_ID_NAME = "componentID";

	private final Component parent;

	/**
	 * Constructor, sets the parent
	 * 
	 * @param parent
	 */
	public ComponentInfoImpl(final Component parent) {
		super();
		this.parent = parent;
	}


	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.component.IComponentInfo#endComponentInfo()
	 */
	public Component endComponentInfo() {
		return parent;
	}


	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.component.ComponentInfo#componentID(java.lang.String)
	 */
	public ComponentInfoImpl componentID(final String componentID) {
		put(COMPONENT_ID_NAME, componentID);
		return this;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.component.IComponentInfo#custom(java.lang.String, java.lang.Object)
	 */
	public ComponentInfoImpl custom(final String name, final Object value) {
		put(name, value);
		return this;
	}


}
