package pages;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
	
	public int generateRandomNo(int  boundNo) {
		Random rud =new Random();
		int generateNo = rud.nextInt(boundNo);
		return generateNo;
	}
		
		public void selectFromDropdown(WebElement element, String visibleTest) {
		Select sel =new Select(element);
		sel.selectByVisibleText(visibleTest);
	}

}
