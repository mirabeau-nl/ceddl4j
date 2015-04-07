package nl.mirabeau.ceddl4j.shared.impl;

import java.util.LinkedHashMap;

import nl.mirabeau.ceddl4j.shared.Attributes;

/**
 * This object provides extensibility to the Parent object. All names are optional
 * and should fit the individual implementation needs in both naming and values
 * passed.
 * 
 * @param <T> Parent object type
 */
public class AttributesImpl<T> extends LinkedHashMap<String, Object> implements Attributes<T> {

	private static final long serialVersionUID = -5285208369222816655L;

	private T parent;

	/**
	 * Constructor, does not set the parent
	 */
	public AttributesImpl() {
		super();
	}

	/**
	 * Constructor, sets the parent
	 * 
	 * @param parent
	 */
	public AttributesImpl(final T parent) {
		this.parent = parent;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.shared.Attributes#endAttributes()
	 */
	public T endAttributes() {
		return parent;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.shared.Attributes#attribute(java.lang.String, java.lang.String)
	 */
	public Attributes<T> attribute(final String name, final Object value) {
		put(name, value);
		return this;
	}

}
