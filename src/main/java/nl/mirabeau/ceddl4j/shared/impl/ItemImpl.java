package nl.mirabeau.ceddl4j.shared.impl;

import java.util.ArrayList;
import java.util.List;

import nl.mirabeau.ceddl4j.shared.Attributes;
import nl.mirabeau.ceddl4j.shared.Category;
import nl.mirabeau.ceddl4j.shared.Item;
import nl.mirabeau.ceddl4j.shared.Price;
import nl.mirabeau.ceddl4j.shared.ProductInfo;

import com.google.gson.annotations.Expose;

/**
 * Item in a list of items in a Cart or Transaction.
 *
 * @param <T> Parent object type
 */
public class ItemImpl<T> implements Item<T> {

	private final T parent;

	@Expose
	private ProductInfoImpl<ItemImpl<T>> productInfo;

	@Expose
	private CategoryImpl<ItemImpl<T>> category;

	@Expose
	private Object quantity;

	@Expose
	private PriceImpl<ItemImpl<T>> price;

	@Expose
	private List<LinkedProductImpl<ItemImpl<T>>> linkedProducts;

	@Expose
	private AttributesImpl<ItemImpl<T>> attributes;

	/**
	 * Constructor, sets the parent
	 * 
	 * @param parent
	 */
	public ItemImpl(final T parent) {
		super();
		this.parent = parent;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.shared.impl.Item#endItem()
	 */
	public T endItem() {
		return parent;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.shared.impl.Item#productInfo()
	 */
	public ProductInfo<ItemImpl<T>> productInfo() {
		if (productInfo == null) {
			productInfo = new ProductInfoImpl<ItemImpl<T>>(this);
		}
		return productInfo;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.shared.impl.Item#category()
	 */
	public Category<ItemImpl<T>> category() {
		if (category == null) {
			category = new CategoryImpl<ItemImpl<T>>(this);
		}
		return category;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.shared.impl.Item#quantity(Object quantity)
	 */
	public Item<T> quantity(final Object quantity) {
		this.quantity = quantity;
		return this;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.shared.impl.Item#price()
	 */
	public Price<ItemImpl<T>> price() {
		if (price == null) {
			price = new PriceImpl<ItemImpl<T>>(this);
		}
		return price;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.shared.impl.Item#addLinkedProduct()
	 */
	public LinkedProductImpl<ItemImpl<T>> addLinkedProduct() {
		if (linkedProducts == null) {
			linkedProducts = new ArrayList<LinkedProductImpl<ItemImpl<T>>>();
		}
		final LinkedProductImpl<ItemImpl<T>> newProduct = new LinkedProductImpl<ItemImpl<T>>(this);
		linkedProducts.add(newProduct);

		return newProduct;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.shared.impl.Item#attributes()
	 */
	public Attributes<ItemImpl<T>> attributes() {
		if (attributes == null) {
			attributes = new AttributesImpl<ItemImpl<T>>(this);
		}
		return attributes;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.shared.impl.Item#addAttribuut(String name, String value)
	 */
	public Item<T> addAttribuut(final String name, final Object value) {
		if (attributes == null) {
			attributes = new AttributesImpl<ItemImpl<T>>(this);
		}
		attributes.attribute(name, value);
		return this;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.shared.impl.Item#addPrimaryCategory(final String primaryCategory)
	 */
	public Item<T> addPrimaryCategory(final Object primaryCategory) {
		if (category == null) {
			category = new CategoryImpl<ItemImpl<T>>(this);
		}
		category.primaryCategory(primaryCategory);
		return this;
	}

	/* (non-Javadoc)
	 * @see nl.mirabeau.ceddl4j.shared.impl.Item#addCategory(final String name, final String value)
	 */
	public Item<T> addCategory(final String name, final Object value) {
		if (category == null) {
			category = new CategoryImpl<ItemImpl<T>>(this);
		}
		category.category(name, value);
		return this;
	}
}