package nl.mirabeau.ceddl4j.examples.healthcare;

import nl.mirabeau.ceddl4j.BaseItem;

public class Member extends BaseItem {

	public Member custom(final String name, final Object value) {
		items.put(name, value);
		return this;
	}

}
