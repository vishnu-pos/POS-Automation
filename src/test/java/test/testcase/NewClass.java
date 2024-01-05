package test.testcase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import test.base.BaseClass;
public class NewClass extends BaseClass {

	@Test
	public void login() {
		browserlaunch(Url);
		
		WebElement element = driver.findElement(By.xpath("//input[@name='email']"));
		element.click();
		String Adminusername= "vishnu";
		element.sendKeys(Adminusername);
		
		// lp.setUserName(Eusername);

				// lp.setPassword(Epass);
				/*
				 * lp.clickLoginBtn(); Thread.sleep(3000);
				 */
				// SideBar student=new SideBar();

				// student.viewStudent();
	}
}
