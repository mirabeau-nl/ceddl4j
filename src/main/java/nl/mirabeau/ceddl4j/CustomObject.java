package nl.mirabeau.ceddl4j;

import nl.mirabeau.ceddl4j.internal.BaseItem;

public class CustomObject extends BaseItem<CustomObject> {

	@Override
	protected CustomObject returnSelf() {
		return this;
	}

}
