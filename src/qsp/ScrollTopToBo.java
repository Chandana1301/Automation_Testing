package qsp;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollTopToBo {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.bbc.com/");
	JavascriptExecutor j=(JavascriptExecutor)driver;
	Thread.sleep(2000);
	j.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	j.executeScript("window.scrollTo(0,0)");
}
}
