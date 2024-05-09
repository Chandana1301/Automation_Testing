package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatingScript {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement username=(WebElement) driver.findElements(By.name("username"));
		username.sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//a[@class='oxd-main-menu-item active']")).click();
		driver.findElement(By.name("firstName")).sendKeys("Chandana");
		driver.findElement(By.name("middleName")).sendKeys("Sridhar");
		driver.findElement(By.name("lastName")).sendKeys("S");
		driver.findElement(By.xpath("//input[@fdprocessedid='kbs90j']")).sendKeys("110222");
		driver.findElement(By.xpath("//input[@fdprocessedid='36hspg']")).sendKeys("3333");
		driver.findElement(By.xpath("//input[@fdprocessedid='fzmjgw']")).sendKeys("KA!@#$%%^");
		driver.findElement(By.xpath("//input[@fdprocessedid='q6r0p9']")).click();
		
		
		
		driver.close();
		
		
		
		
		
	}

}
