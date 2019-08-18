package org.cts;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snap {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vjaya\\eclipse-Bala\\Test\\driver\\chromedriver5.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.snapdeal.com");
	
	WebElement src=driver.findElement(By.xpath("//input[@id='inputValEnter']"));
	src.sendKeys("iphone 7");
	
	WebElement clk=driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
	clk.click();
	
	
	WebElement phone=driver.findElement(By.xpath("(//p[text()='Apple iPhone 7 ( 32GB , 2 GB ) Black'])[1]"));
	phone.click();
	
	
	String par=driver.getWindowHandle();
	Set<String> all=driver.getWindowHandles();
	
	for(String x:all)
	{
		
		if(!par.equals(x))
		{
			
			driver.switchTo().window(x);		}
		
		
	}
	
	
	WebElement add=driver.findElement(By.xpath("//div[@id='add-cart-button-id']"));
	add.click();
	
	
	
	
	
	
	
	}

}
