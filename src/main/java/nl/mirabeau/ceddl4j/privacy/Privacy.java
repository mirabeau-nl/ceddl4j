package nl.mirabeau.ceddl4j.privacy;

import java.util.ArrayList;
import java.util.List;

import nl.mirabeau.ceddl4j.DigitalData;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Privacy object holds the privacy policy settings that could be used to:
 * 1. Capture and enforce site visitor consent to use tracking technologies on the site.
 * 2. Together with Security objects, secure access to individual objects within the JSO by categories of tracking technologies.
 */
public class Privacy {

	private DigitalData parent;

	@JsonProperty
	private List<AccessCategory> accessCategories;

	/**
	 * Constructs a Privacy object.
	 */
	public Privacy() {
		super();
	}

	/**
	 * Constructs a Privacy object.
	 * 
	 * @param parent
	 *            The parent Object
	 */
	public Privacy(final DigitalData parent) {
		super();
		this.parent = parent;
	}

	/**
	 * Returns to the parent object.
	 * 
	 * @return parent object or {@code null} when not available
	 */
	public DigitalData endPrivacy() {
		return parent;
	}

	/**
	 * Adds a new AccessCategory.
	 * 
	 * @return a new AccessCategory object
	 */
	public AccessCategory addAccessCategory() {
		if (accessCategories == null) {
			accessCategories = new ArrayList<>();
		}
		final AccessCategory accessCategory = new AccessCategory(this);
		accessCategories.add(accessCategory);
		return accessCategory;
	}

	/**
	 * Adds the Default AccessCategory.
	 * 
	 * @return a new AccessCategory object
	 */
	public AccessCategory addDefaultAccessCategory() {
		if (accessCategories == null) {
			accessCategories = new ArrayList<>();
		}
		final AccessCategory accessCategory = new AccessCategory(this);
		accessCategories.add(accessCategory);
		accessCategory.categoryName(DigitalData.DEFAULT_SECURITY);
		return accessCategory;
	}
}
