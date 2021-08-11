package Googleautomate;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
	driver.findElement(By.name("q")).sendKeys("selenium tutorial");
	
	Thread.sleep(2000);
	
	
	/*driver.findElement(By.xpath("//input[@name=\"btnk\"]")).sendKeys(Keys.ENTER);*/
	
	driver.findElement(By.name("btnK")).sendKeys(Keys.ENTER);

	/* List <WebElement> list = driver.findElement(By.xpath("//body[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[7]/div[1]/div[2]/div[1]/span[1]\r\n"));
		
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++) {
			
			String listitem=list.get(i).getText();
			
			System.out.println("listitem");
			if(listitem.contains("selenium tutorial w3schools"));
			{
				list.get(i).click();
				break;
			}
			
			*/
			
			
			
		}
		
	}


