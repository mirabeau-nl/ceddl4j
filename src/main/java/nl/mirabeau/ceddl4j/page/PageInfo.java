package nl.mirabeau.ceddl4j.page;

/**
 * The Page object carries significant details about the page, and the most
 * commonly used data elements are captured by the specification below. The Page
 * object and its children, where included, MUST have the following Object Names
 * & Types.
 */
public interface PageInfo {

	/**
	 * Return to the parent Page object
	 * 
	 * @return Page parent object or {@code null} when not available
	 */
	Page endPageInfo();

	/**
	 * An identifier for a page or other piece of content, may be unique only
	 * within a particular environment.
	 * 
	 * @param pageID
	 *            String
	 * @return {@code this}
	 */
	PageInfoImpl pageID(Object pageID);

	/**
	 * pageName
	 * 
	 * @param pageName
	 *            String
	 * @return {@code this}
	 */
	PageInfoImpl pageName(Object pageName);

	/**
	 * destinationURL
	 * 
	 * For destinationURL RECOMMENDED value is document.location
	 * 
	 * @param destinationURL
	 *            String
	 * @return {@code this}
	 */
	PageInfoImpl destinationURL(Object destinationURL);

	/**
	 * referringURL
	 * 
	 * For referringURL RECOMMENDED value is document.referrer
	 * 
	 * @param referringURL
	 *            String
	 * @return {@code this}
	 */
	PageInfoImpl referringURL(Object referringURL);

	/**
	 * sysEnv
	 * 
	 * @param sysEnv
	 *            String
	 * @return {@code this}
	 */
	PageInfoImpl sysEnv(Object sysEnv);

	/**
	 * variant
	 * 
	 * @param variant
	 *            String
	 * @return {@code this}
	 */
	PageInfoImpl variant(Object variant);

	/**
	 * version
	 * 
	 * @param version
	 *            String
	 * @return {@code this}
	 */
	PageInfoImpl version(Object version);

	/**
	 * breadCrumb
	 * 
	 * @param breadCrumbs
	 *            String
	 * @return {@code this}
	 */
	PageInfoImpl breadCrumbs(Object... breadCrumbs);

	/**
	 * author
	 * 
	 * @param author
	 *            String
	 * @return {@code this}
	 */
	PageInfoImpl author(Object author);

	/**
	 * issueDate
	 * 
	 * @param issueDate
	 *            String or Date Object
	 * @return {@code this}
	 */
	PageInfoImpl issueDate(Object issueDate);

	/**
	 * effectiveDate
	 * 
	 * @param effectiveDate
	 *            String or Date Object
	 * @return {@code this}
	 */
	PageInfoImpl effectiveDate(Object effectiveDate);

	/**
	 * expiryDate
	 * 
	 * @param expiryDate
	 *            String or Date Object
	 * @return {@code this}
	 */
	PageInfoImpl expiryDate(Object expiryDate);

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
	PageInfoImpl language(Object language);

	/**
	 * geoRegion
	 * 
	 * @param geoRegion
	 *            String
	 * @return {@code this}
	 */
	PageInfoImpl geoRegion(Object geoRegion);

	/**
	 * industryCodes
	 * 
	 * @param industryCodes
	 *            String
	 * @return {@code this}
	 */
	PageInfoImpl industryCodes(Object industryCodes);

	/**
	 * publisher
	 * 
	 * @param publisher
	 *            String
	 * @return {@code this}
	 */
	PageInfoImpl publisher(Object publisher);

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
	PageInfoImpl onsiteSearchTerm(Object onsiteSearchTerm);

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
	PageInfoImpl onsiteSearchResults(Object onsiteSearchResults);

	/**
	 * Custom PageInfo property
	 * 
	 * @param name
	 *            Custom property name
	 * @param value
	 *            Custom property value
	 * @return {@code this}
	 */
	PageInfoImpl custom(String name, Object value);

}