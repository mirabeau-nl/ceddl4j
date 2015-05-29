package nl.mirabeau.ceddl4j.shared;

import nl.mirabeau.ceddl4j.internal.BaseItem;


/**
 * This object describes the product.
 *
 * @param <T> Parent object type
 */
public class ProductInfo<T> extends BaseItem<ProductInfo<T>> {

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
	 * Constructs a ProductInfo object
	 * 
	 * @param parent The parent object
	 */
	public ProductInfo(final T parent) {
		super();
		this.parent = parent;
	}

	/**
	 * Returns to the parent object.
	 * 
	 * @return parent object
	 */
	public T endProductInfo() {
		return parent;
	}

	/**
	 * Sets the productID.
	 * 
	 * @param productID
	 *            String
	 * @return {@code this}
	 */
	public ProductInfo<T> productID(final String productID) {
		addItem(PRODUCT_ID, productID);
		return this;
	}

	/**
	 * Sets the productName.
	 * 
	 * @param productName
	 *            String
	 * @return {@code this}
	 */
	public ProductInfo<T> productName(final String productName) {
		addItem(PRODUCT_NAME, productName);
		return this;
	}

	/**
	 * Sets the description.
	 * 
	 * @param description
	 *            String
	 * @return {@code this}
	 */
	public ProductInfo<T> description(final String description) {
		addItem(DESCRIPTION, description);
		return this;
	}

	/**
	 * Sets the productURL.
	 * 
	 * @param productURL
	 *            String
	 * @return {@code this}
	 */
	public ProductInfo<T> productURL(final String productURL) {
		addItem(PRODUCT_URL, productURL);
		return this;
	}

	/**
	 * Sets the productImage.
	 * 
	 * @param productImage
	 *            String
	 * @return {@code this}
	 */
	public ProductInfo<T> productImage(final String productImage) {
		addItem(PRODUCT_IMAGE, productImage);
		return this;
	}

	/**
	 * Sets the productThumbnail.
	 * 
	 * @param productThumbnail
	 *            String
	 * @return {@code this}
	 */
	public ProductInfo<T> productThumbnail(final String productThumbnail) {
		addItem(PRODUCT_THUMBNAIL, productThumbnail);
		return this;
	}

	/**
	 * Sets the manufacturer.
	 * 
	 * @param manufacturer
	 *            String
	 * @return {@code this}
	 */
	public ProductInfo<T> manufacturer(final String manufacturer) {
		addItem(MANUFACTURER, manufacturer);
		return this;
	}

	/**
	 * Sets the sku.
	 * 
	 * @param sku
	 *            String
	 * @return {@code this}
	 */
	public ProductInfo<T> sku(final String sku) {
		addItem(SKU, sku);
		return this;
	}

	/**
	 * Sets the color.
	 * 
	 * @param color
	 *            String
	 * @return {@code this}
	 */
	public ProductInfo<T> color(final String color) {
		addItem(COLOR, color);
		return this;
	}

	/**
	 * Sets the size.
	 * 
	 * @param size
	 *            String
	 * @return {@code this}
	 */
	public ProductInfo<T> size(final String size) {
		addItem(SIZE, size);
		return this;
	}

	@Override
	protected ProductInfo<T> returnSelf() {
		return this;
	}
}
