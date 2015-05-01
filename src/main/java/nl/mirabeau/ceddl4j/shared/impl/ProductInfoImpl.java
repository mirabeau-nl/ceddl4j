package nl.mirabeau.ceddl4j.shared.impl;

import java.util.LinkedHashMap;

import nl.mirabeau.ceddl4j.shared.ProductInfo;

/**
 * This object describes the product.
 *
 * @param <T> Parent object type
 */
public class ProductInfoImpl<T> extends LinkedHashMap<String, Object> implements ProductInfo<T> {

	private static final long serialVersionUID = 3295729516260758193L;

	private static final String PRODUCT_ID = "productID";
	private static final String PRODUCT_NAME = "productName";
	private static final String DESCRIPTION = "description";
	private static final String PRODUCT_URL = "productURL";
	private static final String PRODUCT_IMAGE = "productImage";
	private static final String PRODUCT_THUMBNAIL = "productThumbnail";
	private static final String MANUFACTURER = "manufacturer";
	private static final String SKU = "sku";
	private static final String COLOR = "color";
	private static final String SIZE = "size";

	private final T parent;

	/**
	 * Constructor, sets the parent
	 * 
	 * @param parent
	 */
	public ProductInfoImpl(final T parent) {
		super();
		this.parent = parent;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.shared.IProductInfo#endProductInfo()
	 */
	public T endProductInfo() {
		return parent;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.shared.IProductInfo#productID(java.lang.String)
	 */
	public ProductInfo<T> productID(final Object productID) {
		put(PRODUCT_ID, productID);
		return this;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.shared.IProductInfo#productName(java.lang.String)
	 */
	public ProductInfo<T> productName(final Object productName) {
		put(PRODUCT_NAME, productName);
		return this;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.shared.IProductInfo#description(java.lang.String)
	 */
	public ProductInfo<T> description(final Object description) {
		put(DESCRIPTION, description);
		return this;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.shared.IProductInfo#productURL(java.lang.String)
	 */
	public ProductInfo<T> productURL(final Object productURL) {
		put(PRODUCT_URL, productURL);
		return this;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.shared.IProductInfo#productImage(java.lang.String)
	 */
	public ProductInfo<T> productImage(final Object productImage) {
		put(PRODUCT_IMAGE, productImage);
		return this;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.shared.IProductInfo#productThumbnail(java.lang.String)
	 */
	public ProductInfo<T> productThumbnail(final Object productThumbnail) {
		put(PRODUCT_THUMBNAIL, productThumbnail);
		return this;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.shared.IProductInfo#manufacturer(java.lang.String)
	 */
	public ProductInfo<T> manufacturer(final Object manufacturer) {
		put(MANUFACTURER, manufacturer);
		return this;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.shared.IProductInfo#sku(java.lang.String)
	 */
	public ProductInfo<T> sku(final Object sku) {
		put(SKU, sku);
		return this;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.shared.IProductInfo#color(java.lang.String)
	 */
	public ProductInfo<T> color(final Object color) {
		put(COLOR, color);
		return this;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.shared.IProductInfo#size(java.lang.String)
	 */
	public ProductInfo<T> size(final Object size) {
		put(SIZE, size);
		return this;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.shared.IProductInfo#custom(java.lang.String, java.lang.String)
	 */
	public ProductInfo<T> custom(final String name, final Object value) {
		put(name, value);
		return this;
	}
}
