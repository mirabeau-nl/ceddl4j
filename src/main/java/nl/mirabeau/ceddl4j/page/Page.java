package nl.mirabeau.ceddl4j.page;

import nl.mirabeau.ceddl4j.DigitalData;
import nl.mirabeau.ceddl4j.shared.Attributes;
import nl.mirabeau.ceddl4j.shared.Category;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Page object carries significant details about the page, and the most
 * commonly used data elements are captured by the specification below. The Page
 * object and its children, where included, MUST have the following Object Names
 * & Types.
 */
public class Page {

	private DigitalData parent;

	@JsonProperty
	private PageInfo pageInfo;

	@JsonProperty
	private Category<Page> category;

	@JsonProperty
	private Attributes<Page> attributes;

	/**
	 * Constructs a Page object
	 * 
	 * @param parent
	 *            The parent Object
	 */
	public Page(final DigitalData parent) {
		super();
		this.parent = parent;
	}

	/**
	 * Constructs a Page object
	 */
	public Page() {
		super();
	}

	/**
	 * Returns to the parent object.
	 * 
	 * @return  DigitalData parent object or {@code null} when not available
	 */
	public DigitalData endPage() {
		return parent;
	}

	/**
	 * Provides access to the PageInfo object.
	 * 
	 * PageInfo describes details about the page.
	 * 
	 * @return the PageInfo object for this Page
	 */
	public PageInfo pageInfo() {
		if (pageInfo == null) {
			pageInfo = new PageInfo(this);
		}
		return pageInfo;
	}

	/**
	 * Provides access to the Category object for the Page.
	 * 
	 * Because of the wide range of methods for categorization, an object
	 * literal is provided for page categories. The name primaryCategory is
	 * RECOMMENDED if you included only one set of categories for pages, or for
	 * your primary set of categories. All other names are optional and should
	 * fit the individual implementation needs in both naming and values passed.
	 * 
	 * @return Category object for the Page
	 */
	public Category<Page> category() {
		if (category == null) {
			category = new Category<Page>(this);
		}
		return category;
	}

	/**
	 * Provides access to the Attributes object for the Page.
	 * 
	 * This object provides extensibility to the Page object. All names are
	 * optional and should fit the individual implementation needs in both
	 * naming and values passed.
	 * 
	 * @return Attributes object for the Page
	 */
	public Attributes<Page> attributes() {
		if (attributes == null) {
			attributes = new Attributes<Page>(this);
		}
		return attributes;
	}

	/**
	 * Directly adds a new attribute to the Page's attributes
	 * 
	 * @param name Name of the attribute
	 * @param value Value for the attribute
	 * @return  {@code this}
	 */
	public Page addAttribute(final String name, final Object value) {
		if (attributes == null) {
			attributes = new Attributes<Page>(this);
		}
		attributes.attribute(name, value);
		return this;
	}

	/**
	 * Directly adds the primary category to the Page's categories
	 * 
	 * @param primaryCategory Value for the primary category
	 * @return  {@code this}
	 */
	public Page addPrimaryCategory(final String primaryCategory) {
		if (category == null) {
			category = new Category<Page>(this);
		}
		category.primaryCategory(primaryCategory);
		return this;
	}

	/**
	 * Directly adds a custom category to the Page's categories
	 * 
	 * @param name Name of the category
	 * @param value Value for the attribute
	 * @return  {@code this}
	 */
	public Page addCategory(final String name, final Object value) {
		if (category == null) {
			category = new Category<Page>(this);
		}
		category.category(name, value);
		return this;
	}
}
