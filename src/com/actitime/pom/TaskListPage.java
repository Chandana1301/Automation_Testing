package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {

		
		@FindBy(xpath="//div[text()='Add New']")
		private WebElement addNewBtn;
		
		@FindBy(xpath="//div[text()='+ New Customer']")
		private WebElement newCustomerOption;
		
		@FindBy(id="customerLightBox_nameField")
		private WebElement enterCustomerNameTbx;
		
		@FindBy(id="customerLightBox_descriptionField")
		private WebElement customerDescriptionTbx;
		
		@FindBy(xpath="//button[contains(@id,'ext-gen')]")
		private WebElement selectCustomerDD;
		
		@FindBy(xpath="//a[text()='Our Company']")
		private WebElement ourCompanyTx;
		
		@FindBy(xpath="//span[text()='Create Customer']")
		private WebElement createCustomerBtn;
		
		public TaskListPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

		public WebElement getAddNewBtn() {
			return addNewBtn;
		}

		public WebElement getNewCustomerOption() {
			return newCustomerOption;
		}

		public WebElement getEnterCustomerNameTbx() {
			return enterCustomerNameTbx;
		}

		public WebElement getCustomerDescriptionTbx() {
			return customerDescriptionTbx;
		}

		public WebElement getSelectCustomerDD() {
			return selectCustomerDD;
		}

		public WebElement getOurCompanyTx() {
			return ourCompanyTx;
		}

		public WebElement getCreateCustomerBtn() {
			return createCustomerBtn;
		}
		

}
