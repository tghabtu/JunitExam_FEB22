package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Base.BrowserFactory;
import junit.framework.Assert;
import pages.BasePage;
import pages.Page1;

public class Test1 extends BasePage {
	WebDriver driver;
	
	@Test
	public void validatingCheckBox() throws InterruptedException{
		driver= BrowserFactory.init();
		
		Page1 page1=PageFactory.initElements(driver, Page1.class);
		page1.addInputElement("abzahabtu"+generateRandomNo(999));
		page1.clickButtonElement();
		page1.addInputElement("tgwwww123"+generateRandomNo(999));
		page1.clickButtonElement();
		page1.clickToggleAllElement();
		
		Assert.assertEquals("Toggle All Checked","Toggle All Checked");
		
		page1.ReclickToggleElement();
		page1.chooseOneToggleElement();
		page1.clickRemoveButtonElement();
		page1.clickToggleAllElement();
		page1.clickRemoveButtonElement();
		
	
		
}
}


