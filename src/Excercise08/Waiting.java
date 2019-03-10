package Excercise08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Waiting {

	WebDriver driver;
	
	

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	
	/*
	 * @Test
	 * 
	 * public void Testcase01() {
	 * 
	 * driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");
	 * 
	 * 
	 * driver.findElement(By.xpath("//button[contains(text(),Start)]")).click();
	 * 
	 * WebDriverWait wait = new WebDriverWait(driver, 20);
	 * 
	 * wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(
	 * "//div[@id='loading']")));
	 * 
	 * 
	 * 
	 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
	 * "//div[@id='finish']/h4")));
	 * 
	 * 
	 * String mess
	 * =driver.findElement(By.xpath("//div[@id='finish']/h4")).getText();
	 * 
	 * Assert.assertEquals(mess,"Hello World!");
	 * 
	 * 
	 * }
	 */

	/*@Test

	public void Testcase03() {

		driver.get("https://www.w3schools.com/howto/howto_js_countdown.asp");

		WebElement coutDown = driver.findElement(By.xpath("//p[@id='countdown1']"));
		new FluentWait<WebElement>(coutDown).withTimeout(120, TimeUnit.SECONDS).pollingEvery(1, TimeUnit.SECONDS)
				.until(new Function<WebElement, Boolean>() {
					public Boolean apply(WebElement element) {
						boolean flag = element.getText().endsWith("25s");
						return flag;
					}
				});

	}*/
	
	public void waitForProgressBar(String locator) {
		WebDriverWait wait = new WebDriverWait(driver, 100000);
		wait.until(new ExpectedCondition<WebElement>() {
			@Override
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath(locator));
			}
		});
	}

	@Test
	public void Testcase05() {
		
		driver.get("https://www.seleniumeasy.com/test/bootstrap-download-progress-demo.html");

		driver.findElement(By.xpath("//button[@id='cricle-btn']")).click();
		
		waitForProgressBar("//div[@class='percenttext' and contains(text(),'100%')]");
		
		
		

	}

	@AfterTest

	public void afterTest() {

	}
	

}
