package nl.mirabeau.ceddl4j.examples.healthcare;

import java.util.ArrayList;
import java.util.List;

import nl.mirabeau.ceddl4j.DigitalData;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HealthcareDigitalData extends DigitalData {

	@JsonProperty
	private List<Member> member;

	@JsonProperty
	private Application application;

	@JsonProperty
	private Plan plan;

	public HealthcareDigitalData addMember(final Member newMember) {
		if (member == null) {
			member = new ArrayList<Member>();
		}
		member.add(newMember);
		return this;
	}

	public HealthcareDigitalData setApplication(final Application application) {
		this.application = application;
		return this;
	}

	public HealthcareDigitalData setPlan(final Plan plan) {
		this.plan = plan;
		return this;
	}
}
