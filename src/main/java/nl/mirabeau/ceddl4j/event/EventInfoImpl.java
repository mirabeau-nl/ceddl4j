package nl.mirabeau.ceddl4j.event;

import java.util.LinkedHashMap;

/**
 * This object describes the event.
 */
public class EventInfoImpl extends LinkedHashMap<String, Object> implements EventInfo {

	private static final long serialVersionUID = -1914214466224476883L;

	private final Event parent;

	private static final String EVENT_NAME = "eventName";
	private static final String EVENT_ACTION = "eventAction";
	private static final String EVENT_POINTS = "eventPoints";
	private static final String TYPE = "type";
	private static final String TIME_STAMP = "timeStamp";
	private static final String CAUSE = "cause";
	private static final String EFFECT = "effect";

	/**
	 * Constructor, sets the parent
	 * 
	 * @param parent
	 */
	public EventInfoImpl(final Event parent) {
		super();
		this.parent = parent;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.event.EventInfo#endEventInfo()
	 */
	public Event endEventInfo() {
		return parent;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.event.EventInfo#eventName(java.lang.Object)
	 */
	public EventInfo eventName(final Object eventName) {
		put(EVENT_NAME, eventName);
		return this;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.event.EventInfo#eventAction(java.lang.Object)
	 */
	public EventInfo eventAction(final Object eventAction) {
		put(EVENT_ACTION, eventAction);
		return this;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.event.EventInfo#eventPoints(java.lang.Object)
	 */
	public EventInfo eventPoints(final Object eventPoints) {
		put(EVENT_POINTS, eventPoints);
		return this;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.event.EventInfo#type(java.lang.Object)
	 */
	public EventInfo type(final Object type) {
		put(TYPE, type);
		return this;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.event.EventInfo#timeStamp(java.lang.Object)
	 */
	public EventInfo timeStamp(final Object timeStamp) {
		put(TIME_STAMP, timeStamp);
		return this;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.event.EventInfo#cause(java.lang.Object)
	 */
	public EventInfo cause(final Object cause) {
		put(CAUSE, cause);
		return this;
	}


	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.event.EventInfo#effect(java.lang.Object)
	 */
	public EventInfo effect(final Object effect) {
		put(EFFECT, effect);
		return this;
	}


	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.event.EventInfo#custom(java.lang.String, java.lang.Object)
	 */
	public EventInfo custom(final String name, final Object value) {
		put(name, value);
		return this;
	}
}
