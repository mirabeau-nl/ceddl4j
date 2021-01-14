package nl.mirabeau.ceddl4j.event;

import nl.mirabeau.ceddl4j.DigitalData;
import nl.mirabeau.ceddl4j.shared.Attributes;
import nl.mirabeau.ceddl4j.shared.Category;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Event object collects information about an interaction event by the user.
 * An event might be a button click, the addition of a portal widget, playing a
 * video, adding a product to the shopping cart, etc. Any action on the page
 * could be captured by an Event object.
 */
public class Event {

	private DigitalData parent;

	@JsonProperty
	private EventInfo eventInfo;

	@JsonProperty
	private Category<Event> category;

	@JsonProperty
	private Attributes<Event> attributes;

	/**
	 * Constructs an Event object.
	 * 
	 * @param parent
	 *            The parent Object
	 */
	public Event(final DigitalData parent) {
		super();
		this.parent = parent;
	}

	/**
	 * Constructs an Event object.
	 */
	public Event() {
		super();
	}

	/**
	 * Returns to the parent object
	 * 
	 * @return DigitalData parent object or {@code null} when not available
	 */
	public DigitalData endEvent() {
		return parent;
	}

	/**
	 * Provides access to the EventInfo object for this Event.
	 * 
	 * This object describes the event.
	 * 
	 * @return EventInfo Object for this Event
	 */
	public EventInfo eventInfo() {
		if (eventInfo == null) {
			eventInfo = new EventInfo(this);
		}
		return eventInfo;
	}

	/**
	 * Provides access to the Category object for the Event.
	 * 
	 * @return Category object for this Event
	 */
	public Category<Event> category() {
		if (category == null) {
			category = new Category<>(this);
		}
		return category;
	}

	/**
	 * Provides access to the Attributes object for this Event.
	 * 
	 * @return Attributes object for this Event
	 */
	public Attributes<Event> attributes() {
		if (attributes == null) {
			attributes = new Attributes<>(this);
		}
		return attributes;
	}

	/**
	 * Directly adds a new attribute to the Events's attributes
	 * 
	 * @param name
	 *            Name of the attribute
	 * @param value
	 *            Value for the attribute
	 * @return {@code this}
	 */
	public Event addAttribute(final String name, final Object value) {
		if (attributes == null) {
			attributes = new Attributes<>(this);
		}
		attributes.attribute(name, value);
		return this;
	}

	/**
	 * Directly sets the primary category for the Event
	 * 
	 * @param primaryCategory
	 *            Value for the primary category
	 * @return {@code this}
	 */
	public Event addPrimaryCategory(final String primaryCategory) {
		if (category == null) {
			category = new Category<>(this);
		}
		category.primaryCategory(primaryCategory);
		return this;
	}

	/**
	 * Directly adds a custom category to the Event's categories
	 * 
	 * @param name
	 *            Name of the category
	 * @param value
	 *            Value for the attribute
	 * @return {@code this}
	 */
	public Event addCategory(final String name, final Object value) {
		if (category == null) {
			category = new Category<>(this);
		}

		category.category(name, value);
		return this;
	}
}