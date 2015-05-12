package nl.mirabeau.ceddl4j.product;

import java.util.ArrayList;
import java.util.List;

import nl.mirabeau.ceddl4j.DigitalData;
import nl.mirabeau.ceddl4j.shared.Attributes;
import nl.mirabeau.ceddl4j.shared.Category;
import nl.mirabeau.ceddl4j.shared.LinkedProduct;
import nl.mirabeau.ceddl4j.shared.ProductInfo;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Product object carries details about a particular product with frequently
 * used properties listed below. This is intended for data about products
 * displayed on pages or other content. For products added to a shopping cart or
 * ordered in a transaction, see the Cart and Transaction objects below.
 * 
 */
public class Product {

	private DigitalData parent;

	@JsonProperty
	private ProductInfo<Product> productInfo;

	@JsonProperty
	private Category<Product> category;

	@JsonProperty
	private List<LinkedProduct<Product>> linkedProducts;

	@JsonProperty
	private Attributes<Product> attributes;

	/**
	 * Constructs a Page object.
	 */
	public Product() {
		super();
	}

	/**
	 * Constructs a Product object.
	 * 
	 * @param parent
	 *            The parent Object
	 */
	public Product(final DigitalData parent) {
		this.parent = parent;
	}

	/**
	 * Returns to the parent object.
	 * 
	 * @return DigitalData parent object or {@code null} when not available
	 */
	public DigitalData endProduct() {
		return parent;
	}

	/**
	 * Provides access to the ProductInfo object.
	 * 
	 * ProductInfo describes the product.
	 * 
	 * @return the ProductInfo object for this Product
	 */
	public ProductInfo<Product> productInfo() {
		if (productInfo == null) {
			productInfo = new ProductInfo<Product>(this);
		}
		return productInfo;
	}

	/**
	 * Provides access to the Category object for the Product
	 * 
	 * Because of the wide range of methods for categorization, an object
	 * literal is provided for product categories.
	 * 
	 * The name primaryCategory is RECOMMENDED if you included only one set of
	 * categories for products, or for your primary set of categories. All other
	 * names are optional and should fit the individual implementation needs in
	 * both naming and values passed.
	 * 
	 * @return Category object for this Product
	 */
	public Category<Product> category() {
		if (category == null) {
			category = new Category<Product>(this);
		}
		return category;
	}

	/**
	 * Adds a new Linked Product to the list of linked products.
	 * 
	 * @return a new Linked Product
	 */
	public LinkedProduct<Product> addLinkedProduct() {
		if (linkedProducts == null) {
			linkedProducts = new ArrayList<LinkedProduct<Product>>();
		}
		final LinkedProduct<Product> newProduct = new LinkedProduct<Product>(
				this);
		linkedProducts.add(newProduct);

		return newProduct;
	}

	/**
	 * Provides access to the Attributes object for this Product.
	 * 
	 * This object provides extensibility to the Product object. Any additional
	 * dimensions related to the product can be provided. All names are optional
	 * and should fit the individual implementation needs in both naming and
	 * values passed.
	 * 
	 * @return Attributes object for this Product
	 */
	public Attributes<Product> attributes() {
		if (attributes == null) {
			attributes = new Attributes<Product>(this);
		}
		return attributes;
	}

	/**
	 * Directly adds a new attribute to the Products's attributes
	 * 
	 * @param name Name of the attribute
	 * @param value Value for the attribute
	 * @return The current Product object
	 */
	public Product addAttribute(final String name, final Object value) {
		if (attributes == null) {
			attributes = new Attributes<Product>(this);
		}
		attributes.attribute(name, value);
		return this;
	}

	/**
	 * Directly adds the primary category to the Product's categories
	 * 
	 * @param primaryCategory Value for the primary category
	 * @return The current Product object
	 */
	public Product addPrimaryCategory(final String primaryCategory) {
		if (category == null) {
			category = new Category<Product>(this);
		}
		category.primaryCategory(primaryCategory);
		return this;
	}

	/**
	 * Directly adds a custom category to the Product's categories
	 * 
	 * @param name Name of the category
	 * @param value Value for the attribute
	 * @return The current Product object
	 */
	public Product addCategory(final String name, final Object value) {
		if (category == null) {
			category = new Category<Product>(this);
		}

		category.category(name, value);
		return this;
	}
}
