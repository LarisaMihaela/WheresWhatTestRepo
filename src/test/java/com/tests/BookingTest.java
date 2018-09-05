package com.tests;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.steps.frontend.BookingSteps;
import com.steps.frontend.CategorySteps;
import com.steps.frontend.HeaderSteps;
import com.steps.frontend.HomePageSteps;
import com.steps.frontend.ItemSteps;
import com.steps.frontend.LoginSteps;
import com.steps.frontend.flow_steps.BookingFlowSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class BookingTest extends BaseTest {
	
	@Steps
	HomePageSteps homePageSteps;
	@Steps
	LoginSteps loginPageSteps;
	@Steps
	BookingFlowSteps bookingFlowSteps;
	@Steps
	BookingSteps bookingSteps;
	@Steps
	HeaderSteps headerSteps;
	@Steps
	CategorySteps categorySteps;

	
	@Test
	public void bookItem() {
		homePageSteps.navigateToHomePage();
		homePageSteps.clickLogin();
		loginPageSteps.login();
		headerSteps.selectHeader("ITEMS");
		categorySteps.createCategory();
		categorySteps.getCategory("Hello");
		
		
		
		
		
	
		
		//bookingFlowSteps.bookAllItemsFromCategory();
		
	}
	
	
}
