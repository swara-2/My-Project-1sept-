package test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Browser;


public class HomePageTest extends BaseTest {
			  
		@BeforeMethod
		public void openBrowser() {
			 driver=Browser.LaunchBrowser("https://www.saucedemo.com/");
		}
		
		@Test
		public void saampleTest() {
			System.out.println("sample test added");
		}
			
}
