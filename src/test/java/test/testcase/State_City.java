package test.testcase;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import test.base.BaseClass;
import test.pageobjects.EnergyLogin;
import test.pageobjects.LoginPage;
import test.pageobjects.SideBar;

public class State_City extends BaseClass {
	@Test
	public void loginAsadmin() throws InterruptedException {
		browserlaunch(EUrl);
		EnergyLogin lp=new EnergyLogin();
		lp.setUserName(Eusername);
		lp.setPassword(Epass);
		lp.clickLoginBtn();
		Thread.sleep(3000);
		SideBar student=new SideBar();
		
		student.viewStudent();

	}



}
