package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public static WebDriver driver;
	public static WebDriver setUpBeforeTestCase() {
		System.setProperty("webdriver.chrome.driver","D:\\Softwares\\chromedriver.exe");
		 driver=new ChromeDriver();
		return driver;
}
}
