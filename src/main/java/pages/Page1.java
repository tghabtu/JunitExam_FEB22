package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Page1 {

	WebDriver driver;

	public Page1(WebDriver driver) {
		this.driver = driver;

	}

	@FindBy(how = How.XPATH, using = "//input[@name='data']")
	WebElement ADD_INPUT_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@value='Add']")
	WebElement ADD_BUTTON_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@value='on']")
	WebElement TOGGLE_ALL_ELEMENMT;
	@FindBy(how = How.XPATH, using = "//input[@value='on']")
	WebElement TOGGLE_RECLICK_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"todos-content\"]/form/ul/li[2]/input")
	WebElement CHOOSE_ONE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@value='Remove']")
	WebElement REMOVE_BUTTEN_ELEMENT;

	public void addInputElement(String anthing) throws InterruptedException {
		ADD_INPUT_ELEMENT.sendKeys(anthing);
		Thread.sleep(2000);
	}

	public void clickButtonElement() throws InterruptedException {
		ADD_BUTTON_ELEMENT.click();
		Thread.sleep(2000);
	}

	public void clickToggleAllElement() throws InterruptedException {
		TOGGLE_ALL_ELEMENMT.click();
		Thread.sleep(2000);
	}

	public void ReclickToggleElement() throws InterruptedException {
		TOGGLE_RECLICK_ELEMENT.click();
		Thread.sleep(2000);
	}

	public void chooseOneToggleElement() throws InterruptedException {
		CHOOSE_ONE_ELEMENT.click();
		Thread.sleep(2000);
	}

	public void clickRemoveButtonElement() throws InterruptedException {
		TOGGLE_ALL_ELEMENMT.click();
		Thread.sleep(2000);
		REMOVE_BUTTEN_ELEMENT.click();

	}

}
