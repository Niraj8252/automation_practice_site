package com.automation.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.genericLibrary.WebDriverDataLibrary;

public class ShopPage {
	
	@FindBy(xpath = "//img[@title='Functional Programming in JS']")
	private WebElement FunctionalBooklnk;
	
	
	public ShopPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickBook()
	{
		FunctionalBooklnk.click();
		
	}
	
	public void scrollPage(WebDriver driver)
	{
		WebDriverDataLibrary.initializejse(driver);
		WebDriverDataLibrary.scrollTillElement(FunctionalBooklnk);
	}

}
