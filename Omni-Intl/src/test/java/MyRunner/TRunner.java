package MyRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

public class TRunner {
	
	@RunWith(Cucumber.class)
	@CucumberOptions(glue= {"StepDefenitions"},features="Features")
	public class Runner{
	}
	}


