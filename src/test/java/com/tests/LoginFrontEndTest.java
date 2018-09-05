package com.tests;

import org.junit.runner.RunWith;

import com.steps.frontend.flow_steps.LoginFlowSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;

@RunWith(SerenityRunner.class)
public class LoginFrontEndTest extends BaseTest{
	
	@Steps
	LoginFlowSteps loginFlowSteps;
	
	@Test
	public void loginFrontend() {
		loginFlowSteps.login();
	}
	
	
	
	
}
