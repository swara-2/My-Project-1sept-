package pom;

import java.util.List;

import org.apache.commons.math3.stat.descriptive.summary.Product;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabHomePage {
	@FindBy(xpath="//span[@class='title']")private WebElement title;
	@FindBy(xpath="(//button[@type='button'])[1]")private WebElement menu;
	@FindBy(xpath="//a[@id=\"logout_sidebar_link\"]")private WebElement logout;
	@FindBy(xpath="//div[@class='inventory_item_description']")private List< WebElement> product;
	
	
	public SwagLabHomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public boolean isHomePageTitleisDisplayed() {
		return title.isDisplayed();
	}
	public void clickonmenu() {
		menu.click();
	}
	public boolean islogoutDisplayed() {
		return logout.isDisplayed();
	}
	public int getproductCount() {
		return product.size();
	}
}
