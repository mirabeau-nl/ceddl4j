package nl.mirabeau.ceddl4j.shared;

import nl.mirabeau.ceddl4j.BaseItem;

/**
 * Because of the wide range of methods for categorization, an object literal is
 * provided for categories.
 * 
 * @param <T> Parent object type
 */
public class Category<T> extends BaseItem {

	public final static String PRIMARY_CATEGORY_NAME = "primaryCategory";

	private final T parent;

	/**
	 * Constructor, sets the parent
	 * 
	 * @param parent
	 */
	public Category(final T parent) {
		super();
		this.parent = parent;
	}

	/**
	 * Return to the parent object
	 * 
	 * @return parent object
	 */
	public T endCategory() {
		return parent;
	}

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
	public Category<T> primaryCategory(final Object primaryCategory) {
		items.put(PRIMARY_CATEGORY_NAME, primaryCategory);
		return this;
	}

	/**
	 * Custom category
	 * 
	 * @param name
	 *            Custom category name
	 * @param value
	 *            Custom category value
	 * @return {@code this}
	 */
	public Category<T> category(final String name, final Object value) {
		items.put(name, value);
		return this;
	}
}