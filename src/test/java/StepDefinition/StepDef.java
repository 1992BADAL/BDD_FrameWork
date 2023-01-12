package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageObject.AddNewCustomerPage;
import PageObject.LoginPage;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class StepDef {

	public WebDriver driver;
	public LoginPage loginPg;
	public AddNewCustomerPage addNewCustPg;

	@Given("User lauch chrome browser")
	public void user_lauch_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		loginPg = new LoginPage(driver);
		addNewCustPg = new AddNewCustomerPage(driver);

	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		driver.get(url);
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String emailadd, String password) {
		loginPg.enterEmail(emailadd);
		loginPg.enterPassword(password);
	}

	@When("Click on login")
	public void click_on_login() {
		loginPg.clickOnLogin();
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String expectedTitle) {
		String actualTitle = driver.getTitle();

		if (actualTitle.equals(expectedTitle)) {
			Assert.assertTrue(true); // Pass
		} else {
			Assert.assertTrue(false); // Fail
		}
	}

	@When("User click on logout link")
	public void user_click_on_logout_link() {
		loginPg.clickOnLogOut();
	}

	@Then("Close browser")
	public void close_browser() {
		driver.close();
		driver.quit();
	}
	
	///////////////////////////////////////Add New Customer//////////////////////////////////////
	
	@Then("User can view the Dashboard")
	public void user_can_view_the_dashboard() {
	    String actualTitle = addNewCustPg.getPageTitle();
	    String expectedTitle = "Dashboard / nopCommerce administration";
	    if(actualTitle.equals(expectedTitle)) 
	    {
	    	Assert.assertTrue(true);
	    }
	    else
	    {
	    	Assert.assertTrue(false);
	    }
	    
	}

	@When("User click on customer Menu")
	public void user_click_on_customer_menu() {
		addNewCustPg.clickOnCustomersMenu();
	}

	@When("Click on Customer Menu Item")
	public void click_on_customer_menu_item() {
		addNewCustPg.clickOnCustomerMenuItem();
	}

	@When("Click on Add New button")
	public void click_on_add_new_button() {
		addNewCustPg.clickOnAddNewCustomer();
	}

	@Then("User can view Add new customer page")
	public void user_can_view_add_new_customer_page() {
	    String actualTitle = addNewCustPg.getPageTitle();
	    String expectedTitle = "Add a new customer / nopCommerce administration";
	    
	    if(actualTitle.equals(expectedTitle)) 
	    {
	    	Assert.assertTrue(true); //Pass
	    }
	    else
	    {
	    	Assert.assertTrue(false);//Fail
	    }
	}

	@When("User enter customer info")
	public void user_enter_customer_info() {
		addNewCustPg.enterEmail("test1111@gmail.com");
		addNewCustPg.enterPassword("test111");
		addNewCustPg.enterFirstName("BadalN");
		addNewCustPg.enterLastName("Mondal");
		addNewCustPg.selectGender("Male");
		addNewCustPg.enterDob("09/08/1992");
		addNewCustPg.enterCompanyName("skyVill.in");
		addNewCustPg.enterAdminContent("Admin Content");
		addNewCustPg.enterManageOfVendor("Vendor 1");
		
	}

	@When("Click on save button")
	public void click_on_save_button() {
		addNewCustPg.clickOnSave();  
	}

	@Then("User can view cofirmation message {string}")
	public void user_can_view_cofirmation_message(String expectedConfirmationMessage) {
	    String bodyTagText = driver.findElement(By.tagName("Body")).getText();
	    if(bodyTagText.contains(expectedConfirmationMessage))
	    {
	    	Assert.assertTrue(true); //pass
	    }
	    else
	    {
	    	Assert.assertTrue(false); //Fail
	    }
	}



}
