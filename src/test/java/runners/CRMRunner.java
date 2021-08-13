package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		//publish=true,
		features="src//test//resources//Features//CRMLoginfeature.feature",
		glue = {"StepDevs"},
		//dryRun = true,
		monochrome=true,
		plugin= {"html:target/reports/CRMReport.html"}
		
		
		//tags = "@ModuleOne and @RegressionTest"
		//tags = "@ModuleOne" // all the test case will run
		//tags = "@SmokeTest",
		//tags = "@RegressionTest"
		// tags = "@RegressionTest or @SmokeTest" // OR // tags = "@RegressionTest , @SmokeTest"
		// tags = "@RegressionTest" and "@SmokeTest"		
		//tags = "@ModuleOne and not @RegressionTest and not @SmokeTest"  		
		//plugin= {"pretty"}
)
public class CRMRunner
{

}
