package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

import com.tools.utils.FieldGenerator;

import java.util.List;

public class CategoriesPage extends AbstractPage {
	@FindBy(css = "ul#categories_container")
	WebElementFacade categoriesContainer;
	@FindBy(css="input#title")
	WebElementFacade searchBar;
	@FindBy(css="div[class*='list-container']")
	WebElementFacade cont;
	@FindBy(css = "#add-category")
	WebElementFacade addCategoryButton;
	@FindBy(css = "#category-name")
	WebElementFacade addCategoryName;
	@FindBy(css = "#save-category")
	WebElementFacade saveCategory;


	//Method to select a Category 
	public void selectCategory(String categoryName) {
		WebElementFacade selectedCategory = getCategory(categoryName);
		(selectedCategory.find(By.cssSelector("h3 a"))).click();
	}

	public WebElementFacade getCategory(String categoryName) {
		List<WebElementFacade> categoryList = categoriesContainer.thenFindAll("div[class*='categoryDetails']");
		WebElementFacade selectedCategory = null;
		for (WebElementFacade category : categoryList) {
			if (category.find(By.cssSelector("h3 a")).getText().contains(categoryName)) { //contentEquals
				selectedCategory = category;
				category.click();
				//break;
			}
		}

		return selectedCategory;
	}
	
	/*
	 * @Author Larisa
	 * Method to create a category
	 * */
	public void createCategory() {
		addCategoryButton.click();
		addCategoryName.click();
		//typeInto(addCategoryName, "HelloGL - " + FieldGenerator.generateStringValue(6, FieldGenerator.TypeOfString.ALPHANUMERIC));
		addCategoryName.sendKeys("HelloGL - " + FieldGenerator.generateStringValue(6, FieldGenerator.TypeOfString.ALPHANUMERIC));
		saveCategory.click();
		
	}

	public void searchItem(String itemName){
		searchBar.waitUntilClickable();
		searchBar.clear();
		searchBar.sendKeys(itemName);
	}
	
	

}
