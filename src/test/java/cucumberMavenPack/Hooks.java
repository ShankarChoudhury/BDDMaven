package cucumberMavenPack;

import cucumber.api.Scenario;
//import gherkin.formatter.model.Scenario;
//import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
//*** Class name should always be "Hooks" to get invoked //***
public class Hooks {

	@Before
	public void setUp(Scenario scenario){
		
		
		System.out.println("This is a set up method in Test Package --- Scenario Starts-----");
		
		System.out.println("The Classname invoked is "+scenario.getClass());
	//	scenario.write("This is in Scenario start tests");
		System.out.println(scenario.toString());
		
	}
	@After
	public void testDown(Scenario scenaendLog){
		
		
		System.out.println("This is a teardown method in Test Package ----- Scenario Ends-----'status'"+scenaendLog.isFailed());
		
	}
}
