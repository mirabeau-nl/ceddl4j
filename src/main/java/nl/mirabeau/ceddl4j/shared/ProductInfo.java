package nl.mirabeau.ceddl4j.shared;

/**
 * This object describes the product.
 * 
 * @param <T>
 *            Parent object type
 */
public interface ProductInfo<T> {

	/**
	 * Return to the parent object
	 * 
	 * @return parent object
	 */
	T endProductInfo();

	/**
	 * productID
	 * 
	 * @param productID
	 *            String
	 * @return {@code this}
	 */
	ProductInfo<T> productID(Object productID);

	/**
	 * productName
	 * 
	 * @param productName
	 *            String
	 * @return {@code this}
	 */
	ProductInfo<T> productName(Object productName);

	/**
	 * Description
	 * 
	 * @param description
	 *            String
	 * @return {@code this}
	 */
	ProductInfo<T> description(Object description);

	/**
	 * productURL
	 * 
	 * @param productURL
	 *            String
	 * @return {@code this}
	 */
	ProductInfo<T> productURL(Object productURL);

	/**
	 * productImage
	 * 
	 * @param productImage
	 *            String
	 * @return {@code this}
	 */
	ProductInfo<T> productImage(Object productImage);

	/**
	 * productThumbnail
	 * 
	 * @param productThumbnail
	 *            String
	 * @return {@code this}
	 */
	ProductInfo<T> productThumbnail(Object productThumbnail);

	/**
	 * manufacturer
	 * 
	 * @param manufacturer
	 *            String
	 * @return {@code this}
	 */
	ProductInfo<T> manufacturer(Object manufacturer);

	/**
	 * sku
	 * 
	 * @param sku
	 *            String
	 * @return {@code this}
	 */
	ProductInfo<T> sku(Object sku);

	/**
	 * color
	 * 
	 * @param color
	 *            String
	 * @return {@code this}
	 */
	ProductInfo<T> color(Object color);

	/**
	 * size
	 * 
	 * @param size
	 *            String
	 * @return {@code this}
	 */
	ProductInfo<T> size(Object size);

	/**
	 * Custom ProductInfo property
	 * 
	 * @param name
	 *            Name for the custom property
	 * @param value
	 *            Value for the customn property
	 * @return {@code this}
	 */
	ProductInfo<T> custom(String name, Object value);

}