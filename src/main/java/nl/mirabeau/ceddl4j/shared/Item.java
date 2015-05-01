package nl.mirabeau.ceddl4j.shared;

import nl.mirabeau.ceddl4j.shared.impl.ItemImpl;
import nl.mirabeau.ceddl4j.shared.impl.LinkedProductImpl;

/**
 * Item in a list of items in a Cart or Transaction.
 * 
 * @param <T>
 *            Parent object type
 */
public interface Item<T> {

	/**
	 * Return to the parent object
	 * 
	 * @return parent object or {@code null) when not available
	 */
	T endItem();

	/**
	 * Provides access to the Item's ProductInfo object.
	 * 
	 * This object describes the product.
	 * 
	 * @return ProductInfo object for this Item
	 */
	ProductInfo<ItemImpl<T>> productInfo();

	/**
	 * Provides access to the Item's category object.
	 * 
	 * Because of the wide range of methods for categorization, an object
	 * literal is provided for product categories.
	 * 
	 * @return Category Object for this Item
	 */
	Category<ItemImpl<T>> category();

	/**
	 * Quantity of this particular item in the cart.
	 * 
	 * @return {@code this}
	 */
	Item<T> quantity(Object quantity);

	/**
	 * Provides access to the Item's price object.
	 * 
	 * @return Price object for the Item
	 */
	Price<ItemImpl<T>> price();

	/**
	 * Add a linked product.
	 * 
	 * @return new LinkedProduct object for the Item
	 */
	LinkedProductImpl<ItemImpl<T>> addLinkedProduct();

	/**
	 * Provides access to the attributes object.
	 * 
	 * @return Attributes object for this Item
	 */
	Attributes<ItemImpl<T>> attributes();

	/**
	 * Directly add a new attribute to the Item's attributes
	 * 
	 * @param name Name of the attribute
	 * @param value Value for the attribute
	 * @return {@code this}
	 */
	Item<T> addAttribuut(final String name, final Object value);

	/**
	 * Directly add the primary category to the Item's categories
	 * 
	 * @param primaryCategory Value for the primary category
	 * @return {@code this}
	 */
	Item<T> addPrimaryCategory(final Object primaryCategory);

	/**
	 * Directly add a custom category to the Page categories
	 * 
	 * @param name Name of the category
	 * @param value Value for the attribute
	 * @return {@code this}
	 */
	Item<T> addCategory(final String name, final Object value);
}