package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FbButton {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("chandanasridhar13@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("SRIDHAR9036393663XYZ");
		WebElement click = driver.findElement(By.id("u_0_9_+b"));
		click.click();
		if(true) {
			System.out.println("Enabled");}
		else {
			System.out.println("failed");
		}
		driver.close();
	}
}

			
			
		
			



	}

}
