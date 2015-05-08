package nl.mirabeau.ceddl4j.page;

import java.util.Date;

import nl.mirabeau.ceddl4j.BaseItem;


/**
 * Describes details about the page.
 */
public class PageInfo extends BaseItem {

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
	protected PageInfo(final Page parent) {
		super();
		this.parent = parent;
	}

	/**
	 * Return to the parent Page object
	 * 
	 * @return Page parent object
	 */
	public Page endPageInfo() {
		return parent;
	}

	/**
	 * An identifier for a page or other piece of content, may be unique only
	 * within a particular environment.
	 * 
	 * @param pageID
	 *            String
	 * @return {@code this}
	 */
	public PageInfo pageID(final String pageID) {
		items.put(PAGE_ID, pageID);
		return this;
	}

	/**
	 * pageName
	 * 
	 * @param pageName
	 *            String
	 * @return {@code this}
	 */
	public PageInfo pageName(final String pageName) {
		items.put(PAGE_NAME, pageName);
		return this;
	}

	/**
	 * destinationURL
	 * 
	 * For destinationURL RECOMMENDED value is document.location
	 * 
	 * @param destinationURL
	 *            String
	 * @return {@code this}
	 */
	public PageInfo destinationURL(final String destinationURL) {
		items.put(DESTINATION_URL, destinationURL);
		return this;
	}

	/**
	 * referringURL
	 * 
	 * For referringURL RECOMMENDED value is document.referrer
	 * 
	 * @param referringURL
	 *            String
	 * @return {@code this}
	 */
	public PageInfo referringURL(final String referringURL) {
		items.put(REFERRING_URL, referringURL);
		return this;
	}

	/**
	 * sysEnv
	 * 
	 * @param sysEnv
	 *            String
	 * @return {@code this}
	 */
	public PageInfo sysEnv(final String sysEnv) {
		items.put(SYS_ENV, sysEnv);
		return this;
	}

	/**
	 * variant
	 * 
	 * @param variant
	 *            String
	 * @return {@code this}
	 */
	public PageInfo variant(final String variant) {
		items.put(VARIANT, variant);
		return this;
	}

	/**
	 * version
	 * 
	 * @param version
	 *            String
	 * @return {@code this}
	 */
	public PageInfo version(final String version) {
		items.put(VERSION, version);
		return this;
	}

	/**
	 * breadCrumb
	 * 
	 * @param breadCrumbs
	 *            String
	 * @return {@code this}
	 */
	public PageInfo breadCrumbs(final String... breadCrumbs) {
		items.put(BREADCRUMBS, breadCrumbs);
		return this;
	}

	/**
	 * author
	 * 
	 * @param author
	 *            String
	 * @return {@code this}
	 */
	public PageInfo author(final String author) {
		items.put(AUTHOR, author);
		return this;
	}

	/**
	 * issueDate
	 * 
	 * @param issueDate Date Object
	 * @return {@code this}
	 */
	public PageInfo issueDate(final String issueDate) {
		items.put(ISSUE_DATE, issueDate);
		return this;
	}

	/**
	 * issueDate
	 * 
	 * @param issueDate String
	 * @return {@code this}
	 */
	public PageInfo issueDate(final Date issueDate) {
		items.put(ISSUE_DATE, issueDate);
		return this;
	}

	/**
	 * effectiveDate
	 * 
	 * @param effectiveDate String
	 * @return {@code this}
	 */
	public PageInfo effectiveDate(final String effectiveDate) {
		items.put(EFFECTIVE_DATE, effectiveDate);
		return this;
	}

	/**
	 * effectiveDate
	 * 
	 * @param effectiveDate Date Object
	 * @return {@code this}
	 */
	public PageInfo effectiveDate(final Date effectiveDate) {
		items.put(EFFECTIVE_DATE, effectiveDate);
		return this;
	}


	/**
	 * expiryDate
	 * 
	 * @param expiryDate String
	 * @return {@code this}
	 */
	public PageInfo expiryDate(final String expiryDate) {
		items.put(EXPIRY_DATE, expiryDate);
		return this;
	}

	/**
	 * expiryDate
	 * 
	 * @param expiryDate Date
	 * @return {@code this}
	 */
	public PageInfo expiryDate(final Date expiryDate) {
		items.put(EXPIRY_DATE, expiryDate);
		return this;
	}

	/**
	 * language
	 * 
	 * For fields containing language or locale, ISO 3166 and 639 are
	 * RECOMMENDED.
	 * 
	 * @param language
	 *            String
	 * @return {@code this}
	 */
	public PageInfo language(final String language) {
		items.put(LANGUAGE, language);
		return this;
	}

	/**
	 * geoRegion
	 * 
	 * @param geoRegion
	 *            String
	 * @return {@code this}
	 */
	public PageInfo geoRegion(final String geoRegion) {
		items.put(GEO_REGION, geoRegion);
		return this;
	}

	/**
	 * industryCodes
	 * 
	 * @param industryCodes
	 *            String
	 * @return {@code this}
	 */
	public PageInfo industryCodes(final String industryCodes) {
		items.put(INDUSTRY_CODES, industryCodes);
		return this;
	}

	/**
	 * publisher
	 * 
	 * @param publisher
	 *            String
	 * @return {@code this}
	 */
	public PageInfo publisher(final String publisher) {
		items.put(PUBLISHER, publisher);
		return this;
	}

	/**
	 * onsiteSearchTerm
	 * 
	 * The properties onsiteSearchTerm and onsiteSearchResults are RECOMMENDED
	 * for measuring the query term and number of results returned for onsite
	 * search functions.
	 * 
	 * @param onsiteSearchTerm String
	 * @return {@code this}
	 */
	public PageInfo onsiteSearchTerm(final String onsiteSearchTerm) {
		items.put(ONSITE_SEARCH_TERMS, onsiteSearchTerm);
		return this;
	}

	/**
	 * onsiteSearchResults
	 * 
	 * The properties onsiteSearchTerm and onsiteSearchResults are RECOMMENDED
	 * for measuring the query term and number of results returned for onsite
	 * search functions.
	 * 
	 * @param onsiteSearchResults String
	 * @return {@code this}
	 */
	public PageInfo onsiteSearchResults(final Number onsiteSearchResults) {
		items.put(ONSITE_SEARCH_RESULTS, onsiteSearchResults);
		return this;
	}

	/**
	 * Custom PageInfo property
	 * 
	 * @param name
	 *            Custom property name
	 * @param value
	 *            Custom property value
	 * @return {@code this}
	 */
	public PageInfo custom(final String name, final Object value) {
		items.put(name, value);
		return this;
	}
}
