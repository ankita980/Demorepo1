package seleniumproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwaitexample {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/ankitamaitra/Documents/chromedriver");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//implicit wait
		driver.get("https://book.spicejet.com/Search.aspx?op=3");//google
		
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.id("Login"))).build().perform();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.id("TravelAgentLoginText")).click();
		
		
	/*	clickon(driver,driver.findElement(By.xpath("//*[@id=\"nav-signin-tooltip\"]/a/span")),1);{
			
			
		}
		
		
	}
	public static  void clickon(WebDriver driver,WebElement Locator,int Timeout) {
		new WebDriverWait(driver,Timeout).ignoring(StaleElementReferenceException.class)
		.until(ExpectedConditions.elementToBeClickable(Locator));
		Locator.click();
		
	}*/
	}

}
