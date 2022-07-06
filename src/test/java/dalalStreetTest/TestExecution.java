package dalalStreetTest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import TestBase.TestBaseClass;
import dalalStreet.Dashboard;
import dalalStreet.Exchange;
import dalalStreet.Login;
import utilityPackage.UtilityCLass;

public class TestExecution extends TestBaseClass{
	TestBaseClass s=new TestBaseClass();
	Login l ;Dashboard d;Exchange e;UtilityCLass u;
	@BeforeMethod
	public void f() {
		s.initialize();	
		l= new Login(s.vivek);
		d=new Dashboard(s.vivek);
		e=new Exchange(s.vivek);
		u=new UtilityCLass(s.vivek);
	}
	@Test(priority = 1,enabled = false)
	public void buy() throws InterruptedException {
		l.email("pimprikar12345@gmail.com");
		l.pass("vivek123");
		l.loginButton();
		Thread.sleep(3000);
		d.exchange();
		Thread.sleep(2500);
		e.searchCompany("infy");
		e.infy();
		Thread.sleep(1800);
		e.quantity("6");
		e.buyButton();
		Thread.sleep(1200);
		d.portfolio();
	}
	@Test(priority = 2)
	public void sell() throws InterruptedException, IOException {
		l.email("pimprikar12345@gmail.com");
		l.pass("vivek123");
		l.loginButton();
		Thread.sleep(3000);
		d.exchange();
		Thread.sleep(2500);
		e.searchCompany("infy");
		e.infy();
		Thread.sleep(2200);
		e.sellselect();
		Thread.sleep(1500);
		e.quantitySellShare("1");
		e.sellButtonClick();
		Thread.sleep(1200);
		String expct="Order Created successfully";
		Assert.assertEquals(e.getStatus(),expct);
		u.takess("vivekkkkk");
		d.portfolio();
		
	}
	@AfterMethod
	public void quit() throws InterruptedException {
		Thread.sleep(2000);
		s.quit();
	}
}
