package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchField {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.switchTo().activeElement().sendKeys("Seetha Rama");
	
}
}
