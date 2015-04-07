package nl.mirabeau.ceddl4j.shared.impl;

import java.util.LinkedHashMap;

import nl.mirabeau.ceddl4j.shared.Category;

/**
 * Because of the wide range of methods for categorization, an object literal is
 * provided for categories.
 * 
 * @param <T> Parent object type
 */
public class CategoryImpl<T> extends LinkedHashMap<String, Object> implements Category<T> {

	private static final long serialVersionUID = -3019902756647091451L;

	private T parent;

	/**
	 * Constructor, does not set the parent
	 */
	public CategoryImpl() {
		super();
	}

	/**
	 * Constructor, sets the parent
	 * 
	 * @param parent
	 */
	public CategoryImpl(final T parent) {
		super();
		this.parent = parent;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.shared.Category#endCategory()
	 */
	public T endCategory() {
		return parent;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.shared.Category#primaryCategory(java.lang.String)
	 */
	public Category<T> primaryCategory(final Object primaryCategory) {
		put(PRIMARY_CATEGORY_NAME, primaryCategory);
		return this;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.shared.Category#category(java.lang.String, java.lang.String)
	 */
	public Category<T> category(final String name, final Object value) {
		put(name, value);
		return this;
	}
}