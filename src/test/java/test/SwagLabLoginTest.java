package test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pojo.Browser;
import pom.SwagLabHomePage;
import pom.SwagLabLoginPage;


@Listeners(test.Listeners.class)
	public class SwagLabLoginTest extends BaseTest {
			  
		@BeforeMethod
		public void openBrowser() {
			 driver=Browser.LaunchBrowser("https://www.saucedemo.com/");
		}
		@Test
		public  void standardUser() throws InterruptedException {
			test=reports.createTest("standardUser");
			SwagLabLoginPage SwagLabLoginPage=new SwagLabLoginPage(driver);
			SwagLabLoginPage.EnterUserName("standard_user");
			SwagLabLoginPage.EnterPassword("secret_sauce");
			SwagLabLoginPage.ClickLoginButton();
			SwagLabHomePage swaglabhomepage=new SwagLabHomePage(driver);
			swaglabhomepage.clickonmenu();
			Thread.sleep(1000);
			SoftAssert SoftAssert=new SoftAssert();
			SoftAssert.assertTrue(swaglabhomepage.islogoutDisplayed());
			System.out.println("soft");
			Assert.assertEquals(swaglabhomepage.getproductCount(),6);
			System.out.println("hard");
			SoftAssert.assertAll();
		}
		@Test
		public void Clocked() {
			test=reports.createTest("clocked");
			SwagLabLoginPage SwagLabLoginPage=new SwagLabLoginPage(driver);
			SwagLabLoginPage.EnterUserName("locked_out_user");
			SwagLabLoginPage.EnterPassword("secret_sauce");
			SwagLabLoginPage.ClickLoginButton();
	}
		@Test
		public void problem() {
			test=reports.createTest("problem");
			SwagLabLoginPage SwagLabLoginPage=new SwagLabLoginPage(driver);
			SwagLabLoginPage.EnterUserName("problem_user");
			SwagLabLoginPage.EnterPassword("secret_sauce");
			SwagLabLoginPage.ClickLoginButton();
		}
		@Test
		public void performance() {
			test=reports.createTest("performance");
			SwagLabLoginPage SwagLabLoginPage=new SwagLabLoginPage(driver);
			SwagLabLoginPage.EnterUserName("performance_glitch_user");
			SwagLabLoginPage.EnterPassword("secret_sauce");
			SwagLabLoginPage.ClickLoginButton();
		}
	}


