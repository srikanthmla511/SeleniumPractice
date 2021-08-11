package com.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Check {

	public static void main(String[] args) throws Exception{
		
	WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
   /* driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		
		driver.findElement(By.id("englishchbx")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("chinesechbx")).click();
		Thread.sleep(2000);
		
		WebElement checkbox=driver.findElement(By.id("frenchchbx"));
		  checkbox.click();
		  
		  Thread.sleep(2000);
		  
		  if(checkbox.isSelected())
			  
			  checkbox.click(); //uncheck
		
		*/
		
		
		
		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		Thread.sleep(2000);
		
		
		
		WebElement checkbox=driver.findElement(By.id("ctl00$mainContent$chk_Govt"));
		  checkbox.click();
		  Thread.sleep(2000);
		  
		  if(checkbox.isSelected())
			  
			  checkbox.click(); //uncheck
		
	}

}
