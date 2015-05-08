package nl.mirabeau.ceddl4j.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Product linked to main product
 *
 */
public class LinkedProduct<T> {

	private final T parent;

	@JsonProperty
	private ProductInfo<LinkedProduct<T>> productInfo;

	/**
	 * Constructor, sets the parent
	 * 
	 * @param parent
	 */
	public LinkedProduct(final T parent) {
		super();
		this.parent = parent;
	}

	/**
	 * Return to the parent Item object
	 * 
	 * @return parent Item object or null when not available
	 */
	public T endLinkedProduct() {
		return parent;
	}

	/**
	 * Provides access to the linked product ProductInfo object.
	 * 
	 * @return ProductInfo object for this LinkedProduct
	 */
	public ProductInfo<LinkedProduct<T>> productInfo() {
		if (productInfo == null) {
			productInfo = new ProductInfo<LinkedProduct<T>>(this);
		}
		return productInfo;
	}
}
