package nl.mirabeau.ceddl4j.event;

/**
 * This object describes the event.
 */
public interface EventInfo {

	/**
	 * Return to the parent Event object
	 * 
	 * @return parent Product object
	 */
	Event endEventInfo();

	/**
	 * eventName.
	 * 
	 * The eventInfo object MUST include eventName.
	 * 
	 * @param eventName String
	 * @return  {@code this}
	 */
	EventInfo eventName(Object eventName);

	/**
	 * eventAction.
	 * 
	 * @param eventAction String
	 * @return {@code this}
	 */
	EventInfo eventAction(Object eventAction);

	/**
	 * eventPoints
	 * 
	 * @param eventPoints Number
	 * @return  {@code this}
	 */
	EventInfo eventPoints(Object eventPoints);

	/**
	 * Type
	 * 
	 * @param type String
	 * @return  {@code this}
	 */
	EventInfo type(Object type);

	/**
	 * TimeStamp
	 * 
	 * @param timeStamp String or Date
	 * @return  {@code this}
	 */
	EventInfo timeStamp(Object timeStamp);

	/**
	 * Cause
	 * 
	 * @param cause String
	 * @return  {@code this}
	 */
	EventInfo cause(Object cause);

	/**
	 * Effect
	 * 
	 * @param effect String
	 * @return  {@code this}
	 */
	EventInfo effect(Object effect);

	/**
	 * Custom EventInfo property
	 * 
	 * @param name Custom property name
	 * @param value Custom property value
	 * @return {@code this}
	 */
	EventInfo custom(String name, Object value);

}