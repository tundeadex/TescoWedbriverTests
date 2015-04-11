package com.company.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Babatunde on 28/03/2015.
 */

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/"}, glue = {"com.company.stepdefs"}, tags = {"@weaver2"})
public class TestRunner {
}
