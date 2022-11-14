package common;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import reporting.Logs;

public class CommonActions {

	public static void input(WebElement element, String value) {
		try {
			element.sendKeys(value);
			Logs.log(value + " : has been passed to ---> " + element);
		} catch (NoSuchElementException | NullPointerException e) {
			e.printStackTrace();
			Logs.log("Element not Found ---> " + element);
			Assert.fail();
		}
	}

	public static void click(WebElement element) {
		try {
			element.click();
			Logs.log(element + " : has been clicked ---> ");
		} catch (NoSuchElementException | NullPointerException e) {
			e.printStackTrace();
			Logs.log("Element Not Found ---> " + element);
			Assert.fail();
		}
//
	}
}