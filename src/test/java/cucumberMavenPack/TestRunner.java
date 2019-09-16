package cucumberMavenPack;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
//@RunWith(Cucumber)
//@RunWith(CucumberWithSerenity.class)
//@CucumberOptions
@CucumberOptions(tags= {"@oneHRM,@InsCo"},features={"features"},
glue="cloudPackage",
plugin={"html:target/cucumber-html-report","pretty:target/cucumber-html-report/cucumber-pretty-report.txt","junit:target/cucumber-html-report/cucumber-results.xml","json:target/cucumber.json"}
//format={"pretty:target/cucumber-pretty-report.txt"}
/*,dryRun=true*/)
//format={"junit:target/cucumber-results.xml"}
//public class TestRunner extends AbstractTestNGCucumberTests{	
	public class TestRunner{

}
//googlesearch.feature