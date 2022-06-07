package com.automation.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.genericLibrary.WebDriverDataLibrary;

public class ThinkinginHTMLPage {
	
	@FindBy(xpath = "//a[text()='Description']")
	private WebElement Descriptionlnk;
	
	@FindBy(xpath = "//div[@id='tab-description']/div/div/div/p")
	private WebElement ProductDescriptionlnk;
	
	@FindBy(xpath = "//div[@class='woocommerce-tabs wc-tabs-wrapper']/ul//li[@class='reviews_tab']/a")
	private WebElement Reviewtab;
	
	@FindBy(xpath = "//textarea[@id='comment']")
	private WebElement commentTxtField;
	
	@FindBy(xpath = "//input[@id='author']")
	private WebElement nameTxtField;
	@FindBy(xpath = "//input[@id='email']")
	private WebElement emailTxtField;
	
	@FindBy(xpath = "//input[@id='submit']")
	private WebElement submitBtn;
	
	
	public ThinkinginHTMLPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void scrollPage(WebDriver driver)
	{
		WebDriverDataLibrary.initializejse(driver);
		WebDriverDataLibrary.scrollTillElement(Descriptionlnk);
	}
	
	public void printDescription()
	{
		System.out.println(ProductDescriptionlnk.getText());
	}
	public void clickReviewTab()
	{
		Reviewtab.click();
	}
	public void enterReviewNameEmail(String msg,String name,String email)
	{
		commentTxtField.sendKeys(msg);
		nameTxtField.sendKeys(name);
		emailTxtField.sendKeys(email);
		submitBtn.click();
	}

}
