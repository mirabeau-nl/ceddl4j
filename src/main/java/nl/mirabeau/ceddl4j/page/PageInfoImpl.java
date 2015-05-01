package nl.mirabeau.ceddl4j.page;

import java.util.LinkedHashMap;

/**
 * Describes details about the page.
 */
public class PageInfoImpl extends LinkedHashMap<String, Object> implements PageInfo {

	private static final long serialVersionUID = -5987307245093669966L;

	private static final String AUTHOR = "author";
	private static final String BREADCRUMBS = "breadcrumbs";
	private static final String DESTINATION_URL = "destinationURL";
	private static final String EFFECTIVE_DATE = "effectiveDate";
	private static final String EXPIRY_DATE = "expiryDate";
	private static final String GEO_REGION = "geoRegion";
	private static final String INDUSTRY_CODES = "industryCodes";
	private static final String ISSUE_DATE = "issueDate";
	private static final String LANGUAGE = "language";
	private static final String ONSITE_SEARCH_RESULTS = "onsiteSearchResults";
	private static final String ONSITE_SEARCH_TERMS = "onsiteSearchTerm";
	private static final String PAGE_ID = "pageID";
	private static final String PAGE_NAME = "pageName";
	private static final String PUBLISHER = "publisher";
	private static final String REFERRING_URL = "referringURL";
	private static final String SYS_ENV = "sysEnv";
	private static final String VARIANT = "variant";
	private static final String VERSION = "version";

	private final Page parent;


	/**
	 * Constructor. Sets the parent.
	 * 
	 * @param parent
	 *            Page parent Object
	 */
	protected PageInfoImpl(final Page parent) {
		super();
		this.parent = parent;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.page.PageInfo#endPageInfo()
	 */
	public Page endPageInfo() {
		return parent;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.page.PageInfo#pageID(java.lang.Object)
	 */
	public PageInfoImpl pageID(final Object pageID) {
		put(PAGE_ID, pageID);
		return this;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.page.PageInfo#pageName(java.lang.Object)
	 */
	public PageInfoImpl pageName(final Object pageName) {
		put(PAGE_NAME, pageName);
		return this;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.page.PageInfo#destinationURL(java.lang.Object)
	 */
	public PageInfoImpl destinationURL(final Object destinationURL) {
		put(DESTINATION_URL, destinationURL);
		return this;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.page.PageInfo#referringURL(java.lang.Object)
	 */
	public PageInfoImpl referringURL(final Object referringURL) {
		put(REFERRING_URL, referringURL);
		return this;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.page.PageInfo#sysEnv(java.lang.Object)
	 */
	public PageInfoImpl sysEnv(final Object sysEnv) {
		put(SYS_ENV, sysEnv);
		return this;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.page.PageInfo#variant(java.lang.Object)
	 */
	public PageInfoImpl variant(final Object variant) {
		put(VARIANT, variant);
		return this;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.page.PageInfo#version(java.lang.Object)
	 */
	public PageInfoImpl version(final Object version) {
		put(VERSION, version);
		return this;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.page.PageInfo#breadCrumbs(java.lang.Object)
	 */
	public PageInfoImpl breadCrumbs(final Object... breadCrumbs) {
		put(BREADCRUMBS, breadCrumbs);
		return this;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.page.PageInfo#author(java.lang.Object)
	 */
	public PageInfoImpl author(final Object author) {
		put(AUTHOR, author);
		return this;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.page.PageInfo#issueDate(java.lang.Object)
	 */
	public PageInfoImpl issueDate(final Object issueDate) {
		put(ISSUE_DATE, issueDate);
		return this;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.page.PageInfo#effectiveDate(java.lang.Object)
	 */
	public PageInfoImpl effectiveDate(final Object effectiveDate) {
		put(EFFECTIVE_DATE, effectiveDate);
		return this;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.page.PageInfo#expiryDate(java.lang.Object)
	 */
	public PageInfoImpl expiryDate(final Object expiryDate) {
		put(EXPIRY_DATE, expiryDate);
		return this;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.page.PageInfo#language(java.lang.Object)
	 */
	public PageInfoImpl language(final Object language) {
		put(LANGUAGE, language);
		return this;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.page.PageInfo#geoRegion(java.lang.Object)
	 */
	public PageInfoImpl geoRegion(final Object geoRegion) {
		put(GEO_REGION, geoRegion);
		return this;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.page.PageInfo#industryCodes(java.lang.Object)
	 */
	public PageInfoImpl industryCodes(final Object industryCodes) {
		put(INDUSTRY_CODES, industryCodes);
		return this;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.page.PageInfo#publisher(java.lang.Object)
	 */
	public PageInfoImpl publisher(final Object publisher) {
		put(PUBLISHER, publisher);
		return this;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.page.PageInfo#onsiteSearchTerm(java.lang.Object)
	 */
	public PageInfoImpl onsiteSearchTerm(final Object onsiteSearchTerm) {
		put(ONSITE_SEARCH_TERMS, onsiteSearchTerm);
		return this;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.page.PageInfo#onsiteSearchResults(java.lang.Object)
	 */
	public PageInfoImpl onsiteSearchResults(final Object onsiteSearchResults) {
		put(ONSITE_SEARCH_RESULTS, onsiteSearchResults);
		return this;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.page.PageInfo#custom(java.lang.String, java.lang.Object)
	 */
	public PageInfoImpl custom(final String name, final Object value) {
		put(name, value);
		return this;
	}
}
