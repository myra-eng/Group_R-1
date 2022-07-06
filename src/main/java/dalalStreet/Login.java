package dalalStreet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TestBaseClass;

public class Login extends TestBaseClass{
	public Login(WebDriver vivek) {
		PageFactory.initElements(vivek, this);
	}
	//element for email
	@FindBy(xpath="//input[@name='email']")
	private WebElement email;
	public void email(String emailid) {
		email.sendKeys(emailid);
	}
	//element for password field
	@FindBy(xpath="//input[@name='password']")
	private WebElement pass;
	public void pass(String passwd) {
		pass.sendKeys(passwd);
	}
	//element for login button
	@FindBy(xpath="//button[@type='submit']")
	private WebElement loginButton;
	public void loginButton() {
		loginButton.click();
	}
}
