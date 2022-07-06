package dalalStreet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TestBaseClass;

public class Exchange extends TestBaseClass{

	public Exchange(WebDriver vivek) {
		PageFactory.initElements(vivek, this);
	}
	//element for search company infy
	@FindBy (xpath="//a[@href='/exchange/nse/INFY.NS']")
	private WebElement infy;
	public void infy() {
		infy.click();
	}
	//element for searching company name in text box
	@FindBy (xpath="//input[@id='search-bar-0']")
	private WebElement searchCompany;
	public void searchCompany(String company) {
		searchCompany.sendKeys(company);
	}
	//element to send quantity for buy in text box
	@FindBy (xpath="//input[@type='number']")
	private WebElement quantity;
	public void quantity(String qunt) {
		quantity.sendKeys(qunt);
	}
	//element to send quantity to sell in text box
	@FindBy (xpath="(//input[@type='number'])[3]")
	private WebElement quantity_sell;
	public void quantitySellShare(String qunt) {
		quantity_sell.sendKeys(qunt);
	}
	//element for buy button
	@FindBy (xpath="//button[@class='w-md btn btn-success']")
	private WebElement buyButton;
	public void buyButton() {
		buyButton.click();
	}
	//element to select sell option
	@FindBy (xpath="//a[contains(text(),'Sell')]")
	private WebElement sellOption;
	public void sellselect() {
		sellOption.click();
	}
	//element to select sell button
	@FindBy (xpath="//button[contains(text(),'Sell')]")
	private WebElement sell_button;
	public void sellButtonClick() {
		sell_button.click();
	}
	//check status of the order
	@FindBy(xpath="//div[text()='Order Created successfully']")
	private WebElement orderStatus;
	
	public String getStatus()
	{
		String OrdStatus = orderStatus.getText();
		return OrdStatus;
	}


}
