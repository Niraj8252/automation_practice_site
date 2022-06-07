package com.automation.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(linkText="Shop")
	private WebElement shopLnk;
	
	@FindBy(xpath="//img[@alt='Thinking in HTML']")
	private WebElement ThinkingHTMLLnk;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickShop()
	{
		shopLnk.click();
	}
	public void clickThinkingHTML()
	{
		ThinkingHTMLLnk.click();
	}

}
