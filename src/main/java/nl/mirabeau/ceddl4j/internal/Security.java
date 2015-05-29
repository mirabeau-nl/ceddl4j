package nl.mirabeau.ceddl4j.internal;

import java.util.LinkedHashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;

public class Security {

	public Security() {
		super();
	}

	protected Map<String, Object> items = new LinkedHashMap<String, Object>();

	@JsonAnyGetter
	public Map<String,Object> getMap() {
		return items;
	}

	public void addSecurity(final String field, final String ...accessCategories) {
		if (accessCategories.length == 1) {
			items.put(field, accessCategories[0]);
		} else if (accessCategories.length > 1) {
			items.put(field, accessCategories);
		}
	}
}
