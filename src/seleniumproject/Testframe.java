package seleniumproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testframe {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/ankitamaitra/Documents/chromedriver");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://ui.freecrm.com/");
		driver.findElement(By.xpath("//input[@name='email']"));
		driver.findElement(By.xpath("//input[@name='password']"));
		
		
		driver.findElement(By.xpath("//a[text()='Forgot your password?']"));
		
		/*driver.findElement(By.linkText("Computer Glasses")).click();
		//driver.findElement(By.xpath("//*[@id=\"cssmenu\"]/div[2]/div/div/div/div/div[1]/div[1]"));
		driver.switchTo().frame(driver.findElement(By.linkText("Rectangle Frames")));*/
		
	}

}
