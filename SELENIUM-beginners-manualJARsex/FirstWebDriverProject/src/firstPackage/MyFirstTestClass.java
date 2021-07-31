package firstPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstTestClass {

	public static void main(String[] args) throws InterruptedException {
		/**
		 * System.setProperty("webdriver.gecko.driver","E:\\Softwares\\geckodriver.exe”);
		 */
		System.setProperty("webdriver.gecko.driver",
				"/home/peter/POUB/lambdatest-selenium-webdriver-tutorial-with-examples/geckodriver-v0.29.1-linux64/geckodriver"); // Linux
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);/** InterruptedException */
		driver.quit();
	}

}
