import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;

public class SelIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		//Invoking Firefox Browser
		//System.setProperty("webdriver.gecko.driver", "gecko driver path");
		//WebDriver driver = new FirefoxDriver();
		
		//Invoking Edge Browser
		//System.setProperty("webdriver.edge.driver", "edge driver path");
		//WebDriver driver = new EdgeDriver();
				
		//Invoking Chrome Browser
		//chromedriver path
		System.setProperty("webdriver.chrome.driver", "C://Users//micky.belarmino//eclipse-workspace//BrowserDrivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		
	
		
	}

}
