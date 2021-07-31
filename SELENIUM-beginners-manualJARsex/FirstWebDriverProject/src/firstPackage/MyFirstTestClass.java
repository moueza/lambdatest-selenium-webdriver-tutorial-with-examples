package firstPackage;

public class MyFirstTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

System.setProperty("webdriver.gecko.driver","E:\\Softwares\\geckodriver.exe”);        	
WebDriver driver = new FirefoxDriver();
        	driver.get("https://www.google.com/");
        	driver.manage().window().maximize();
        	Thread.sleep(5000);
        	driver.quit();
	}

}
