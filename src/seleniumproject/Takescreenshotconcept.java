package seleniumproject;

import java.io.File;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import java.io.IOException;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Takescreenshotconcept {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/ankitamaitra/Documents/chromedriver");
		WebDriver driver= new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//implicit wait
		driver.get("https://www.google.com/");
	}}
		
		
		//	File src= ((TakesScreenshot)driver). getScreenshotAs(OutputType.FILE); 
	//	try {
			
		
			// now copy the screenshot to desired location using copyFile method.
	//		FileUtils. copyFile(src, new File("/Users/ankitamaitra/eclipse-workspace/seleniumtutorial/"
				//	+ "src/seleniumproject//google.png")); 
			
			
		
	//}catch(IOexception e) {
		
		//System.out.println("screnshot ");
//	}

//}}
