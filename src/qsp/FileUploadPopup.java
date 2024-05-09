package qsp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FileUploadPopup {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("C:\\Users\\S Chandana\\OneDrive\\Desktop\\resume.html");
		Thread.sleep(3000);
		File f=new file("./Data/R.txt");
		String abpath=f.getAbsolutePath();
		driver.findElement(By.id("cv"));

	}

}
