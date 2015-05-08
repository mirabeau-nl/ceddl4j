package nl.mirabeau.ceddl4j;

import java.util.LinkedHashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;

/**
 * Base class for Extensible DigitalData objects
 *
 */
public abstract class BaseItem {

	public BaseItem() {
		super();
	}

	protected final Map<String, Object> items = new LinkedHashMap<String, Object>();

	@JsonAnyGetter
	public Map<String,Object> getMap() {
		return items;
	}
}
