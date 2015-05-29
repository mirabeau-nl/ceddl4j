package nl.mirabeau.ceddl4j.shared;

import nl.mirabeau.ceddl4j.internal.BaseItem;

/**
 * Because of the wide range of methods for categorization, an object literal is
 * provided for categories.
 * 
 * @param <T> Parent object type
 */
public class Category<T> extends BaseItem<Category<T>> {

	public final static String PRIMARY_CATEGORY_NAME = "primaryCategory";

	private final T parent;

	/**
	 * Constructs a Category object
	 * 
	 * @param parent The parent object
	 */
	public Category(final T parent) {
		super();
		this.parent = parent;
	}

	/**
	 * Returns to the parent object
	 * 
	 * @return parent object
	 */
	public T endCategory() {
		return parent;
	}

	/**
	 * Sets the primaryCategory.
	 * 
	 * The name primaryCategory is RECOMMENDED if you included only one set of
	 * categories for products, or for your primary set of categories.
	 * 
	 * @param primaryCategory
	 *            primaryCategory value
	 * @return {@code this}
	 */
	public Category<T> primaryCategory(final String primaryCategory) {
		return custom(PRIMARY_CATEGORY_NAME, primaryCategory);
	}

	/**
	 * Sets a custom category
	 * 
	 * @param name
	 *            Custom category name
	 * @param value
	 *            Custom category value
	 * @return {@code this}
	 */
	public Category<T> category(final String name, final Object value) {
		return custom(name, value);
	}

	@Override
	protected Category<T> returnSelf() {
		return this;
	}
}