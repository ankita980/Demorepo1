package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowntest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/ankitamaitra/Documents/chromedriver");
		WebDriver driver= new ChromeDriver();//launch chrome 
		//driver.get("https://accounts.google.com/signup/v2/webcreateaccount?"
			//	+ "service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl"
				//+ "=default&gmb=exp&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");//enter url
		driver.get("https://www.ebay.com/");
		// TODO Auto-generated method stub
		
		//handle dropdown
		
		Select select = new Select(driver.findElement(By.id("gh-cat")));
		select.selectByVisibleText("Art");

	}

}
