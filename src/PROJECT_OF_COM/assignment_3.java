package PROJECT_OF_COM;


	import java.awt.AWTException;
	import java.awt.RenderingHints.Key;
	import java.awt.Robot;
	import java.awt.event.KeyEvent;
	import java.io.File;
	import java.io.IOException;
	import java.nio.file.StandardCopyOption;
	import java.time.Duration;
	import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.devtools.idealized.Javascript;
	import org.openqa.selenium.interactions.Actions;

	import com.google.common.io.Files;
	public class assignment_3{

		public static void main(String[] args) throws InterruptedException, AWTException, IOException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://demo.dealsdray.com/");
			File f=new File("./prjct.Data/demo-data.xlsx");
			String abpath=f.getAbsolutePath();
			driver.findElement(By.name("username")).sendKeys("prexo.mis@dealsdray.com");

			driver.findElement(By.name("password")).sendKeys("prexo.mis@dealsdray.com");

			driver.findElement(By.xpath("//button[text()='Login']")).click();

			driver.findElement(By.xpath("//span[.=\"Order\"]")).click();

			driver.findElement(By.xpath("//span[.=\"Orders\"]")).click();

			driver.findElement(By.xpath("//button[.=\"Add Bulk Orders\"]")).click();

			driver.findElement(By.xpath("//div[@class='MuiOutlinedInput-root MuiInputBase-root MuiInputBase-colorPrimary MuiInputBase-formControl MuiInputBase-sizeSmall css-uodm64']")).click();
			Robot r=new Robot();
			//		for(int i=1;i<11;i++)
			//		{
			//			r.keyPress(KeyEvent.VK_TAB);
			//		}
			r.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			r.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			r.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			r.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			r.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			r.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			r.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			r.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			r.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(3000);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
			r.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_UP);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[.=\"Import\"]")).click();
			Thread.sleep(1000);
			//WebElement flag = driver.findElement(By.xpath("//*[@id=\"mui-280\"]"));
			WebElement flag = driver.findElement(By.xpath("//tbody//tr[1]"));
			Thread.sleep(4000);
			JavascriptExecutor j=(JavascriptExecutor)driver;
			j.executeScript("arguments[0].scrollIntoView();",flag);
			Thread.sleep(3000);
			TakesScreenshot ts=(TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File(".\\screenshot\\s1.png");
			FileUtils.copyFile(src, dest);
			
			WebElement flag2 = driver.findElement(By.xpath("//tbody//tr[6]"));
			Thread.sleep(4000);
			j.executeScript("arguments[0].scrollIntoView();",flag2);
			TakesScreenshot ts1=(TakesScreenshot)driver;
			File src1 = ts1.getScreenshotAs(OutputType.FILE);
			File dest1 = new File(".\\screenshot\\s2.png");
			FileUtils.copyFile(src1, dest1);
			
			WebElement flag1 = driver.findElement(By.xpath("//tbody//tr[1]"));
			j.executeScript("arguments[0].scrollIntoView();",flag1);
			Thread.sleep(1000);
			WebElement horizontalBar = driver.findElement(By.xpath("//tr[1]//td[4]"));
			Thread.sleep(4000);
			j.executeScript("arguments[0].scrollIntoView();",horizontalBar);
			File src3 = ts1.getScreenshotAs(OutputType.FILE);
			File dest3 = new File(".\\screenshot\\s3.png");
			FileUtils.copyFile(src3, dest3);
			
			WebElement h2= driver.findElement(By.xpath("//tr[5]//td[4]"));
			Thread.sleep(4000);
			j.executeScript("arguments[0].scrollIntoView();",h2);
			Thread.sleep(5000);
			File s2 = ts1.getScreenshotAs(OutputType.FILE);
			File d2 = new File(".\\screenshot\\s4.png");
			FileUtils.copyFile(s2, d2);
			
			WebElement h3= driver.findElement(By.xpath("//tr[1]//td[7]"));
			Thread.sleep(4000);
			j.executeScript("arguments[0].scrollIntoView();",h3);
			Thread.sleep(5000);
			File s3 = ts1.getScreenshotAs(OutputType.FILE);
			File d3 = new File(".\\screenshot\\s5.png");
			FileUtils.copyFile(s3, d3);
			
			WebElement h4= driver.findElement(By.xpath("//tr[6]//td[7]"));
			Thread.sleep(4000);
			j.executeScript("arguments[0].scrollIntoView();",h4);
			Thread.sleep(5000);
			File s4 = ts1.getScreenshotAs(OutputType.FILE);
			File d4 = new File(".\\screenshot\\s6.png");
			FileUtils.copyFile(s4, d4);
			
			WebElement h5= driver.findElement(By.xpath("//tr[1]//td[10]"));
			Thread.sleep(4000);
			j.executeScript("arguments[0].scrollIntoView();",h5);
			Thread.sleep(5000);
			File s5 = ts1.getScreenshotAs(OutputType.FILE);
			File d5 = new File(".\\screenshot\\s7.png");
			FileUtils.copyFile(s5, d5);
			
			WebElement h6= driver.findElement(By.xpath("//tr[6]//td[10]"));
			Thread.sleep(4000);
			j.executeScript("arguments[0].scrollIntoView();",h6);
			Thread.sleep(5000);
			File s6 = ts1.getScreenshotAs(OutputType.FILE);
			File d6 = new File(".\\screenshot\\s8.png");
			FileUtils.copyFile(s6, d6);
			
			WebElement h7= driver.findElement(By.xpath("//tr[1]//td[13]"));
			Thread.sleep(4000);
			j.executeScript("arguments[0].scrollIntoView();",h7);
			Thread.sleep(5000);
			File s7 = ts1.getScreenshotAs(OutputType.FILE);
			File d7 = new File(".\\screenshot\\s9.png");
			FileUtils.copyFile(s7, d7);
			
			WebElement h8= driver.findElement(By.xpath("//tr[6]//td[13]"));
			Thread.sleep(2000);
			j.executeScript("arguments[0].scrollIntoView();",h8);
			Thread.sleep(2000);
			File s8 = ts1.getScreenshotAs(OutputType.FILE);
			File d8 = new File(".\\screenshot\\s10.png");
			FileUtils.copyFile(s8, d8);
			
			WebElement h9= driver.findElement(By.xpath("//tr[1]//td[16]"));
			Thread.sleep(2000);
			j.executeScript("arguments[0].scrollIntoView();",h9);
			Thread.sleep(2000);
			File s9 = ts1.getScreenshotAs(OutputType.FILE);
			File d9 = new File(".\\screenshot\\s11.png");
			FileUtils.copyFile(s9, d9);
			
			WebElement h10= driver.findElement(By.xpath("//tr[6]//td[16]"));
			Thread.sleep(2000);
			j.executeScript("arguments[0].scrollIntoView();",h10);
			Thread.sleep(2000);
			File s10 = ts1.getScreenshotAs(OutputType.FILE);
			File d10 = new File(".\\screenshot\\s12.png");
			FileUtils.copyFile(s10, d10);
			
			WebElement h11= driver.findElement(By.xpath("//tr[1]//td[19]"));
			Thread.sleep(2000);
			j.executeScript("arguments[0].scrollIntoView();",h11);
			Thread.sleep(5000);
			File s11 = ts1.getScreenshotAs(OutputType.FILE);
			File d11 = new File(".\\screenshot\\s13.png");
			FileUtils.copyFile(s11, d11);
			
			WebElement h12= driver.findElement(By.xpath("//tr[6]//td[22]"));
			Thread.sleep(2000);
			j.executeScript("arguments[0].scrollIntoView();",h12);
			Thread.sleep(2000);
			File s12 = ts1.getScreenshotAs(OutputType.FILE);
			File d12 = new File(".\\screenshot\\s14.png");
			FileUtils.copyFile(s12, d12);
			
			WebElement h13= driver.findElement(By.xpath("//tr[1]//td[25]"));
			Thread.sleep(2000);
			j.executeScript("arguments[0].scrollIntoView();",h13);
			Thread.sleep(2000);
			File s13 = ts1.getScreenshotAs(OutputType.FILE);
			File d13 = new File(".\\screenshot\\s15.png");
			FileUtils.copyFile(s13, d13);
			
			WebElement h14= driver.findElement(By.xpath("//tr[6]//td[25]"));
			Thread.sleep(2000);
			j.executeScript("arguments[0].scrollIntoView();",h14);
			Thread.sleep(2000);
			File s14 = ts1.getScreenshotAs(OutputType.FILE);
			File d14 = new File(".\\screenshot\\s16.png");
			FileUtils.copyFile(s14, d14);
			
			WebElement h15= driver.findElement(By.xpath("//tr[1]//td[28]"));
			Thread.sleep(2000);
			j.executeScript("arguments[0].scrollIntoView();",h15);
			Thread.sleep(2000);
			File s15 = ts1.getScreenshotAs(OutputType.FILE);
			File d15 = new File(".\\screenshot\\s17.png");
			FileUtils.copyFile(s15, d15);
			
			WebElement h16= driver.findElement(By.xpath("//tr[6]//td[31]"));
			Thread.sleep(2000);
			j.executeScript("arguments[0].scrollIntoView();",h16);
			Thread.sleep(2000);
			File s16 = ts1.getScreenshotAs(OutputType.FILE);
			File d16 = new File(".\\screenshot\\s18.png");
			FileUtils.copyFile(s16, d16);
			
			WebElement h17= driver.findElement(By.xpath("//tr[1]//td[33]"));
			Thread.sleep(2000);
			j.executeScript("arguments[0].scrollIntoView();",h17);
			Thread.sleep(2000);
			File s17 = ts1.getScreenshotAs(OutputType.FILE);
			File d17 = new File(".\\screenshot\\s19.png");
			FileUtils.copyFile(s17, d17);
			
			WebElement h18= driver.findElement(By.xpath("//tr[6]//td[33]"));
			Thread.sleep(2000);
			j.executeScript("arguments[0].scrollIntoView();",h18);
			Thread.sleep(2000);
			File s18= ts1.getScreenshotAs(OutputType.FILE);
			File d18 = new File(".\\screenshot\\s20.png");
			FileUtils.copyFile(s18, d18);
			driver.close();
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			









		}
	}


