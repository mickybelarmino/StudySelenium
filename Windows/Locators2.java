import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Locators2 obj1 = new Locators2();
		String name = "Rahul";
		
		System.setProperty("webdriver.chrome.driver", "C://Users//micky.belarmino//eclipse-workspace//BrowserDrivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//implicit wait - 2seconds time out
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String password = obj1.getPassword(driver);
		System.out.println(password);
		
		driver.get("https://rahulshettyacademy.com/locatorspractice");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//div[contains(@class, 'login-container')]/p")).getText());
	 	Assert.assertEquals(driver.findElement(By.xpath("//div[contains(@class, 'login-container')]/p")).getText(), "You are successfully logged in.");
		System.out.println(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText());
	 	Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello " + name + ",");
	 	driver.findElement(By.xpath("//*[text()='Log Out']")).click();
	 	driver.close();
	 	
	 	
		
	}
	
	public String getPassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passwordText =  driver.findElement(By.cssSelector(".infoMsg")).getText();
		//Please use temporary password 'rahulshettyacademy' to Login.
		String[] passwordArray = passwordText.split("'");
		String password = passwordArray[1].split("'")[0];
		return password;
	}

}
