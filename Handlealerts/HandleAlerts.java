package Handlealerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAlerts {

	public static void main(String[] args)throws Exception {
				WebDriverManager.chromedriver().setup();
				
				WebDriver driver=new ChromeDriver();
				
			driver.get("http://www.hyrtutorials.com/p/alertsdemo.html");
			
			//Alert Box
			
	/*	driver.findElement(By.id("alertBox")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		
		System.out.println(driver.findElement(By.id("output")).getText());
		
		*/
			
		//confirm box
			
		/*	System.out.println(driver.findElement(By.id("output")).getText());
		
		driver.findElement(By.id("confirmBox")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.id("output")).getText());
		
		driver.findElement(By.id("confirmBox")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().dismiss();
		
		System.out.println(driver.findElement(By.id("output")).getText());
		
		*/
			
	//promptbox
			
			driver.findElement(By.id("promptBox")).click();
			
			System.out.println(driver.switchTo().alert().getText());
			
			driver.switchTo().alert().sendKeys("srikanth");
			
			Thread.sleep(3000);
			
			driver.switchTo().alert().accept();
			
			System.out.println(driver.findElement(By.id("output")).getText());
			
               driver.findElement(By.id("promptBox")).click();
			
			System.out.println(driver.switchTo().alert().getText());
			
			driver.switchTo().alert().dismiss();
			
			System.out.println(driver.findElement(By.id("output")).getText());
			
			Thread.sleep(2000);
			
			driver.quit();
				
			
			
			
				
	}

}
