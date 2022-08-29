package javalearn;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\giri\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/edit");
		driver.manage().window();
		String currentUr4 = driver.getCurrentUrl();
		System.out.println("1  " + currentUr4);

		driver.navigate().to("https://www.youtube.com/");
		String currentUrl = driver.getCurrentUrl();
		System.out.println("2  " + currentUrl);

		driver.navigate().back();

		String currentUrl2 = driver.getCurrentUrl();
		System.out.println("3  " + currentUrl2);
		Thread.sleep(3000);
		driver.navigate().forward();
		String currentUrl3 = driver.getCurrentUrl();
		System.out.println("4  " + currentUrl3);
		Thread.sleep(3000);
		driver.navigate().refresh();
		String currentUrl4 = driver.getCurrentUrl();
		System.out.println("5  " + currentUrl4);
	}
}
