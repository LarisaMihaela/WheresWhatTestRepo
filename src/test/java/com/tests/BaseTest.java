package com.tests;


import org.junit.Before;
import org.openqa.selenium.WebDriver;

import com.steps.frontend.HomePageSteps;

import net.thucydides.core.annotations.Managed;

public class BaseTest {
	@Managed(uniqueSession = true)
	public WebDriver driver;
	HomePageSteps homePageSteps;
	
	//the the Host and the Port and the property for qa-env
	@Before
	public void setup() {

		System.setProperty("http.proxyHost", "localhost");
		System.setProperty("http.proxyPort", "8080");
		System.setProperty("https.proxyHost", "localhost");
		System.setProperty("https.proxyPort", "8080");
		System.setProperty("env", "qa-env");

	}
}
