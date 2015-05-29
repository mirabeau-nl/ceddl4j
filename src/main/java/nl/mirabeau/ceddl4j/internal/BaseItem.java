package nl.mirabeau.ceddl4j.internal;

import java.util.LinkedHashMap;
import java.util.Map;

import nl.mirabeau.ceddl4j.DigitalData;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Base class for Extensible DigitalData objects
 */
public abstract class BaseItem <K extends BaseItem<K>> {

	public BaseItem() {
		super();
	}

	private final Map<String, Object> items = new LinkedHashMap<String, Object>();

	@JsonProperty
	private Security security;

	private String previousField;

	/**
	 * Returns the current Object.
	 * 
	 * @return {@code this}
	 */
	protected abstract K returnSelf();

	@JsonAnyGetter
	protected Map<String,Object> getMap() {
		return items;
	}

	protected void addItem(final String field, final Object value) {
		items.put(field, value);
		previousField = field;
	}

	/**
	 * Add the provided security access categories to the previous Object.
	 * <p>
	 * The following example adds security to {@code page.pageInfo.pageName}
	 * <pre>
	 * DigitalData.create()
	 * 	.page()
	 *	.pageInfo()
	 *	.pageName("Nikon SLR Camera")
	 *	.security("Analytics", "Personalization")
	 * </pre>
	 * This method will throw an IllegalStateException when a previous Object is not available.
	 * 
	 * @param accessCategories
	 * @return {@code this}
	 */
	public K security(final String ... accessCategories) {
		if (previousField == null) {
			throw new IllegalStateException("No field found to secure - Call addSecurity directly after setting a field to secure it.");
		}
		if (security == null) {
			security = new Security();
		}
		security.addSecurity(previousField, accessCategories);
		return returnSelf();
	}

	/**
	 * Add the Default security category to the previous Object.
	 * <p>
	 * The following example adds security to {@code page.pageInfo.pageName}
	 * <pre>
	 * DigitalData.create()
	 * 	.page()
	 *	.pageInfo()
	 *	.pageName("Nikon SLR Camera")
	 *	.defaultSecurity()
	 * </pre>
	 * This method will throw an IllegalStateException when a previous Object is not available.
	 * 
	 * @param securityObjects
	 * @return {@code this}
	 */
	public K defaultSecurity() {
		if (previousField == null) {
			throw new IllegalStateException("No field found to secure - Call addDefaultSecurity directly after setting a field to secure it.");
		}
		if (security == null) {
			security = new Security();
		}
		security.addSecurity(previousField, DigitalData.DEFAULT_SECURITY);
		return returnSelf();
	}

	/**
	 * Add a custom property.
	 * 
	 * @param name
	 *            Custom property name
	 * @param value
	 *            Custom property value
	 * @return {@code this}
	 */
	public K custom(final String name, final Object value) {
		addItem(name, value);
		return returnSelf();
	}
}
