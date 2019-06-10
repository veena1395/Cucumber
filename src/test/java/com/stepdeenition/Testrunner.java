package com.stepdeenition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/resources/features",tags= {"@Reg"}, glue = "com.stepdeenition", strict = true, monochrome = true, plugin = {"pretty","json:target/report.json"})
public class Testrunner {

}
