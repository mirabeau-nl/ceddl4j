package nl.mirabeau.ceddl4j.event;

import nl.mirabeau.ceddl4j.DigitalData;
import nl.mirabeau.ceddl4j.shared.Attributes;
import nl.mirabeau.ceddl4j.shared.Category;
import nl.mirabeau.ceddl4j.shared.impl.AttributesImpl;
import nl.mirabeau.ceddl4j.shared.impl.CategoryImpl;

import com.google.gson.annotations.Expose;

/**
 * The Event object collects information about an interaction event by the user.
 * An event might be a button click, the addition of a portal widget, playing a
 * video, adding a product to the shopping cart, etc. Any action on the page
 * could be captured by an Event object.
 */
public class Event {

	private DigitalData parent;

	@Expose
	private EventInfoImpl eventInfo;

	@Expose
	private CategoryImpl<Event> category;

	@Expose
	private AttributesImpl<Event> attributes;

	/**
	 * Constructor. Sets the parent.
	 * 
	 * @param parent DigitalData parent Object
	 */
	public Event(final DigitalData parent) {
		super();
		this.parent = parent;
	}

	/**
	 * Constructor. Does not set the parent
	 */
	public Event() {
		super();
	}

	/**
	 * Return to the parent DigitalData object
	 * 
	 * @return  DigitalData parent object or {@code null} when not available
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
			eventInfo = new EventInfoImpl(this);
		}
		return eventInfo;
	}

	/**
	 * Provides access to the Category object for the Event.
	 * 
	 * @return
	 */
	public Category<Event> category() {
		if (category == null) {
			category = new CategoryImpl<Event>(this);
		}
		return category;
	}

	/**
	 * Provides access to the Attributes object for this Event.
	 * 
	 * @return
	 */
	public Attributes<Event> attributes() {
		if (attributes == null) {
			attributes = new AttributesImpl<Event>(this);
		}
		return attributes;
	}

	/**
	 * Directly add a new attribute to the Events's attributes
	 * 
	 * @param name Name of the attribute
	 * @param value Value for the attribute
	 * @return The current Event object
	 */
	public Event addAttribute(final String name, final Object value) {
		if (attributes == null) {
			attributes = new AttributesImpl<Event>(this);
		}
		attributes.attribute(name, value);
		return this;
	}

	/**
	 * Directly set the primary category for the Event
	 * 
	 * @param primaryCategory Value for the primary category
	 * @return The current Event object
	 */
	public Event addPrimaryCategory(final Object primaryCategory) {
		if (category == null) {
			category = new CategoryImpl<Event>(this);
		}

		category.category(Category.PRIMARY_CATEGORY_NAME, primaryCategory);
		return this;
	}

	/**
	 * Directly add a custom category to the Event's categories
	 * 
	 * @param name
	 * @param value
	 * @return
	 */
	public Event addCategory(final String name, final Object value) {
		if (category == null) {
			category = new CategoryImpl<Event>(this);
		}

		category.category(name, value);
		return this;
	}
}