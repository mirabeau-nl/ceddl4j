package nl.mirabeau.ceddl4j.transaction;

import java.util.LinkedList;
import java.util.List;

import nl.mirabeau.ceddl4j.DigitalData;
import nl.mirabeau.ceddl4j.shared.Attributes;
import nl.mirabeau.ceddl4j.shared.Item;
import nl.mirabeau.ceddl4j.shared.Price;
import nl.mirabeau.ceddl4j.shared.impl.AttributesImpl;
import nl.mirabeau.ceddl4j.shared.impl.ItemImpl;
import nl.mirabeau.ceddl4j.shared.impl.PriceImpl;

import com.google.gson.annotations.Expose;

/**
 * The Transaction object is similar to the Cart object, but represents a
 * completed order. The Transaction object contains analogous sub-objects to the
 * Cart object as well as additional sub-objects specific to completed orders.
 */
public class Transaction {

	private DigitalData parent;

	@Expose
	private String transactionID;

	@Expose
	private Profile profile;

	@Expose
	private PriceImpl<Transaction> total;

	@Expose
	private AttributesImpl<Transaction> attributes;

	@Expose
	private List<ItemImpl<Transaction>> item;

	/**
	 * Constructor, sets the parent
	 * 
	 * @param parent
	 */
	public Transaction(final DigitalData parent) {
		super();
		this.parent = parent;
	}

	/**
	 * Constructor, does not set the parent
	 */
	public Transaction() {
		super();
	}

	/**
	 * Return to the parent DigitalData object
	 * 
	 * @return parent DigitalData object or null when not available
	 */
	public DigitalData endTransaction() {
		return parent;
	}

	/**
	 * Set the transactionID
	 * 
	 * @param transactionID
	 *            A unique identifier for a particular transaction; usually an
	 *            existing order identifier.
	 * @return The current Transaction object
	 */
	public Transaction transactionID(final String transactionID) {
		this.transactionID = transactionID;
		return this;
	}

	/**
	 * Provides access to the Profile object for this Transaction.
	 * 
	 * A profile for information about the purchaser, typically associated with
	 * a registered user.
	 * 
	 * @return the Profile object for this Transaction
	 */
	public Profile profile() {
		if (profile == null) {
			profile = new Profile(this);
		}
		return profile;
	}

	/**
	 * Provides access to the Total (Price) object for this Transaction.
	 * 
	 * This object provides details of the final price the purchaser has to pay.
	 * The basePrice SHOULD be the price of the items before applicable
	 * discounts, shipping charges, and tax. The transactionTotal SHOULD be the
	 * total price inclusive of all discounts, charges, and tax.
	 * 
	 * @return The Total (Price) object for this Transaction.
	 */
	public Price<Transaction> total() {
		if (total == null) {
			total = new PriceImpl<Transaction>(this);
		}
		return total;
	}

	/**
	 * Provides access to the Attributes object for this Transaction.
	 * 
	 * This object provides extensibility to the transaction as a whole. Any
	 * additional dimensions related to the cart can be provided. All names are
	 * optional and should fit the individual implementation needs in both
	 * naming and values passed.
	 * 
	 * @return Attributes object for this Transaction
	 */
	public Attributes<Transaction> attributes() {
		if (attributes == null) {
			attributes = new AttributesImpl<Transaction>(this);
		}
		return attributes;
	}

	/**
	 * Directly add a new attribute to the Transaction's attributes
	 * 
	 * @param name Name of the attribute
	 * @param value Value for the attribute
	 * @return The current Transaction object
	 */
	public Transaction addAttribuut(final String name, final Object value) {
		if (attributes == null) {
			attributes = new AttributesImpl<Transaction>(this);
		}
		attributes.attribute(name, value);
		return this;
	}

	/**
	 * Add a new Item to the list of items in the transaction.
	 * 
	 * @return a new Item in the transaction
	 */
	public Item<Transaction> addItem() {
		if (item == null) {
			item = new LinkedList<ItemImpl<Transaction>>();
		}
		final ItemImpl<Transaction> newItem = new ItemImpl<Transaction>(this);
		item.add(newItem);
		return newItem;
	}

}
