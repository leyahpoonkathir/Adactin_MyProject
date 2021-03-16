package com.adactin.runner;

import org.junit.AfterClass;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.automation.base.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//adactin//feature", glue = "com.adactin.stepdefinition",monochrome=true,dryRun=true,
strict=true,tags= {"@Somketest"},plugin={"html:Report1/CucumberReport","pretty","json:Report1/JSONReport.json"})

public class Runner extends BaseClass {
	public static WebDriver driver;

	@BeforeClass
	public static void setUp() {

driver=BaseClass.getBrowser("chrome");

	}

	@AfterClass
	public static void tearDown() {
//		BaseClass.close();

	}

}
