package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestCase;

public class LoginPage extends TestCase
{
	//WebElements
	
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(name="password")
	WebElement pwd;
	
	@FindBy(xpath="//div[@class='ui fluid large blue submit button']")
	WebElement loginBtn;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}		
	
	
	//Actions
	
	public String getPageTitle()
	{
		return driver.getTitle();
		
	}

	public void login(String strUser, String strPwd)
	{
		username.sendKeys(strUser);
		pwd.sendKeys(strPwd);
		loginBtn.click();
	}
	
	public void teardown()
	{
		driver.close();		
	}
}
