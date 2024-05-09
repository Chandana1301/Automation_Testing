package PROJECT_OF_COM;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver;

public class assignment_1 {
	public static void main(String[] args) throws IOException, InterruptedException
 {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.getcalley.com/page-sitemap.xml");
		TakesScreenshot t=(TakesScreenshot)driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest = new File("./SS/s1.png");
		FileUtils.copyFile(src, dest);
		
		driver.findElement(By.cssSelector("a[href='https://www.getcalley.com/']")).click();
		Thread.sleep(2000);
		Dimension d=new Dimension(1920,1080);
		driver.manage().window().setSize(d);
		Thread.sleep(1000);
		File src1 = t.getScreenshotAs(OutputType.FILE);
		File dest1 = new File("./SS/s2.png");
		FileUtils.copyFile(src1, dest1); 
		driver.navigate().to("https://www.getcalley.com/page-sitemap.xml");
		
		
	
     
		driver.findElement(By.cssSelector("a[href='https://www.getcalley.com/calley-call-from-browser/']")).click();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Dimension d1=new Dimension(1366,768);
		driver.manage().window().setSize(d1);
		Thread.sleep(1000);
		File src2 = t.getScreenshotAs(OutputType.FILE);
		File dest2 = new File("./SS/s3.png");
		FileUtils.copyFile(src2, dest2); 
		driver.navigate().to("https://www.getcalley.com/page-sitemap.xml");
		Thread.sleep(3000);
//		
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("a[href='https://www.getcalley.com/calley-pro-features/']")).click();
		driver.manage().window().maximize();
		Dimension d2=new Dimension(1536,864);
		driver.manage().window().setSize(d2);
		Thread.sleep(1000);
		File src3 = t.getScreenshotAs(OutputType.FILE);
		File dest3 = new File("./SS/s4.png");
		FileUtils.copyFile(src3, dest3); 
		driver.navigate().to("https://www.getcalley.com/page-sitemap.xml");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("a[href='https://www.getcalley.com/best-auto-dialer-app/']")).click();
		driver.manage().window().maximize();
		Dimension d3=new Dimension(360,640);
		driver.manage().window().setSize(d3);
		Thread.sleep(1000);
		File src4 = t.getScreenshotAs(OutputType.FILE);
		File dest4 = new File("./SS/s5.png");
		FileUtils.copyFile(src4, dest4); 
		driver.navigate().to("https://www.getcalley.com/page-sitemap.xml");
		
		
		driver.findElement(By.cssSelector("a[href='https://www.getcalley.com/how-calley-auto-dialer-app-works/']")).click();
		driver.manage().window().maximize();
		Dimension d4=new Dimension(414,896);
		driver.manage().window().setSize(d4);
		Thread.sleep(1000);
		File src5 = t.getScreenshotAs(OutputType.FILE);
		File dest5 = new File("./SS/s6.png");
		FileUtils.copyFile(src5, dest5); 
		driver.navigate().to("https://www.getcalley.com/page-sitemap.xml");
		driver.close();
		
		
		
		
		
		
		
		
		
		
	}

}
