package com.automation.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FunctionalProgrammingPage {
	
	@FindBy(xpath="//button[text()='Add to basket']")
	private WebElement basketBtn;
	
	@FindBy(xpath="//a[text()='View Basket']")
	private WebElement basketViewBtn;
	
	public FunctionalProgrammingPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickBasket()
	{
		basketBtn.click();
		
	}
	
	public void clickViewBasket()
	{
		basketViewBtn.click();
		
	}

}
