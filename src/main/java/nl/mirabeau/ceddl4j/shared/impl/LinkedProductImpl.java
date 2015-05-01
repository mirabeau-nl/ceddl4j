package nl.mirabeau.ceddl4j.shared.impl;

import nl.mirabeau.ceddl4j.shared.ProductInfo;

import com.google.gson.annotations.Expose;

/**
 * Product linked to main product
 *
 */
public class LinkedProductImpl<T> {

	private T parent;

	@Expose
	private ProductInfoImpl<LinkedProductImpl<T>> productInfo;


	/**
	 * Constructor, does not set the parent
	 */
	public LinkedProductImpl() {
		super();
	}


	/**
	 * Constructor, sets the parent
	 * 
	 * @param parent
	 */
	public LinkedProductImpl(final T parent) {
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
	public ProductInfo<LinkedProductImpl<T>> productInfo() {
		if (productInfo == null) {
			productInfo = new ProductInfoImpl<LinkedProductImpl<T>>(this);
		}
		return productInfo;
	}
}
