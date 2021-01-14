package nl.mirabeau.ceddl4j.transaction;

import java.util.LinkedList;
import java.util.List;

import nl.mirabeau.ceddl4j.DigitalData;
import nl.mirabeau.ceddl4j.internal.BaseItem;
import nl.mirabeau.ceddl4j.shared.Attributes;
import nl.mirabeau.ceddl4j.shared.Item;
import nl.mirabeau.ceddl4j.shared.Price;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Transaction object is similar to the Cart object, but represents a
 * completed order. The Transaction object contains analogous sub-objects to the
 * Cart object as well as additional sub-objects specific to completed orders.
 */
public class Transaction extends BaseItem<Transaction> {

	private static final String TRANSACTION_ID = "transactionID";

	private DigitalData parent;

	@JsonProperty
	private TransactionProfile profile;

	@JsonProperty
	private Price<Transaction> total;

	@JsonProperty
	private Attributes<Transaction> attributes;

	@JsonProperty
	private List<Item<Transaction>> item;

	/**
	 * Constructs a Transaction object.
	 * 
	 * @param parent
	 *            The parent Object
	 */
	public Transaction(final DigitalData parent) {
		super();
		this.parent = parent;
	}

	/**
	 * Constructs a Transaction object.
	 */
	public Transaction() {
		super();
	}

	/**
	 * Returns to the parent DigitalData object
	 * 
	 * @return parent DigitalData object or null when not available
	 */
	public DigitalData endTransaction() {
		return parent;
	}

	/**
	 * Sets the transactionID
	 * 
	 * @param transactionID
	 *            A unique identifier for a particular transaction; usually an
	 *            existing order identifier.
	 * @return {@code this}
	 */
	public Transaction transactionID(final String transactionID) {
		return custom(TRANSACTION_ID, transactionID);
	}

	/**
	 * Provides access to the Profile object for this Transaction.
	 * 
	 * A profile for information about the purchaser, typically associated with
	 * a registered user.
	 * 
	 * @return the Profile object for this Transaction
	 */
	public TransactionProfile profile() {
		if (profile == null) {
			profile = new TransactionProfile(this);
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
			total = new Price<>(this);
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
			attributes = new Attributes<>(this);
		}
		return attributes;
	}

	/**
	 * Directly adds a new attribute to the Transaction's attributes
	 * 
	 * @param name Name of the attribute
	 * @param value Value for the attribute
	 * @return The current Transaction object
	 */
	public Transaction addAttribuut(final String name, final Object value) {
		if (attributes == null) {
			attributes = new Attributes<>(this);
		}
		attributes.attribute(name, value);
		return this;
	}

	/**
	 * Adds a new Item to the list of items in the transaction.
	 * 
	 * @return a new Item in the transaction
	 */
	public Item<Transaction> addItem() {
		if (item == null) {
			item = new LinkedList<>();
		}
		final Item<Transaction> newItem = new Item<>(this);
		item.add(newItem);
		return newItem;
	}

	@Override
	protected Transaction returnSelf() {
		return this;
	}
}
