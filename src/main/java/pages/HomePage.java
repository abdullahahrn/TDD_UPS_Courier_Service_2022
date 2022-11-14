package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.CommonActions;

public class HomePage {

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[text()='United States - English']")
	WebElement selectRegionEelement;
	@FindBy(xpath = "//span[text()='Track']")
	WebElement TrackEelement;
	@FindBy(xpath = "//input[@id='ups-track--qs']")
	WebElement trackCodeElement;
	@FindBy(id = "stApp_widgetTrkNumBtn")
	WebElement tracButtonEllement;

	public void TrackingSteps() {
		CommonActions.click(selectRegionEelement);
		CommonActions.click(TrackEelement);
		CommonActions.input(trackCodeElement, "1Z320E00DG53916226");
		CommonActions.click(tracButtonEllement);

	}

}
