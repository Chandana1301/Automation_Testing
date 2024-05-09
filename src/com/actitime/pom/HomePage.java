package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(id="logoutLink")
	private WebElement logout;
	@FindBy(xpath="//div[text()='TASKS']")
	private WebElement tasksTab;

	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	
	}
	public void setLogout() {
		logout.click();	
	}
	public void setTasksTab() {
		tasksTab.click();
	}

}
