package com.automationtesting.activityTest;

import org.testng.annotations.Test;

import com.automation.elementRepository.HomePage;
import com.automation.genericLibrary.BaseClass;

public class AddToCartBookInAutomationTest extends BaseClass{
	
	
	@Test
public void addToCartBook()
{
	HomePage homepage = new HomePage(driver);
	homepage.clickShop();
}
}
