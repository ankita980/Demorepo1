package seleniumproject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/ankitamaitra/Documents/chromedriver");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(5000);
		
		Alert alert=driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		String test= alert.getText();
		if(test.equals("Please enter a valid user name")) {
			System.out.println("successful validation");
		}
		else {
			System.out.println("Unsuccesful message");
		}
		
		Thread.sleep(5000);
		
		alert.accept();
		
		//alert.dismiss();
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
