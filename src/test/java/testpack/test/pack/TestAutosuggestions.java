package testpack.test.pack;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.googlePage;

public class TestAutosuggestions {
	WebDriver driver;
	googlePage p;
	
	@BeforeTest
	public void intit_browser()
	{
		File f=new File(System.getProperty("user.dir"));
		
		
			System.setProperty("webdriver.chrome.driver",f+"/chromedriver.exe");
		    driver= new ChromeDriver();
		    p=new googlePage(driver);
		    driver.manage().window().fullscreen();
		    driver.navigate().to("https://www.google.com");
			
		
		
	}
	
	
	@Test
	public void  verif_string()
	{
	p.auto_suggestions();	
	}

}
