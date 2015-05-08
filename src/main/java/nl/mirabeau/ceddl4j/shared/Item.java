package nl.mirabeau.ceddl4j.shared;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Item in a list of items in a Cart or Transaction.
 *
 * @param <T> Parent object type
 */
public class Item<T> {

	private final T parent;

	@JsonProperty
	private ProductInfo<Item<T>> productInfo;

	@JsonProperty
	private Category<Item<T>> category;

	@JsonProperty
	private Number quantity;

	@JsonProperty
	private Price<Item<T>> price;

	@JsonProperty
	private List<LinkedProduct<Item<T>>> linkedProducts;

	@JsonProperty
	private Attributes<Item<T>> attributes;

	/**
	 * Constructor, sets the parent
	 * 
	 * @param parent
	 */
	public Item(final T parent) {
		super();
		this.parent = parent;
	}

	/**
	 * Return to the parent object
	 * 
	 * @return parent object
	 */
	public T endItem() {
		return parent;
	}

	/**
	 * Provides access to the Item's ProductInfo object.
	 * 
	 * This object describes the product.
	 * 
	 * @return ProductInfo object for this Item
	 */
	public ProductInfo<Item<T>> productInfo() {
		if (productInfo == null) {
			productInfo = new ProductInfo<Item<T>>(this);
		}
		return productInfo;
	}

	/**
	 * Provides access to the Item's category object.
	 * 
	 * Because of the wide range of methods for categorization, an object
	 * literal is provided for product categories.
	 * 
	 * @return Category Object for this Item
	 */
	public Category<Item<T>> category() {
		if (category == null) {
			category = new Category<Item<T>>(this);
		}
		return category;
	}

	/**
	 * Quantity of this particular item in the cart.
	 * 
	 * @return {@code this}
	 */
	public Item<T> quantity(final Number quantity) {
		this.quantity = quantity;
		return this;
	}

	/**
	 * Provides access to the Item's price object.
	 * 
	 * @return Price object for the Item
	 */
	public Price<Item<T>> price() {
		if (price == null) {
			price = new Price<Item<T>>(this);
		}
		return price;
	}

	/**
	 * Add a linked product.
	 * 
	 * @return new LinkedProduct object for the Item
	 */
	public LinkedProduct<Item<T>> addLinkedProduct() {
		if (linkedProducts == null) {
			linkedProducts = new ArrayList<LinkedProduct<Item<T>>>();
		}
		final LinkedProduct<Item<T>> newProduct = new LinkedProduct<Item<T>>(this);
		linkedProducts.add(newProduct);

		return newProduct;
	}

	/**
	 * Provides access to the attributes object.
	 * 
	 * @return Attributes object for this Item
	 */
	public Attributes<Item<T>> attributes() {
		if (attributes == null) {
			attributes = new Attributes<Item<T>>(this);
		}
		return attributes;
	}

	/**
	 * Directly add a new attribute to the Item's attributes
	 * 
	 * @param name Name of the attribute
	 * @param value Value for the attribute
	 * @return {@code this}
	 */
	public Item<T> addAttribuut(final String name, final Object value) {
		if (attributes == null) {
			attributes = new Attributes<Item<T>>(this);
		}
		attributes.attribute(name, value);
		return this;
	}

	/**
	 * Directly add the primary category to the Item's categories
	 * 
	 * @param primaryCategory Value for the primary category
	 * @return {@code this}
	 */
	public Item<T> addPrimaryCategory(final String primaryCategory) {
		if (category == null) {
			category = new Category<Item<T>>(this);
		}
		category.primaryCategory(primaryCategory);
		return this;
	}

	/**
	 * Directly add a custom category to the Page categories
	 * 
	 * @param name Name of the category
	 * @param value Value for the attribute
	 * @return {@code this}
	 */
	public Item<T> addCategory(final String name, final Object value) {
		if (category == null) {
			category = new Category<Item<T>>(this);
		}
		category.category(name, value);
		return this;
	}
}