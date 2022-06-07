package com.automationtesting.activityTest;

import org.testng.annotations.Test;

import com.automation.elementRepository.HomePage;
import com.automation.elementRepository.ShopPage;
import com.automation.elementRepository.ThinkinginHTMLPage;
import com.automation.genericLibrary.BaseClass;
import com.automation.genericLibrary.ExcelDataLibrary;
import com.automation.genericLibrary.IconstantPathLibrary;

public class DescriptionAndReviewTest extends BaseClass {
	
	@Test
	public void descriptionReviewTest()
	{
		ExcelDataLibrary.openExcel(IconstantPathLibrary.EXCELFILEPATH);
		String firstName=ExcelDataLibrary.getDataFromExcel("AddCartBook",2 , 1);
		String email=ExcelDataLibrary.getDataFromExcel("AddCartBook",2 , 4);
		String msg=ExcelDataLibrary.getDataFromExcel("AddCartBook",2 , 11);
	HomePage homepage = new HomePage(driver);
	ShopPage shoppage = new ShopPage(driver);
	ThinkinginHTMLPage thinkinginHTMLPage=new ThinkinginHTMLPage(driver);
	
	homepage.clickShop();
	shoppage.clickHome();
	homepage.clickThinkingHTML();
	thinkinginHTMLPage.scrollPage(driver);
	thinkinginHTMLPage.printDescription();
	thinkinginHTMLPage.clickReviewTab();
	thinkinginHTMLPage.enterReviewNameEmail(firstName, email, msg);
}
}