package vivek.Group_R;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;


public class XpathClass implements XpathInterface{
	WebDriver obj;
	String email="pimprikar.vivek555@gmail.com";
	String pass="vivek2607";
	String pass1="9730707038";
	String facebook="https://facebook.com/login";
	String linkedIn="https://www.linkedin.com/uas/login?fromSignIn=true&trk=cold_join_sign_in";
	String instagram="https://www.instagram.com/accounts/login/";
	
	WebElement username;
	WebElement password;
	WebElement click;
	
	public void LauchChrome() {
		obj=new ChromeDriver();
		System.setProperty(key1, value1);
		System.out.println("Welcome Future Test Engineer...!!!");
		obj.manage().window().maximize();
		obj.manage().deleteAllCookies();
		
	}

	public void RelativeXpathByIndex() throws InterruptedException {
		System.out.println("Relative xpath by index...!!!");
		System.out.println("Relative xpath by index...!!!");
		System.out.println("Relative xpath by index...!!!\n\n");
		obj.get(instagram);
		Thread.sleep(3000);
		username=obj.findElement(By.xpath("//div[1]/div/label/input"));
		username.sendKeys(email);
		password=obj.findElement(By.xpath("//div[2]/div/label/input"));
		password.sendKeys(pass);
		click=obj.findElement(By.xpath("//div/div[3]/button"));
		click.click(); Thread.sleep(1000);
		
		Thread.sleep(3000);
		obj.switchTo().newWindow(WindowType.TAB);
		obj.get(linkedIn);
		username=obj.findElement(By.xpath("//div/input"));
		username.sendKeys(email);
		password=obj.findElement(By.xpath("//div[2]/input"));
		password.sendKeys(pass1);
		click=obj.findElement(By.xpath("//div/button[1]"));
		click.click(); Thread.sleep(1000);

	}

	public void signature() throws InterruptedException {
		System.out.println("Relative xpath by signature...!!!");
		System.out.println("Relative xpath by signature...!!!");
		System.out.println("Relative xpath by signature...!!!\n\n");
		
		//================= for facebook
		obj.manage().deleteAllCookies();
		obj.get(facebook);
		username=obj.findElement(By.xpath("(//input)[14]"));
		username.sendKeys(email);
		password=obj.findElement(By.xpath("(//input)[15]"));
		password.sendKeys(pass);
		click=obj.findElement(By.xpath("(//button)[1]"));
		click.click(); Thread.sleep(1000);Thread.sleep(1500);
		obj.manage().deleteAllCookies();

		obj.switchTo().newWindow(WindowType.TAB);
		//================= for instagram
		
		obj.get(instagram);
		Thread.sleep(5000);
		username=obj.findElement(By.xpath("(//input)[1]"));
		username.sendKeys(email);
		
		password=obj.findElement(By.xpath("(//input)[2]"));
		password.sendKeys(pass);
		
		click=obj.findElement(By.xpath("(//button)[2]"));
		click.click(); Thread.sleep(1000);
		//================= for linkedin
		Thread.sleep(2000);
		obj.switchTo().newWindow(WindowType.TAB);
		obj.get(linkedIn);
		username=obj.findElement(By.xpath("(//input)[13]"));
		username.sendKeys(email);
		password=obj.findElement(By.xpath("(//input)[27]"));
		password.sendKeys(pass1);
		click=obj.findElement(By.xpath("(//button)[1]"));
		click.click(); Thread.sleep(1000);	
}
	public void attribute() throws InterruptedException {
		
		System.out.println("Relative xpath by attribute...!!!");
		System.out.println("Relative xpath by attribute...!!!");
		System.out.println("Relative xpath by attribute...!!!\n\n");
		//================= for facebook
		obj.manage().deleteAllCookies();
		obj.get(facebook);
		username=obj.findElement(By.xpath("//input[@id='email']"));
		username.sendKeys(email);
		
		password=obj.findElement(By.xpath("//input[@id='pass']"));
		password.sendKeys(pass);
		
		click=obj.findElement(By.xpath("//button[@name='login']"));
		click.click(); Thread.sleep(1000);Thread.sleep(1500);
		obj.manage().deleteAllCookies();

		obj.switchTo().newWindow(WindowType.TAB);
		//================= for instagram
		
		obj.get(instagram);
		Thread.sleep(5000);
		username=obj.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys(email);
		
		password=obj.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys(pass);
		
		click=obj.findElement(By.xpath("//button[@type='submit']"));
		click.click(); Thread.sleep(1000);
		Thread.sleep(2000);

		//================= for linkedin
		obj.switchTo().newWindow(WindowType.TAB);

		obj.get(linkedIn);
		username=obj.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys(email);
		password=obj.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys(pass1);
		click=obj.findElement(By.xpath("//button[@type='submit']"));
		click.click(); Thread.sleep(1000);
}

	
	public void contains() throws InterruptedException {
		System.out.println("Relative xpath by contains...!!!");
		System.out.println("Relative xpath by contains...!!!");
		System.out.println("Relative xpath by contains...!!!\n\n");
		
		//================= for facebook
		obj.manage().deleteAllCookies();
		obj.get(facebook);
		username=obj.findElement(By.xpath("//input[contains(@id,'email')]"));
		username.sendKeys(email);
		
		password=obj.findElement(By.xpath("//input[contains(@id,'pass')]"));
		password.sendKeys(pass);
		
		click=obj.findElement(By.xpath("//button[contains(@name,'login')]"));
		click.click(); Thread.sleep(1000);Thread.sleep(1500);
		obj.manage().deleteAllCookies();

		obj.switchTo().newWindow(WindowType.TAB);
//		//================= for instagram
		
		obj.get(instagram);
		Thread.sleep(5000);
		username=obj.findElement(By.xpath("//input[contains(@name,'username')]"));
		username.sendKeys(email);
		
		password=obj.findElement(By.xpath("//input[contains(@name,'password')]"));
		password.sendKeys(pass);
		
		click=obj.findElement(By.xpath("//button[contains(@type,'submit')]"));
		click.click(); Thread.sleep(1000);
		Thread.sleep(2000);

		//================= for linkedin
		obj.switchTo().newWindow(WindowType.TAB);

		obj.get(linkedIn);
		username=obj.findElement(By.xpath("//input[contains(@id,'username')]"));
		username.sendKeys(email);
		password=obj.findElement(By.xpath("//input[contains(@id,'password')]"));
		password.sendKeys(pass1);
		click=obj.findElement(By.xpath("//button[contains(@type,'submit')]"));
		click.click(); Thread.sleep(1000);
}

	public void textFunction() throws InterruptedException {
		System.out.println("Relative xpath by text function...!!!");
		
		obj.get("https://facebook.com/");
		click=obj.findElement(By.xpath("//a[text()='Forgotten password?']"));
		click.click(); Thread.sleep(1000);
		Thread.sleep(3000);
		obj.switchTo().newWindow(WindowType.TAB);
		//================= for instagram
		obj.get(instagram);
		Thread.sleep(3000);
		click=obj.findElement(By.xpath("//a[text()='Forgot password?']"));
		click.click(); Thread.sleep(1000);
	}
	public void quit() throws InterruptedException {
	Thread.sleep(2500);	
	obj.quit();
	System.out.println("Script passed...!!!\n");
	System.out.println("Quitted successfully...!!!");
	System.out.println("Quitted successfully...!!!");
	System.out.println("Quitted successfully...!!!");
	
	}
}
