package test.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.base.BaseClass;

public class SideBar extends BaseClass {
	
	public SideBar() {
		
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//a[@id='toggle-menu-item-student-3']")
	WebElement studentdropdown;
	
	
	@FindBy(xpath="//a[@id='toggle-menu-item-student-1']")
	WebElement student;
	
	
	private void clickStudentDropDown() {
		studentdropdown.click();
		

	}
	
	private void selectStudent() {
		student.click();

	}
	
	
	public void viewStudent() throws InterruptedException {
		
		clickStudentDropDown();
		Thread.sleep(3000);
		selectStudent();

	}

}
