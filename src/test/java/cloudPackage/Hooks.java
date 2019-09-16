package cloudPackage;

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
		
		System.out.println("The scenario invoked is "+scenario.getName());
	
		
	}
	@After("@InsCo")
	public void testDown(Scenario scenaendLog){
		
		
		System.out.println("---- Scenario Ends-----'"+scenaendLog.getName());
		
	}
}
