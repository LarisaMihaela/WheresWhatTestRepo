package com.tests;

import com.steps.api.ApiBookingSteps;
import com.steps.api.ApiCategorySteps;
import com.steps.api.ApiItemSteps;
import com.steps.api.ApiLoginSteps;
import com.steps.frontend.HomePageSteps;
import com.steps.frontend.flow_steps.LoginFlowSteps;
import com.tests.BaseTest;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class LoginAPITest extends BaseTest {
	@Steps
	LoginFlowSteps loginFlowSteps;
	@Steps
	ApiLoginSteps apiLoginSteps;
	@Steps
	HomePageSteps homePageSteps;
	@Steps
	ApiCategorySteps apiCategorySteps;
	@Steps
	ApiItemSteps apiItemSteps;
	@Steps
	ApiBookingSteps apiBookingSteps;
	
	
	@Test
	public void loginAPITest(){
		apiLoginSteps.loginAsAdmin();
		apiCategorySteps.createCategory();
		apiItemSteps.createItem();
	//	apiBookingSteps.bookItem();
	}
}
