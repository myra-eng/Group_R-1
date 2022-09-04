package dalalStreet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {
	public Dashboard(WebDriver vivek) {
		PageFactory.initElements(vivek, this);	
	}
	@FindBy (xpath="//input[@class='form-control']")
	private WebElement search;
	public void search() {
	}

	@FindBy (xpath="//a[@href='/exchanges']")
	private WebElement exchange;
	public void exchange() {
		exchange.click();
	}
	@FindBy (xpath="//a[@href='/portfolio']")
	private WebElement portfolio;
	public void portfolio() {
		portfolio.click();
	}
	
}
