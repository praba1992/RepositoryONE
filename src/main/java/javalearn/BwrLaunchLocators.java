package javalearn;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class BwrLaunchLocators {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\giri\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/edit");

		// Enter your full Name
		driver.findElement(By.id("fullName")).sendKeys("Prabakaran S");

		// Append a text and press keyboard tab
		driver.findElement(By.id("join")).sendKeys(" Guy", Keys.TAB);

		// What is inside the text box
		String attributevlue = driver.findElement(By.id("getMe")).getAttribute("value");
		System.out.println(attributevlue);

		// Clear the text

		driver.findElement(By.id("clearMe")).clear();

		// Confirm edit field is disabled
		boolean status = driver.findElement(By.id("noEdit")).isEnabled();
		System.out.println(status);

		// Confirm text is readonly

		String attribute = driver.findElement(By.id("dontwrite")).getAttribute("readonly");
		System.out.println(attribute);

		driver.close();

	}

}
