package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;
import utils.Configuration;
import static utils.Constant.*;

import java.time.Duration;

public class BaseClass {
	Configuration config = new Configuration();
	WebDriver driver;

	@BeforeMethod
	public void setUpDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(config.getProperty((URL.name())));
		long pageLoadTime = Long.parseLong(config.getProperty(IMPLICIT_WAIT.name()));
		long implicitlyWait = Long.parseLong(config.getProperty(IMPLICIT_WAIT.name()));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(pageLoadTime));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitlyWait));

	}

	public WebDriver getDriver() {
		return driver;

	}

	@AfterMethod
	public void closingDriverSession() {
		getDriver().quit();

	}

}
