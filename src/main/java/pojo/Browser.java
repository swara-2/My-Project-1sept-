package pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	public static WebDriver LaunchBrowser(String url) {
	System.setProperty("Webdriver.chromeDriver","E:\\sellenum very important\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get(url);
    driver.manage().window().maximize();
    return driver;
}
}
