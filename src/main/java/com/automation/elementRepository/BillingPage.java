package com.automation.elementRepository;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.genericLibrary.WebDriverDataLibrary;

public class BillingPage {
	
	@FindBy(id="billing_first_name")
	private WebElement firstNametxt;
	
	@FindBy(id="billing_last_name")
	private WebElement lastNametxt;
	
	@FindBy(id="billing_company")
	private WebElement companyNametxt;
	
	@FindBy(name="billing_email")
	private WebElement emailtxt;
	
	@FindBy(name="billing_phone")
	private WebElement phonetxt;
	
	@FindBy(id="s2id_billing_country")
	private WebElement coutryDropdow;
	
	
	
	@FindBy(id="s2id_autogen1_search")
	private WebElement countrytxtField;
	
	@FindBy(id="billing_address_1")
	private WebElement addresstxt;
	
	@FindBy(name="billing_city")
	private WebElement towntxt;
	
	@FindBy(name="billing_state")
	private WebElement statetxt;
	
	@FindBy(id="billing_postcode")
	private WebElement postalcodetxt;
	
	@FindBy(id="payment_method_cod")
	private WebElement codPayamentCeckbox;
	
	@FindBy(id="place_order")
	private WebElement placeOrderBtn;;
	
	public BillingPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void enterShippingDetails(String firstName, String lastName,String companyName,String email,String phoneNo)
	{
		firstNametxt.sendKeys(firstName);
		lastNametxt.sendKeys(lastName);
		companyNametxt.sendKeys(companyName);
		emailtxt.sendKeys(email);
		phonetxt.sendKeys(phoneNo);
		
			
	}
	public void enterCounntryAddTowndata(String countryName,String address,String town)
	{
		coutryDropdow.click();
		countrytxtField.sendKeys(countryName,Keys.ENTER);
		addresstxt.sendKeys(address);
		towntxt.sendKeys(town);


	}
	
	public void enterStateAndPin(String stateName,String pinCode)
	{
		statetxt.sendKeys(stateName);
		postalcodetxt.sendKeys(pinCode);
	}
	
	public void scrollPageBillPage(WebDriver driver)
	{
		WebDriverDataLibrary.initializejse(driver);
		WebDriverDataLibrary.scrollTillElement(codPayamentCeckbox);
	}
	public void clickCodCheckbox()
	{
		codPayamentCeckbox.click();
	}
	public void clickOrderBtn()
	{
		placeOrderBtn.click();
	}
}
