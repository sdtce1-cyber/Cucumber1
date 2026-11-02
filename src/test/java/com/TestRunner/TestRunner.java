
package com.TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features/login.feature",
    glue = "com.Step_definitions",
    monochrome = true,
    plugin = { "pretty","html:target/cucumber-report.html", 
    		"json:target/cucumber.json"
    		
    }
)
public class TestRunner {
	
}
