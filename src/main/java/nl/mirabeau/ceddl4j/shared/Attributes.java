package nl.mirabeau.ceddl4j.shared;

/**
 * This object provides extensibility to the Parent object. All names are optional
 * and should fit the individual implementation needs in both naming and values
 * passed.
 * 
 * @param <T> Parent object type
 */
public interface Attributes<T> {

	/**
	 * Return to the parent object
	 * 
	 * @return parent object or {@code null} when not available
	 */
	T endAttributes();

	/**
	 * Custom attribute
	 * 
	 * @param name
	 *            Custom attribute name
	 * @param value
	 *            Custom attribute value
	 * @return {@code this}
	 */
	Attributes<T> attribute(String name, Object value);

}