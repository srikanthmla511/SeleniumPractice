package com.SeleniumPractice;




import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class1 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver=new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
	
	driver.manage().window().setSize(new Dimension(1000,1000));
	
	driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
	
	driver.findElement(By.id("btn1")).click();
	
	driver.findElement(By.id("txt1")).sendKeys("HYR");
	
	
	
	
	
	
	

	}

}
