package com.SeleniumPractice;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Radiobuttons {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
	driver.get("https://www.keynotesupport.com/internet/web-contact-form-example-radio-buttons.shtml");
	
	int a=driver.findElements(By.xpath("//input[@name='software']")).size();
	
	System.out.println(a);
	
	for(int i=0;i<=a;i++)
	{
		 driver.findElements(By.xpath("//input[@name='software']")).get(1).click();
	}
	
	
	/*List<WebElement> RadioButton = driver.findElements(By.name("software"));
    
    int Size = RadioButton.size();               

    for(int i=0; i <= Size; i++)                      
   { 
 String val = RadioButton.get(i).getAttribute("value");

 if (val.equalsIgnoreCase("Photoshop")) 
 {
 RadioButton.get(i).click();
 break;
     }
   }*/
		
  }

}
