package nl.mirabeau.ceddl4j.component;

import nl.mirabeau.ceddl4j.DigitalData;
import nl.mirabeau.ceddl4j.shared.Attributes;
import nl.mirabeau.ceddl4j.shared.Category;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Component object is intended to capture information about a content
 * component included as part of a page, such as a video. Interactions with the
 * component such as playing the video would be an Event.
 */
public class Component {

	private DigitalData parent;

	@JsonProperty
	private ComponentInfo componentInfo;

	@JsonProperty
	private Category<Component> category;

	@JsonProperty
	private Attributes<Component> attributes;

	/**
	 * Constructor. Sets the parent.
	 * 
	 * @param parent
	 */
	public Component(final DigitalData parent) {
		super();
		this.parent = parent;
	}

	/**
	 * Constructor. Does not set the parent.
	 */
	public Component() {
		super();
	}

	/**
	 * Return to the parent DigitalData object.
	 * 
	 * @return DigitalData parent object or {@code null} when not available
	 */
	public DigitalData endComponent() {
		return parent;
	}

	/**
	 * Provides access to the ComnponentInfo object.
	 * 
	 * ComponentInfo describes the component.
	 * 
	 * @return the ComponentInfo object for this Component
	 */
	public ComponentInfo componentInfo() {
		if (componentInfo == null) {
			componentInfo = new ComponentInfo(this);
		}
		return componentInfo;
	}

	/**
	 * Provides access to the Category object for the Component.
	 * 
	 * Because of the wide range of methods for categorization, an object
	 * literal is provided for component categories.
	 * 
	 * @return Category object for the Component
	 */
	public Category<Component> category() {
		if (category == null) {
			category = new Category<Component>(this);
		}
		return category;
	}

	/**
	 * Provides access to the Attributes object for the Component.
	 * 
	 * This object provides extensibility to each component. Any additional
	 * dimensions related to the component can be provided. All names are
	 * optional and should fit the individual implementation needs in both
	 * naming and values passed.
	 * 
	 * @return Attributes object for the Component
	 */
	public Attributes<Component> attributes() {
		if (attributes == null) {
			attributes = new Attributes<Component>(this);
		}
		return attributes;
	}

	/**
	 * Directly add a new attribute to the Component's attributes
	 * 
	 * @param name Name of the attribute
	 * @param value Value for the attribute
	 * @return {@code this}
	 */
	public Component addAttribuut(final String name, final Object value) {
		if (attributes == null) {
			attributes = new Attributes<Component>(this);
		}
		attributes.attribute(name, value);
		return this;
	}

	/**
	 * Directly add the primary category to the Component's categories.
	 * 
	 * @param primaryCategory Value for the primary category
	 * @return  {@code this}
	 */
	public Component addPrimaryCategory(final String primaryCategory) {
		if (category == null) {
			category = new Category<Component>(this);
		}

		category.category(Category.PRIMARY_CATEGORY_NAME, primaryCategory);
		return this;
	}

	/**
	 * Directly add a custom category to the Component's categories.
	 * 
	 * @param name Name of the category
	 * @param value Value for the attribute
	 * @return  {@code this}
	 */
	public Component addCategory(final String name, final Object value) {
		if (category == null) {
			category = new Category<Component>(this);
		}
		category.category(name, value);
		return this;
	}
}
