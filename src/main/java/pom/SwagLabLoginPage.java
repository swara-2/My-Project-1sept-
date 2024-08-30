package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabLoginPage {
	@FindBy(xpath="//input[@placeholder=\"Username\"]")private WebElement userName;
	@FindBy(xpath="//input[@placeholder=\"Password\"]")private WebElement password;
	@FindBy(xpath="//input[@id=\"login-button\"]")private WebElement login;
	
	public SwagLabLoginPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
	
	public void EnterUserName(String name) {
		userName.sendKeys(name);
	}
	
	public void EnterPassword(String pass){
		password.sendKeys(pass);
	}
	
	public void ClickLoginButton(){
		login.click();
	}

}
