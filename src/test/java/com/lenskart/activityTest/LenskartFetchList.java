package com.lenskart.activityTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class LenskartFetchList {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.lenskart.com/");
		driver.findElement(By.xpath("//input[@name='q']")).click();
		driver.findElement(By.xpath("//a[text()='Acuvue']")).click();
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='widget-text-ellipsis']"));
		int count = 0;
		for(WebElement l : list) {
			count++;
			String productName=l.getText();
			System.out.println(productName);
//			String price = driver.findElement(By.xpath("//div[text()='"+productName+"']/ancestor::div[@class='categoryListing']/descendant::div[@class='col-md-8 no-padding text-left']/span[@class='text-color-black fw700']")).getText();
//			System.out.println(price);
		}
		
		System.out.println("total no of list : "+count);
	}
 
}
