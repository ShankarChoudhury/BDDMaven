package cucumberMavenPack;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(tags={"@one"},features={"./features/testBulkData.feature"},
glue="cucumberMavenPack",
plugin = {"html:./target/cucumber-html-report","pretty:target/cucumber-pretty-report.txt","junit:target/cucumber-results.xml",
//format={"pretty:target/cucumber-pretty-report.txt"}
"json:C:\\java-workspace\\MavenProject\\target\\cucumber.json"})
//format={"junit:target/cucumber-results.xml"}
public class BulkDataRunner {	

}

////@RunWith(Cucumber.class)
//@Cucumber.Options(tags={"@one,@two"},features={""},glue="",format={"html:target/samplehtml","json:/samplejson"})

//@RunWith(Cucumber.class)
//@Cucumber.Options(tags={"@one,@two,@three"},features={"./Features/tets.feature"},glue="CucumberPack",format={"html:/target/demdrep","json:target/demojson"})
