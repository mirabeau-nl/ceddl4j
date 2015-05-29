package nl.mirabeau.ceddl4j.page;

import java.util.Date;

import nl.mirabeau.ceddl4j.internal.BaseItem;

/**
 * Describes details about the page.
 */
public class PageInfo extends BaseItem<PageInfo> {

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
	 * Constructs an PageInfo object.
	 * 
	 * @param parent
	 *            The parent Object
	 */
	protected PageInfo(final Page parent) {
		super();
		this.parent = parent;
	}

	/**
	 * Returns to the parent object.
	 * 
	 * @return The parent object
	 */
	public Page endPageInfo() {
		return parent;
	}

	/**
	 * Sets the pageID.
	 * 
	 * An identifier for a page or other piece of content, may be unique only
	 * within a particular environment.
	 * 
	 * @param pageID
	 *            String
	 * @return {@code this}
	 */
	public PageInfo pageID(final String pageID) {
		addItem(PAGE_ID, pageID);
		return this;
	}

	/**
	 * Sets the pageName.
	 * 
	 * @param pageName
	 *            String
	 * @return {@code this}
	 */
	public PageInfo pageName(final String pageName) {
		addItem(PAGE_NAME, pageName);
		return this;
	}

	/**
	 * Sets the destinationURL.
	 * 
	 * For destinationURL RECOMMENDED value is document.location.
	 * 
	 * @param destinationURL
	 *            String
	 * @return {@code this}
	 */
	public PageInfo destinationURL(final String destinationURL) {
		addItem(DESTINATION_URL, destinationURL);
		return this;
	}

	/**
	 * Sets the referringURL.
	 * 
	 * For referringURL RECOMMENDED value is document.referrer
	 * 
	 * @param referringURL
	 *            String
	 * @return {@code this}
	 */
	public PageInfo referringURL(final String referringURL) {
		addItem(REFERRING_URL, referringURL);
		return this;
	}

	/**
	 * Sets the sysEnv.
	 * 
	 * @param sysEnv
	 *            String
	 * @return {@code this}
	 */
	public PageInfo sysEnv(final String sysEnv) {
		addItem(SYS_ENV, sysEnv);
		return this;
	}

	/**
	 * Sets the variant.
	 * 
	 * @param variant
	 *            String
	 * @return {@code this}
	 */
	public PageInfo variant(final String variant) {
		addItem(VARIANT, variant);
		return this;
	}

	/**
	 * Sets the version.
	 * 
	 * @param version
	 *            String
	 * @return {@code this}
	 */
	public PageInfo version(final String version) {
		addItem(VERSION, version);
		return this;
	}

	/**
	 * Sets the breadCrumbs.
	 * 
	 * @param breadCrumbs
	 *            String
	 * @return {@code this}
	 */
	public PageInfo breadCrumbs(final String... breadCrumbs) {
		addItem(BREADCRUMBS, breadCrumbs);
		return this;
	}

	/**
	 * Sets the author.
	 * 
	 * @param author
	 *            String
	 * @return {@code this}
	 */
	public PageInfo author(final String author) {
		addItem(AUTHOR, author);
		return this;
	}

	/**
	 * Sets the issueDate.
	 * 
	 * @param issueDate
	 *            Date Object
	 * @return {@code this}
	 */
	public PageInfo issueDate(final String issueDate) {
		addItem(ISSUE_DATE, issueDate);
		return this;
	}

	/**
	 * Sets the issueDate.
	 * 
	 * @param issueDate
	 *            String
	 * @return {@code this}
	 */
	public PageInfo issueDate(final Date issueDate) {
		addItem(ISSUE_DATE, issueDate);
		return this;
	}

	/**
	 * Sets the effectiveDate.
	 * 
	 * @param effectiveDate
	 *            String
	 * @return {@code this}
	 */
	public PageInfo effectiveDate(final String effectiveDate) {
		addItem(EFFECTIVE_DATE, effectiveDate);
		return this;
	}

	/**
	 * Sets the effectiveDate.
	 * 
	 * @param effectiveDate
	 *            Date Object
	 * @return {@code this}
	 */
	public PageInfo effectiveDate(final Date effectiveDate) {
		addItem(EFFECTIVE_DATE, effectiveDate);
		return this;
	}

	/**
	 * Sets the expiryDate.
	 * 
	 * @param expiryDate
	 *            String
	 * @return {@code this}
	 */
	public PageInfo expiryDate(final String expiryDate) {
		addItem(EXPIRY_DATE, expiryDate);
		return this;
	}

	/**
	 * Sets the expiryDate.
	 * 
	 * @param expiryDate
	 *            Date
	 * @return {@code this}
	 */
	public PageInfo expiryDate(final Date expiryDate) {
		addItem(EXPIRY_DATE, expiryDate);
		return this;
	}

	/**
	 * Sets the language.
	 * 
	 * For fields containing language or locale, ISO 3166 and 639 are
	 * RECOMMENDED.
	 * 
	 * @param language
	 *            String
	 * @return {@code this}
	 */
	public PageInfo language(final String language) {
		addItem(LANGUAGE, language);
		return this;
	}

	/**
	 * Sets the geoRegion.
	 * 
	 * @param geoRegion
	 *            String
	 * @return {@code this}
	 */
	public PageInfo geoRegion(final String geoRegion) {
		addItem(GEO_REGION, geoRegion);
		return this;
	}

	/**
	 * Sets the industryCodes.
	 * 
	 * @param industryCodes
	 *            String
	 * @return {@code this}
	 */
	public PageInfo industryCodes(final String industryCodes) {
		addItem(INDUSTRY_CODES, industryCodes);
		return this;
	}

	/**
	 * Sets the publisher.
	 * 
	 * @param publisher
	 *            String
	 * @return {@code this}
	 */
	public PageInfo publisher(final String publisher) {
		addItem(PUBLISHER, publisher);
		return this;
	}

	/**
	 * Sets the onsiteSearchTerm.
	 * 
	 * The properties onsiteSearchTerm and onsiteSearchResults are RECOMMENDED
	 * for measuring the query term and number of results returned for onsite
	 * search functions.
	 * 
	 * @param onsiteSearchTerm
	 *            String
	 * @return {@code this}
	 */
	public PageInfo onsiteSearchTerm(final String onsiteSearchTerm) {
		addItem(ONSITE_SEARCH_TERMS, onsiteSearchTerm);
		return this;
	}

	/**
	 * Sets the onsiteSearchResults.
	 * 
	 * The properties onsiteSearchTerm and onsiteSearchResults are RECOMMENDED
	 * for measuring the query term and number of results returned for onsite
	 * search functions.
	 * 
	 * @param onsiteSearchResults
	 *            String
	 * @return {@code this}
	 */
	public PageInfo onsiteSearchResults(final Number onsiteSearchResults) {
		addItem(ONSITE_SEARCH_RESULTS, onsiteSearchResults);
		return this;
	}

	@Override
	protected PageInfo returnSelf(){
		return this;
	}
}
