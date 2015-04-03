package nl.mirabeau.ceddl4j;

import java.io.IOException;

import org.json.JSONException;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

public class ComponentTest {


	@Test
	public void testComponent() throws IOException, JSONException {

		final DigitalData ddb = DigitalData.create()
				.addComponent()
				.componentInfo()
				.componentID("rog300v")
				.custom("componentName", "How to Use Rogaine")
				.custom("description", "Hair Treatment Video")
				.endComponentInfo()
				.addAttribuut("testAttribuut", "testattr")
				.addPrimaryCategory("test")
				.addCategory("customcat", "testCat")
				.endComponent()
				.addComponent()
				.componentInfo()
				.componentID("rog400v")
				.endComponentInfo()
				.endComponent();

		System.out.println(ddb.toString());

		final String expected = new TestUtil().loadJsonFromFile("/tests/componentTest.json");

		JSONAssert.assertEquals(expected, ddb.toString(), false);
	}




}
