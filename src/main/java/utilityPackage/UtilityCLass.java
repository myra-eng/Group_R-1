package utilityPackage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import TestBase.TestBaseClass;

public class UtilityCLass extends TestBaseClass{

	public UtilityCLass(WebDriver vivek) {
		this.vivek=vivek;
	}

	public void takess(String ssname) throws IOException {
		
		String sspath="D:\\SwTesting\\Vivek\\Eclipse_2021\\Workspace\\Group_R\\Screenshot\\";
		TakesScreenshot ss=(TakesScreenshot)vivek;
		File takess=ss.getScreenshotAs(OutputType.FILE);
		File totalPath=new File(sspath+ssname+System.currentTimeMillis()+".png");
		FileHandler.copy(takess, totalPath);
	}
}

