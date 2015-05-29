package nl.mirabeau.ceddl4j.examples.healthcare;

import java.util.ArrayList;
import java.util.List;

import nl.mirabeau.ceddl4j.CustomObject;
import nl.mirabeau.ceddl4j.DigitalData;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HealthcareDigitalData extends DigitalData {

	@JsonProperty
	private List<CustomObject> member;

	@JsonProperty
	private CustomObject application;

	@JsonProperty
	private CustomObject plan;

	public HealthcareDigitalData addMember(final CustomObject newMember) {
		if (member == null) {
			member = new ArrayList<CustomObject>();
		}
		member.add(newMember);
		return this;
	}

	public HealthcareDigitalData setApplication(final CustomObject application) {
		this.application = application;
		return this;
	}

	public HealthcareDigitalData setPlan(final CustomObject plan) {
		this.plan = plan;
		return this;
	}
}
