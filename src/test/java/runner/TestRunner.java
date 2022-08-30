package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\john\\Desktop\\w3school2\\src\\test\\java\\runner\\TestRunner.java", glue = "stepdefination",plugin= {"pretty","html:target/cucumber.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},monochrome=true)
public class TestRunner {

}
