package nl.mirabeau.ceddl4j.shared;

import java.util.ArrayList;
import java.util.List;

import nl.mirabeau.ceddl4j.internal.BaseItem;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Item in a list of items in a Cart or Transaction.
 * 
 * @param <T>
 *            Parent object type
 */
public class Item<T>  extends BaseItem<Item<T>>  {

	private static final String QUANTITY = "quantity";

	private final T parent;

	@JsonProperty
	private ProductInfo<Item<T>> productInfo;

	@JsonProperty
	private Category<Item<T>> category;

	@JsonProperty
	private Price<Item<T>> price;

	@JsonProperty
	private List<LinkedProduct<Item<T>>> linkedProducts;

	@JsonProperty
	private Attributes<Item<T>> attributes;

	/**
	 * Constructs a Item object
	 * 
	 * @param parent
	 */
	public Item(final T parent) {
		super();
		this.parent = parent;
	}

	/**
	 * Returns to the parent object
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
			productInfo = new ProductInfo<>(this);
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
			category = new Category<>(this);
		}
		return category;
	}

	/**
	 * Sets the quantity of this particular item in the cart or transaction.
	 * 
	 * @return {@code this}
	 */
	public Item<T> quantity(final Number quantity) {
		addItem(QUANTITY, quantity);
		return this;
	}

	/**
	 * Provides access to the Item's price object.
	 * 
	 * @return Price object for the Item
	 */
	public Price<Item<T>> price() {
		if (price == null) {
			price = new Price<>(this);
		}
		return price;
	}

	/**
	 * Adds a new linked product to this Item.
	 * 
	 * @return new LinkedProduct object for the Item
	 */
	public LinkedProduct<Item<T>> addLinkedProduct() {
		if (linkedProducts == null) {
			linkedProducts = new ArrayList<>();
		}
		final LinkedProduct<Item<T>> newProduct = new LinkedProduct<>(
				this);
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
			attributes = new Attributes<>(this);
		}
		return attributes;
	}

	/**
	 * Directly adds a new attribute to the Item's attributes
	 * 
	 * @param name
	 *            Name of the attribute
	 * @param value
	 *            Value for the attribute
	 * @return {@code this}
	 */
	public Item<T> addAttribuut(final String name, final Object value) {
		if (attributes == null) {
			attributes = new Attributes<>(this);
		}
		attributes.attribute(name, value);
		return this;
	}

	/**
	 * Directly adds the primary category to the Item's categories
	 * 
	 * @param primaryCategory
	 *            Value for the primary category
	 * @return {@code this}
	 */
	public Item<T> addPrimaryCategory(final String primaryCategory) {
		if (category == null) {
			category = new Category<>(this);
		}
		category.primaryCategory(primaryCategory);
		return this;
	}

	/**
	 * Directly adds a custom category to the Page categories
	 * 
	 * @param name
	 *            Name of the category
	 * @param value
	 *            Value for the attribute
	 * @return {@code this}
	 */
	public Item<T> addCategory(final String name, final Object value) {
		if (category == null) {
			category = new Category<>(this);
		}
		category.category(name, value);
		return this;
	}

	@Override
	protected Item<T> returnSelf() {
		return this;
	}
}