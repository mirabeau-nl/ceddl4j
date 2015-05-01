package nl.mirabeau.ceddl4j.shared;

/**
 * Because of the wide range of methods for categorization, an object literal is
 * provided for categories.
 * 
 * @param <T>
 *            Parent object type
 */
public interface Category<T> {

	final static String PRIMARY_CATEGORY_NAME = "primaryCategory";

	/**
	 * Return to the parent object
	 * 
	 * @return parent object or {@code null} when not available
	 */
	T endCategory();

	/**
	 * Set the primaryCategory.
	 * 
	 * The name primaryCategory is RECOMMENDED if you included only one set of
	 * categories for products, or for your primary set of categories.
	 * 
	 * @param primaryCategory
	 *            primaryCategory value
	 * @return {@code this}
	 */
	Category<T> primaryCategory(Object primaryCategory);

	/**
	 * Custom category
	 * 
	 * @param name
	 *            Custom category name
	 * @param value
	 *            Custom category value
	 * @return {@code this}
	 */
	Category<T> category(String name, Object value);

}