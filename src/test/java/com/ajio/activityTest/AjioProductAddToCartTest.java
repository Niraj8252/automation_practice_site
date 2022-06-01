package com.ajio.activityTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AjioProductAddToCartTest {
	public static void main(String[] args) throws InterruptedException {
		
		
			WebDriverManager.chromedriver().setup();
			WebDriver driver= new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.get("https://www.ajio.com/");
			WebElement men = driver.findElement(By.xpath("//ul[@class='level-first false']//a[@title='MEN']"));
			Actions act = new Actions(driver);
			act.moveToElement(men).perform();
			driver.findElement(By.linkText("Clothing")).click();
			
//			driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("shoes");
//			driver.findElement(By.xpath("//button[@class='rilrtl-button']")).click();
			driver.findElement(By.xpath("//label[@for='Men']")).click();
			driver.findElement(By.xpath("//label[@for='Men - Tshirts']")).click();
			
			driver.findElement(By.xpath("(//div[@class='contentHolder']//div[text()='Fastdry Active Crew-Neck T-shirt'])[1]")).click();
			driver.findElement(By.xpath("(//span[text()='M'])[1]")).click();
	
	
	}

}
