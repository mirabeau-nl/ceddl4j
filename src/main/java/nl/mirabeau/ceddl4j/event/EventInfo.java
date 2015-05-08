package nl.mirabeau.ceddl4j.event;

import nl.mirabeau.ceddl4j.BaseItem;

/**
 * This object describes the event.
 */
public class EventInfo extends BaseItem {

	private static final String EVENT_NAME = "eventName";
	private static final String EVENT_ACTION = "eventAction";
	private static final String EVENT_POINTS = "eventPoints";
	private static final String TYPE = "type";
	private static final String TIME_STAMP = "timeStamp";
	private static final String CAUSE = "cause";
	private static final String EFFECT = "effect";

	private final Event parent;

	/**
	 * Constructor, sets the parent
	 * 
	 * @param parent
	 */
	public EventInfo(final Event parent) {
		super();
		this.parent = parent;
	}

	/**
	 * Return to the parent Event object
	 * 
	 * @return parent Product object
	 */
	public Event endEventInfo() {
		return parent;
	}

	/**
	 * eventName.
	 * 
	 * The eventInfo object MUST include eventName.
	 * 
	 * @param eventName String
	 * @return  {@code this}
	 */
	public EventInfo eventName(final Object eventName) {
		items.put(EVENT_NAME, eventName);
		return this;
	}

	/**
	 * eventAction.
	 * 
	 * @param eventAction String
	 * @return {@code this}
	 */
	public EventInfo eventAction(final Object eventAction) {
		items.put(EVENT_ACTION, eventAction);
		return this;
	}

	/**
	 * eventPoints
	 * 
	 * @param eventPoints Number
	 * @return  {@code this}
	 */
	public EventInfo eventPoints(final Object eventPoints) {
		items.put(EVENT_POINTS, eventPoints);
		return this;
	}

	/**
	 * Type
	 * 
	 * @param type String
	 * @return  {@code this}
	 */
	public EventInfo type(final Object type) {
		items.put(TYPE, type);
		return this;
	}

	/**
	 * TimeStamp
	 * 
	 * @param timeStamp String or Date
	 * @return  {@code this}
	 */
	public EventInfo timeStamp(final Object timeStamp) {
		items.put(TIME_STAMP, timeStamp);
		return this;
	}

	/**
	 * Cause
	 * 
	 * @param cause String
	 * @return  {@code this}
	 */
	public EventInfo cause(final Object cause) {
		items.put(CAUSE, cause);
		return this;
	}

	/**
	 * Effect
	 * 
	 * @param effect String
	 * @return  {@code this}
	 */
	public EventInfo effect(final Object effect) {
		items.put(EFFECT, effect);
		return this;
	}

	/**
	 * Custom EventInfo property
	 * 
	 * @param name Custom property name
	 * @param value Custom property value
	 * @return {@code this}
	 */
	public EventInfo custom(final String name, final Object value) {
		items.put(name, value);
		return this;
	}
}
