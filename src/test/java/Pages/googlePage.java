package Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import utilities.UserData;

public class googlePage {

	WebDriver driver;
	int count = 0;

	By webelement_textbox = By.xpath("//*[@id='tsf']/div[2]/div/div[1]/div/div[1]/input");

	public googlePage(WebDriver driver) {

		this.driver = driver;

	}

	public void auto_suggestions(String str) {
		
		driver.findElement(webelement_textbox).sendKeys(str);
		List<WebElement> elm_suggestion = new ArrayList<WebElement>();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		elm_suggestion = driver.findElements(By.xpath("//div[@jscontroller='tg8oTe']//div//ul//li"));

		for (WebElement e : elm_suggestion) {
			String text = e.getText();

			if (text.toLowerCase().indexOf(str.toLowerCase()) != -1) {

				System.out.println("The searched text " + str + " is present in " + text);
			}

			else {
				System.out.println("The searched text " + str + " is not present in " + text);
			}
		}

	}

}
