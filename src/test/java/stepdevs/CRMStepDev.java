package stepdevs;

import java.util.List;
import java.util.Map;
import org.junit.Assert;
//import org.testng.Assert;

import base.TestCase;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class CRMStepDev extends TestCase
{
	LoginPage loginPage;
	
	@Before
	public void Setup()
	{
		initialize();
		loginPage = new LoginPage();
	}
	
	
		@Given("User is already on Login Page")
		public void user_is_already_on_login_page() 
		{
			String pageTitle = loginPage.getPageTitle();
			Assert.assertEquals("Cogmento CRM", driver.getTitle());
		}
		


//		@When("User enters credentials")
//		public void user_enters_credentials(io.cucumber.datatable.DataTable dataTable) 
//		{
//					 
//		}
//		@Then("Should display home page")
//		public void should_display_home_page()
//		{
//		}
//		
//		
//		@Then("close the browser")
//		public void close_the_browser() {
//		   
//		}


	
	// Using DataTable as Map
	@When("User enters credentials")
	public void user_enters_credentials(DataTable userCreds) 
	{			
		List<Map<String, String>> user = userCreds.asMaps();
			
		String strUser = user.get(0).get("username");
		String strPwd = user.get(0).get("password");		
		loginPage.login(strUser, strPwd);			 
	}
	
	@Then("Should display home page")
	public void should_display_home_page() 
	{
//		boolean isUserDisp = driver.findElement(By.className("user-display")).isDisplayed();
//		Assert.assertTrue(isUserDisp);	
	}
	
	@Then("close the browser")
	public void close_the_browser()
	{
	driver.close();	
	}	

}
