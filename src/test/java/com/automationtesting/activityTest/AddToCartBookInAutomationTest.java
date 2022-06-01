package com.automationtesting.activityTest;

import org.testng.annotations.Test;

import com.automation.elementRepository.BasketPage;
import com.automation.elementRepository.BillingPage;
import com.automation.elementRepository.FunctionalProgrammingPage;
import com.automation.elementRepository.HomePage;
import com.automation.elementRepository.ShopPage;
import com.automation.genericLibrary.BaseClass;
import com.automation.genericLibrary.ExcelDataLibrary;
import com.automation.genericLibrary.IconstantPathLibrary;

public class AddToCartBookInAutomationTest extends BaseClass{
	
	
	@Test
public void addToCartBook()
{
		ExcelDataLibrary.openExcel(IconstantPathLibrary.EXCELFILEPATH);
		String firstName=ExcelDataLibrary.getDataFromExcel("AddCartBook",2 , 1);
		String lastName=ExcelDataLibrary.getDataFromExcel("AddCartBook",2 , 2);
		String companyName=ExcelDataLibrary.getDataFromExcel("AddCartBook",2 , 3);
		String email=ExcelDataLibrary.getDataFromExcel("AddCartBook",2 , 4);
		String phoneno=ExcelDataLibrary.getDataFromExcel("AddCartBook",2 , 5);
		String country=ExcelDataLibrary.getDataFromExcel("AddCartBook",2 , 6);
		String address=ExcelDataLibrary.getDataFromExcel("AddCartBook",2 , 7);
		String town=ExcelDataLibrary.getDataFromExcel("AddCartBook",2 , 8);
		String state=ExcelDataLibrary.getDataFromExcel("AddCartBook",2 , 9);
		String pinCode=ExcelDataLibrary.getDataFromExcel("AddCartBook",2 , 10);
	HomePage homepage = new HomePage(driver);
	ShopPage shoppage = new ShopPage(driver);
	FunctionalProgrammingPage FunctionalProgrammingPage=new FunctionalProgrammingPage(driver);
	BasketPage basketpage=new BasketPage(driver);
	BillingPage billingPage =new BillingPage (driver);
	
	homepage.clickShop();
	shoppage.scrollPage(driver);
	shoppage.clickBook();
	FunctionalProgrammingPage.clickBasket();
	FunctionalProgrammingPage.clickViewBasket();
	basketpage.clickProceedLnk();
	billingPage.enterShippingDetails(firstName, lastName, companyName, email, phoneno, country, address, town, state, pinCode);
	billingPage.clickCodCheckbox();
	billingPage.clickOrderBtn();
}
}
