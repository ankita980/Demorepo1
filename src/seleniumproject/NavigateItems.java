package seleniumproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateItems {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/ankitamaitra/Documents/chromedriver");
		WebDriver driver= new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//implicit wait
		driver.get("https://www.google.com/");//google
		//back and forward
		driver.navigate().to("https://www.amazon.com/");//amazon
		driver.navigate().back();//google
		Thread.sleep(4000);
		driver.navigate().forward();//amazon
		Thread.sleep(4000);
		driver.navigate().back();//google
		
		driver.navigate().refresh();
		
		
		
		
		
		
       
		
	}

}
