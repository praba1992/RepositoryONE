package javalearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	public static WebDriver driver;
	public static WebElement element;

	public void getBrowserChrome() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\giri\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window();
	}

	public void getBrowserfirefox() {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\giri\\eclipse-workspace\\JavaSelenium\\Driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window();

	}

	public void getUrl(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void getCurrentUrl() {
		try {
			String currentUrl = driver.getCurrentUrl();
			System.out.println(currentUrl);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void navigateBack() {
		driver.navigate().back();
	}

	public void navigateForward() {
		driver.navigate().forward();
	}

	public void navigateToString(String url) {
		driver.navigate().to(url);
	}

	public void navigateRefresh() {
		driver.navigate().refresh();
	}
	
	public void CloseDriver() {
		driver.close();
	}
	
	public void QuitDriver() {
		driver.quit();
	}

	/*
	 * Locators
	 */

	public WebElement FindById(String id) {
		WebElement element = driver.findElement(By.id(id));
		return element;
	}

	public WebElement FindByName(String name) {
		WebElement element = driver.findElement(By.name(name));
		return element;
	}
	
	public void ElementClick(WebElement element) {
		element.click();
	}

	public void TextEnter(String value) {
		element.sendKeys(value);
	}
	
	public void name() {
		
	}
	

}
