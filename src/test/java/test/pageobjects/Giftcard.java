package test.pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import test.base.BaseClass;

public class Giftcard extends BaseClass {
	public Giftcard() {
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath="(//div[@class='MuiListItemIcon-root css-8hzcvu'])[3]")
	WebElement config;
	@FindBy(xpath="//a[@href='/gift-card']")
	WebElement giftcard;
	@FindBy(xpath="//div[@class=\" css-19bb58m\"]")
	WebElement filter;
	@FindBy(xpath="//div[@id='react-select-2-option-11']")
	WebElement preact;
	
	
	
	
	
	
	
	
	
	
	
	public void clickConfig() {
		config.click();
	}
	public void click() {
		giftcard.click();
	}
		
		public void filter() {
			filter.click();	
	}
	public void batchname() {
		//JavascriptExecutor executor = (JavascriptExecutor)driver;
		//implicityWait(10);
		//executor.executeScript("arguments[0].click();", preact);
		//preact.click();
		
		Actions act= new Actions(driver);
		act.scrollToElement(preact).perform();
		
	}
}
