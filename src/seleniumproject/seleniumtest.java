package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "/Users/ankitamaitra/Documents/chromedriver");
WebDriver driver= new ChromeDriver();//launch chrome 
driver.get("https://accounts.google.com/signup/v2/webcreateaccount?"
		+ "service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl"
		+ "=default&gmb=exp&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");//enter url
//xoath
//relative xpath
/*driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("ank");
driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("mai");
driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("ankmai646");*/

//id
/*driver.findElement(By.id("firstName")).sendKeys("ank");
driver.findElement(By.id("lastName")).sendKeys("mai");*/

//name
/*driver.findElement(By.name("firstName")).sendKeys("ank");
driver.findElement(By.name("lastName")).sendKeys("mai");
driver.findElement(By.name("Username")).sendKeys("ankmai646");*/

//linktext
//driver.findElement(By.linkText("Sign in instead")).click();

//BY CSS SELECTOR
//if id # id
//if class . classname
//driver.findElement(By.cssSelector("#firstName")).sendKeys("ank");
driver.findElement(By.cssSelector(".whsOnd zHQkBf")).sendKeys("ank");

//class
//driver.findElement(By.className("whsOnd zHQkBf")).sendKeys("ank");
		//("whsOnd zHQkBf")).sendKeys("ank");

//driver.get("https://www.google.com");



String title=driver.getTitle();//get title
System.out.println(title);

//validation point actual vs expected result
if(title.equals("Google")){
	System.out.println("correct title");
}
else {
	System.out.println("incorrect title"); 
}
System.out.println(driver.getCurrentUrl());//get current url of the browser
System.out.println(driver.getPageSource());
//driver.quit();
driver.close();
	}
	
	}
	

