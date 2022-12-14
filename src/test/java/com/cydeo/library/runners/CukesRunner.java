package com.cydeo.library.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-report.html",
                "json:target/cucumber-report.json",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber-reports",
                "rerun:target/rerun.txt"
        },
        features="src/test/resources/features",
        glue="com/cydeo/library/steps",
        dryRun = false,
        tags = "@wip"
)

public class CukesRunner {
}
