package Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.UserData;

public class googlePage {
	
	WebDriver driver;
	int count=0;
	By webelement_textbox=By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input");
	public googlePage(WebDriver driver)
	{
		
		this.driver=driver;
		
	}
	
	public void auto_suggestions()
	{
		driver.findElement(webelement_textbox).sendKeys("wedding");
		List<WebElement> elm= new ArrayList<WebElement>();
		try
		{
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		elm=driver.findElements(By.xpath("//div[@jscontroller='tg8oTe']//div//ul//li"));
		System.out.println(elm);
		System.out.println(elm.size());
		for(WebElement e:elm)
		{
			String k= e.getText();
			System.out.println(k);
			if(k.contains("wedding"))
			{
				System.out.println(k);
				count++;
			}
			System.out.println(count);
		}
		
		if(elm.size()==count)
		{
			System.out.println("All elements contains search string");
		}
		
		else
		{
			System.out.println("Few elements contains search string: "+count);
		}
		
		System.out.println(count);
	}
	
	

}
