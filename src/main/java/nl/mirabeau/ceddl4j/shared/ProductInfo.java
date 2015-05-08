package nl.mirabeau.ceddl4j.shared;

import nl.mirabeau.ceddl4j.BaseItem;


/**
 * This object describes the product.
 *
 * @param <T> Parent object type
 */
public class ProductInfo<T> extends BaseItem {

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
	public ProductInfo(final T parent) {
		super();
		this.parent = parent;
	}

	/**
	 * Return to the parent object
	 * 
	 * @return parent object
	 */
	public T endProductInfo() {
		return parent;
	}

	/**
	 * productID
	 * 
	 * @param productID
	 *            String
	 * @return {@code this}
	 */
	public ProductInfo<T> productID(final String productID) {
		items.put(PRODUCT_ID, productID);
		return this;
	}

	/**
	 * productName
	 * 
	 * @param productName
	 *            String
	 * @return {@code this}
	 */
	public ProductInfo<T> productName(final String productName) {
		items.put(PRODUCT_NAME, productName);
		return this;
	}

	/**
	 * Description
	 * 
	 * @param description
	 *            String
	 * @return {@code this}
	 */
	public ProductInfo<T> description(final String description) {
		items.put(DESCRIPTION, description);
		return this;
	}

	/**
	 * productURL
	 * 
	 * @param productURL
	 *            String
	 * @return {@code this}
	 */
	public ProductInfo<T> productURL(final String productURL) {
		items.put(PRODUCT_URL, productURL);
		return this;
	}

	/**
	 * productImage
	 * 
	 * @param productImage
	 *            String
	 * @return {@code this}
	 */
	public ProductInfo<T> productImage(final String productImage) {
		items.put(PRODUCT_IMAGE, productImage);
		return this;
	}

	/**
	 * productThumbnail
	 * 
	 * @param productThumbnail
	 *            String
	 * @return {@code this}
	 */
	public ProductInfo<T> productThumbnail(final String productThumbnail) {
		items.put(PRODUCT_THUMBNAIL, productThumbnail);
		return this;
	}

	/**
	 * manufacturer
	 * 
	 * @param manufacturer
	 *            String
	 * @return {@code this}
	 */
	public ProductInfo<T> manufacturer(final String manufacturer) {
		items.put(MANUFACTURER, manufacturer);
		return this;
	}

	/**
	 * sku
	 * 
	 * @param sku
	 *            String
	 * @return {@code this}
	 */
	public ProductInfo<T> sku(final String sku) {
		items.put(SKU, sku);
		return this;
	}

	/**
	 * color
	 * 
	 * @param color
	 *            String
	 * @return {@code this}
	 */
	public ProductInfo<T> color(final String color) {
		items.put(COLOR, color);
		return this;
	}

	/**
	 * size
	 * 
	 * @param size
	 *            String
	 * @return {@code this}
	 */
	public ProductInfo<T> size(final String size) {
		items.put(SIZE, size);
		return this;
	}

	/**
	 * Custom ProductInfo property
	 * 
	 * @param name
	 *            Name for the custom property
	 * @param value
	 *            Value for the customn property
	 * @return {@code this}
	 */
	public ProductInfo<T> custom(final String name, final Object value) {
		items.put(name, value);
		return this;
	}
}
