package checkboxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkboxes {

	public static void main(String[] args) throws Exception{
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://github.com/login");
		
		WebElement usernameTxt=driver.findElement(By.id("login_field"));
		WebElement password=driver.findElement(By.id("password"));
		
		if(usernameTxt.isEnabled()) {
			if(usernameTxt.isDisplayed()) {
				usernameTxt.sendKeys("srikanthmla511@gmail.com");	
			}
		}
		
		if(password.isEnabled()) {
			if(password.isDisplayed()) {
				password.sendKeys("srikanthmla511");
			}
		}
		
		driver.findElement(By.name("commit")).click();
		
		

	}

}
