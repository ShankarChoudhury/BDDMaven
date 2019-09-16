package cucumberMavenPack;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(tags={"@one"},features={"./features/BDDtestDatatableSet.feature"},glue="cucumberMavenPack",plugin={"html:target/myDatReport","json:C:\\java-workspace\\MavenProject\\target\\cucumber.json"})
//@RunWith(Cucumber.class)
//@Cucumber.Options(tags={"@one,@two"},features={"./features"},glue="cucumberMavenPack",format={"html:./target/demo.html","json:target/demo.json"})

public class OrangeRunner {








}
