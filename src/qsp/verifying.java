package qsp;
	import java.time.Duration;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	public class verifying {
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://www.facebook.com/");
			Thread.sleep(3000);
			driver.findElement(By.id("email")).sendKeys("chandanasridhar13@gmail.com");
			Thread.sleep(3000);
			driver.findElement(By.id("pass")).sendKeys("SRIDHAR9036393663XYZ");
			Thread.sleep(3000);
			WebElement login = driver.findElement(By.name("login"));
			
			if(login.isEnabled() && login.isDisplayed())
				System.out.println("Login is enabled");
			else
				System.out.println("Login is not enabled");
		
		driver.close();
			
		
		}

}
