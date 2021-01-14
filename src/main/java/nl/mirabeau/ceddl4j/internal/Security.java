package nl.mirabeau.ceddl4j.internal;

import java.util.LinkedHashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;

/**
 * Security object, use this through calling .security() and .defaultSecurity().
 */
public class Security {

	/**
	 * Construct a Security object. This is normally handled by calling .security() and .defaultSecurity().
	 */
	public Security() {
		super();
	}

	protected Map<String, Object> items = new LinkedHashMap<>();

	@JsonAnyGetter
	public Map<String,Object> getMap() {
		return items;
	}

	/**
	 * Adds a field to the Security object.
	 * This is called from .security() and .defaultSecurity().
	 * 
	 * @param field Fieldname
	 * @param accessCategories accessCategories for field.
	 */
	public void addSecurity(final String field, final String ...accessCategories) {
		if (accessCategories.length == 1) {
			items.put(field, accessCategories[0]);
		} else if (accessCategories.length > 1) {
			items.put(field, accessCategories);
		}
	}
}
