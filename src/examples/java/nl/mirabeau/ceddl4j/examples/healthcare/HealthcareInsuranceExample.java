package nl.mirabeau.ceddl4j.examples.healthcare;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import nl.mirabeau.ceddl4j.TestUtil;

import org.json.JSONException;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

public class HealthcareInsuranceExample {

	/**
	 * Generates the healthcare inurance example from the CEDDL specification on
	 * page 31.
	 * 
	 * This example extends CEDDL with 3 new Object (Member, Application and
	 * Plan). Our solution is to create 3 classes for Member, Application and
	 * Plan each class extends BaseItem. We also create a new class
	 * HealthcareDigitalData which extends DigitalData
	 * 
	 * 
	 * 
	 * @throws IOException
	 * @throws JSONException
	 */
	@Test
	public void healthcareInsuranceExample() throws IOException, JSONException {

		//	As another example, to collect data in the healthcare insurance industry, it might be more
		//	convenient to model a few entirely new objects to capture relevant information.
		//	One such bespoke object could be digitalData.member, used to capture a member’ s
		//	account details with the institution, which may frequently be insurance related. This could
		//	include sub-objects as detailed below:
		//
		//	Example Member object
		//	digitalData.member[n] = {
		//			memberID: "2723 49202388 01",
		//			age: "41",
		//		 	groupRelationship: "436378",
		//			groupName: "Employer\, Inc.",
		//			relation: "Spouse",
		//			gender: "M",
		//			originalJoinDate: "2011-01-21",
		//			postalCode: "15214"
		//	};

		final Member member = new Member()
		.custom("memberID", "2723 49202388 01")
		.custom("age", "41")
		.custom("groupRelationship", "436378")
		.custom("groupName", "Employer, Inc.")
		.custom("relation", "Spouse")
		.custom("gender", "M")
		.custom("originalJoinDate", "2011-01-21")
		.custom("postalCode", "15214");

		//	Other useful objects may include an Application object and a Plan object, with additional subobjects
		//	under each.
		//	Example Application object
		//
		//	digitalData.application = {
		//		appID: "7565-2373-0086-8937",
		//		source: "Telephone",
		//		status: "Pending",
		//		creationDate: new Date("December 15, 2013 14:20:02"),
		//		completionDate: new Date("December 15, 2013 16:05:16")
		//	};


		// Setup the dates.
		final GregorianCalendar creationDate = new GregorianCalendar();
		creationDate.setTimeZone(TimeZone.getTimeZone("UTC"));
		creationDate.set(Calendar.YEAR, 2013);
		creationDate.set(Calendar.MONTH, 11);
		creationDate.set(Calendar.DAY_OF_MONTH, 15);
		creationDate.set(Calendar.HOUR_OF_DAY, 14);
		creationDate.set(Calendar.MINUTE, 20);
		creationDate.set(Calendar.SECOND, 02);

		final GregorianCalendar completionDate = new GregorianCalendar();
		completionDate.setTimeZone(TimeZone.getTimeZone("UTC"));
		completionDate.set(Calendar.YEAR, 2013);
		completionDate.set(Calendar.MONTH, 11);
		completionDate.set(Calendar.DAY_OF_MONTH, 15);
		completionDate.set(Calendar.HOUR_OF_DAY, 16);
		completionDate.set(Calendar.MINUTE, 05);
		completionDate.set(Calendar.SECOND, 16);

		final Application application = new Application()
		.custom("appID", "7565-2373-0086-8937")
		.custom("source", "Telephone")
		.custom("status", "Pending")
		.custom("creationDate", creationDate.getTime())
		.custom("completionDate", completionDate.getTime());

		// Example Plan object
		//
		// digitalData.plan = {
		//		name: "Family Advantage 250",
		// 		type: "EPO",
		//		policyStatus: "Current",
		//		premium: 454.25,
		//		effectiveDate: new Date("December 15, 2013 16:05:16")
		// };

		final GregorianCalendar effectiveDate = new GregorianCalendar();
		effectiveDate.setTimeZone(TimeZone.getTimeZone("UTC"));
		effectiveDate.set(Calendar.YEAR, 2013);
		effectiveDate.set(Calendar.MONTH, 11);
		effectiveDate.set(Calendar.DAY_OF_MONTH, 15);
		effectiveDate.set(Calendar.HOUR_OF_DAY, 16);
		effectiveDate.set(Calendar.MINUTE, 05);
		effectiveDate.set(Calendar.SECOND, 16);

		final Plan plan = new Plan()
		.custom("name", "Family Advantage 250")
		.custom("type", "EPO")
		.custom("policyStatus", "Current")
		.custom("premium", 454.25)
		.custom("effectiveDate", effectiveDate.getTime());

		final HealthcareDigitalData ddb = new HealthcareDigitalData()
		.addMember(member)
		.setApplication(application)
		.setPlan(plan);

		// Add an existing object
		ddb.pageInstanceId("MyHomePage-Production");

		System.out.println(ddb.toString());

		final String expected = new TestUtil().loadJsonFromFile("/healthcare-example.json");

		JSONAssert.assertEquals(expected, ddb.toString(), true);
	}
}
