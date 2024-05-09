package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DisabledElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		RemoteWebDriver r=(RemoteWebDriver)driver;
		Thread.sleep(2000);
		r.findElement(By.xpath("//li[text()='Disabled']"));
		Thread.sleep(2000);																																																				
		r.executeScript("document.getElementById(\"name\").value='admin'");
		Thread.sleep(2000);
		r.executeScript("document.getElementById(\"email\").value='admin@qspiders.com'");
		Thread.sleep(2000);
		r.executeScript("document.getElementById(\"password\").value='manager'");
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[text()='Register']")).click();
	}

}
