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

	
}
