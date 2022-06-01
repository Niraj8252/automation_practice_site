package com.automation.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasketPage {
	
	@FindBy(xpath="//div[@class='wc-proceed-to-checkout']/a")
	private WebElement proceedToCeckoutLnk;
	
	public BasketPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickProceedLnk()
	{
		proceedToCeckoutLnk.click();
	}


}
