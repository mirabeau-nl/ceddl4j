package nl.mirabeau.ceddl4j.component;

/**
 * This object describes the component.
 */
public interface ComponentInfo {

	/**
	 * Return to the parent Component object
	 * 
	 * @return parent Component object or {@code null} when not available
	 */
	Component endComponentInfo();

	/**
	 * componentID
	 * 
	 * @param componentID String
	 * @return {@code this}
	 */
	ComponentInfoImpl componentID(String componentID);

	/**
	 * Custom ComponentInfo property
	 * 
	 * @param name Custom property name
	 * @param value Custom property value
	 * @return {@code this}
	 */
	ComponentInfoImpl custom(String name, Object value);

}