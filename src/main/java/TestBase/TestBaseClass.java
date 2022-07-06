package TestBase;

import java.time.Duration;
import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBaseClass {

	public WebDriver vivek;
	Scanner input=new Scanner(System.in);
//	@Parameters("browser")
	public void initialize() {
		System.out.println("Enter your Browser name !!!!!!\n");
		String browser=input.nextLine();
		switch (browser) {
		case "chrome":WebDriverManager.chromedriver().setup();
		vivek= new ChromeDriver();
		break;
		case "firefox":WebDriverManager.firefoxdriver().setup();
		vivek= new FirefoxDriver();
		break;
//		case "both":WebDriverManager.chromedriver().setup();
//		vivek= new ChromeDriver();
//		WebDriverManager.firefoxdriver().setup();
//		vivek= new FirefoxDriver();break;
		default:System.out.println("enter valid browser name :((((");
		break;
		
		}
		vivek.manage().window().maximize();
		vivek.manage().deleteAllCookies();
		vivek.navigate().to("https://www.apps.dalalstreet.ai/login");
		vivek.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

	}

	public void quit() throws InterruptedException {
		Thread.sleep(2000);
		vivek.quit();
	}
}
