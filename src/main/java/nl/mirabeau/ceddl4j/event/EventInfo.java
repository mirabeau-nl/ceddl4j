package nl.mirabeau.ceddl4j.event;

import java.util.Date;

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
	 * Constructs an EventInfo object.
	 * 
	 * @param parent
	 *            The parent Object
	 */
	public EventInfo(final Event parent) {
		super();
		this.parent = parent;
	}

	/**
	 * Returns to the parent object.
	 * 
	 * @return The parent object
	 */
	public Event endEventInfo() {
		return parent;
	}

	/**
	 * Sets the eventName.
	 * 
	 * The eventInfo object MUST include eventName.
	 * 
	 * @param eventName
	 *            String
	 * @return {@code this}
	 */
	public EventInfo eventName(final String eventName) {
		items.put(EVENT_NAME, eventName);
		return this;
	}

	/**
	 * Sets the eventAction.
	 * 
	 * @param eventAction
	 *            String
	 * @return {@code this}
	 */
	public EventInfo eventAction(final String eventAction) {
		items.put(EVENT_ACTION, eventAction);
		return this;
	}

	/**
	 * Sets the eventPoints.
	 * 
	 * @param eventPoints
	 *            Number
	 * @return {@code this}
	 */
	public EventInfo eventPoints(final Number eventPoints) {
		items.put(EVENT_POINTS, eventPoints);
		return this;
	}

	/**
	 * Sets the Type.
	 * 
	 * @param type
	 *            String
	 * @return {@code this}
	 */
	public EventInfo type(final String type) {
		items.put(TYPE, type);
		return this;
	}

	/**
	 * Sets the TimeStamp.
	 * 
	 * @param timeStamp
	 *            String
	 * @return {@code this}
	 */
	public EventInfo timeStamp(final String timeStamp) {
		items.put(TIME_STAMP, timeStamp);
		return this;
	}

	/**
	 * Sets the TimeStamp.
	 * 
	 * @param timeStamp
	 *            Date
	 * @return {@code this}
	 */
	public EventInfo timeStamp(final Date timeStamp) {
		items.put(TIME_STAMP, timeStamp);
		return this;
	}

	/**
	 * Sets the Cause.
	 * 
	 * @param cause
	 *            String
	 * @return {@code this}
	 */
	public EventInfo cause(final String cause) {
		items.put(CAUSE, cause);
		return this;
	}

	/**
	 * Sets the Effect.
	 * 
	 * @param effect
	 *            String
	 * @return {@code this}
	 */
	public EventInfo effect(final String effect) {
		items.put(EFFECT, effect);
		return this;
	}

	/**
	 * Sets a custom EventInfo property.
	 * 
	 * @param name
	 *            Custom property name
	 * @param value
	 *            Custom property value
	 * @return {@code this}
	 */
	public EventInfo custom(final String name, final Object value) {
		items.put(name, value);
		return this;
	}
}
