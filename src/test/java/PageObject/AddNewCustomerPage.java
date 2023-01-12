package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddNewCustomerPage {
	
	//1.Create WebDriver Object
		WebDriver ldriver;
		//2.Create Constructor
		public AddNewCustomerPage(WebDriver rDriver)
		{
			ldriver = rDriver;
			PageFactory.initElements(rDriver, this);
		}
		
		//Find web elements on the web page
		@FindBy(xpath="//a[@href='#']//p[contains(text(),'Customers')]")
		WebElement lnkCustomers_menu;
		
		@FindBy(xpath="//a[@href='/Admin/Customer/List']//p[contains(text(),'Customers')]")
		WebElement lnkCustomers_List;
		
		@FindBy(xpath="//a[@class='btn btn-primary']")
		WebElement Add_New_Customer;
		
		@FindBy(xpath="//input[@id='Email']")
		WebElement txtEmail;
		
		@FindBy(xpath="//input[@id='Password']")
		WebElement txtPassword;
		
		@FindBy(xpath="//input[@id='FirstName']")
		WebElement txtFirstName;
		
		@FindBy(xpath="//input[@id='LastName']")
		WebElement txtLastName;
		
		@FindBy(xpath="//input[@id='Gender_Male']")
		WebElement Gender_Male;
		
		@FindBy(xpath="//input[@id='Gender_Female']")
		WebElement Gender_Female;
		
		@FindBy(xpath="//input[@id='DateOfBirth']")
		WebElement txtDOB;
		
		@FindBy(xpath="//div[@class='k-multiselect-wrap k-floatwrap']")
		WebElement txtCustomerRoles;
		
		@FindBy(xpath="//li[contains(text(),'Administrators)]")
		WebElement ListItemAdministrators;
		
		@FindBy(xpath="//li[contains(text(),'Registered')]")
		WebElement ListItemRegistered;
		
		@FindBy(xpath="//li[contains(text(),'Guests')]")
		WebElement ListItemGuests;
		
		@FindBy(xpath="//li[contains(text(),'Guests')]")
		WebElement ListItemVendors;
		
		@FindBy(xpath="//*[@id='VendorId']")
		WebElement DropdownVendorMgr;
		
		@FindBy(xpath="//input[@id='Company']")
		WebElement txtCompanyName;
		
		@FindBy(xpath="//textarea[@id='AdminComment']")
		WebElement txtAdminComment;
		
		@FindBy(xpath="//select[@id='VendorId']")
		WebElement dropDownVenderMgr;
		
		@FindBy(xpath="//button[@name='save']")
		WebElement btnSave;
		
		//Actions methods for Web element
		public String getPageTitle() {
			return ldriver.getTitle();
		}
		
		public void clickOnCustomersMenu() {
			lnkCustomers_menu.click();
		}
		
		public void clickOnCustomerMenuItem() {
			lnkCustomers_List.click();
		}
		
		public void clickOnAddNewCustomer() {
			Add_New_Customer.click();
		}
		
		public void enterEmail(String email) {
			txtEmail.sendKeys(email);
		}
		
		public void enterPassword(String password) {
			txtPassword.sendKeys(password);
		}
		
		public void enterFirstName(String firstName) {
			txtFirstName.sendKeys(firstName);
		}
		
		public void enterLastName(String lastName) {
			txtLastName.sendKeys(lastName);
		}
		
		public void selectGender(String gender) {
			if(gender.equals("Male"))
			{
				Gender_Male.click();
			}
			else 
			{
				Gender_Female.click();
			}
		}
		
		public void enterDob(String dob) {
			txtDOB.sendKeys(dob);
		}
		
		public void enterCompanyName(String CName) {
			txtCompanyName.sendKeys(CName);
		}
		
		public void enterAdminContent(String content) {
			txtAdminComment.sendKeys(content);
		}
		
		public void enterManageOfVendor(String value) {
			Select drp = new Select(dropDownVenderMgr);
			drp.selectByVisibleText(value);
		}
		
		public void clickOnSave() {
			btnSave.click();
		}
		
		
}
