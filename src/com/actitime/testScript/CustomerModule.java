package com.actitime.testScript;

import static org.testng.Assert.fail;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;

@Listeners(com.actitime.generic.ListenerImplimentation.class)
public class CustomerModule extends BaseClass  {
@Test
public void testCreateCustomer() throws EncryptedDocumentException, IOException, InterruptedException {
	Reporter.log("CreateCustomer",true);
	FileLib f=new FileLib();
	String customerName = f.getExcelData("CreateCustomer", 1, 3);
	String customerDescription = f.getExcelData("CreateCustomer", 1, 4);
	HomePage h=new HomePage(driver);
	h.setTasksTab();
	TaskListPage t=new TaskListPage(driver);
	t.getAddNewBtn().click();
	Thread.sleep(2000);
	t.getNewCustomerOption().click();
	Thread.sleep(2000);
	t.getEnterCustomerNameTbx().sendKeys(customerName);
	Thread.sleep(2000);
	t.getCustomerDescriptionTbx().sendKeys(customerDescription);
	Thread.sleep(2000);
	t.getSelectCustomerDD().click();
	Thread.sleep(2000);
	t.getOurCompanyTx().click();
	Thread.sleep(2000);
	t.getCreateCustomerBtn().click();
	Thread.sleep(3000);
			
}

}