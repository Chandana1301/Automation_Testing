package qsp;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v118.schema.model.Domain;

public class PrintingAllUrl {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.google.com/");
	driver.switchTo().activeElement().sendKeys("Wipro jobs"+Keys.ENTER);
	 List<WebElement> allinks = driver.findElements(By.tagNameg("a"));
	 for(WebElement link:allinks){
		 System.out.println(link.getText() + " - " + link.getAttribute("href"));
		 }
	driver.quit();
}

}
