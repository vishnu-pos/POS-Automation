package test.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import test.base.BaseClass;

public class LoginPage extends BaseClass{
	// this constructor is used to initiate driver 
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="email")
	WebElement txtuser;
	@FindBy(name="password")
	WebElement txtpass;
	/*
	 * @FindBy(xpath="//button[@type='button']") WebElement icon;
	 */
	@FindBy(id=":r1:")
	WebElement loginbtn;
	/*
	// forget password
	@FindBy(xpath="//b[text()='Forgot password?']']")
	WebElement forgetpass;
	
	
	@FindBy(id=":r2:")
	WebElement forgotemail;
	
	@FindBy(id=":r3:")
	WebElement sendbtn;*/
	
	
	public  void setUserName(String username) {
		txtuser.click();
		//txtuser.clear();
	
	txtuser.sendKeys(username);;
	
	

	}
	public void setPassword(String password) {
        txtpass.click();
		//txtpass.clear();
		txtpass.sendKeys(password);
	}
	
	public void clickLoginBtn() {
		loginbtn.click();
		
	}
	

		
	}
	

