package nl.mirabeau.ceddl4j.privacy;

import nl.mirabeau.ceddl4j.internal.BaseItem;

/**
 * AccessCategory
 */
public class AccessCategory extends BaseItem<AccessCategory> {

	private static final String CATEGORY_NAME = "categoryName";
	private static final String DOMAINS = "domains";

	private final Privacy parent;

	/**
	 * Constructs an AccessCategory object.
	 * 
	 * @param parent
	 *            The parent Object
	 */
	public AccessCategory(final Privacy parent) {
		this.parent = parent;
	}

	/**
	 * Returns to the parent object.
	 * 
	 * @return parent object
	 */
	public Privacy endAccessCategory() {
		return parent;
	}

	/**
	 * Sets the categoryName.
	 * <p>
	 * Definition of category names to be associated with security objects with
	 * the matching name. A categoryName of Default MUST be included for privacy
	 * enforcement. All other categories are custom. Common categories include
	 * Analytics, Recommendations, and Personalization.
	 * 
	 * @param categoryName
	 *            String
	 * @return {@code this}
	 */
	public AccessCategory categoryName(final String categoryName) {
		addItem(CATEGORY_NAME, categoryName);
		return this;
	}

	/**
	 * Sets the domains.
	 * 
	 * Particular vendors associated with the particular category. This SHOULD
	 * be an array listing domains for vendors associated with the category. The
	 * Default category SHOULD contain all technologies which must be treated
	 * the same as first party for privacy purposes (e.g., a tag management
	 * technology).
	 * 
	 * @param domains
	 *            String
	 * @return {@code this}
	 */
	public AccessCategory domains(final String... domains) {
		addItem(DOMAINS, domains);
		return this;
	}

	@Override
	protected AccessCategory returnSelf() {
		return this;
	}
}
