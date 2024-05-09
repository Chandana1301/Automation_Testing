package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DemoCssSelector {


public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.selenium.dev/downloads/");
	driver.findElement(By.cssSelector("a[class=('card-link')"));
	
}
}
