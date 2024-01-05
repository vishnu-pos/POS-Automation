package test.testcase;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import test.base.BaseClass;
import test.pageobjects.EnergyLogin;
import test.pageobjects.Giftcard;
import test.pageobjects.LoginPage;
import test.pageobjects.SideBar;

public class State_City extends BaseClass {
	@Test
	public void loginAsadmin() throws InterruptedException {
		browserlaunch(Url);
		LoginPage lp = new LoginPage();
		Thread.sleep(1000);
		
		lp.setUserName(Adminusername);lp.setPassword(Adminpass); lp.clickLoginBtn();
		
		implicityWait(3);
		Giftcard gif= new Giftcard();
		
	gif.clickConfig();
	implicityWait(3);
	gif.click();
	implicityWait(20);
	gif.filter();
    implicityWait(30);
     gif.batchname();

	
	}

}
