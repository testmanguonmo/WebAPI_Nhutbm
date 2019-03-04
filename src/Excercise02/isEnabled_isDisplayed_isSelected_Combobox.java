package Excercise02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class isEnabled_isDisplayed_isSelected_Combobox {

	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver= new FirefoxDriver();

	}

	@Test
	public void Testcase01() {
		driver.get("https://daominhdam.github.io/basic-form/");

		WebElement element1 = driver.findElement(By.xpath("//input[@id='password']"));
		Assert.assertFalse(element1.isEnabled());
		String checkplaceholder = driver.findElement(By.xpath("//input[@id='password']")).getAttribute("placeholder");

		System.out.println("Place holder: " + checkplaceholder);

	}

	@Test
	public void Testcase02() throws InterruptedException {
		driver.get("http://demo.guru99.com/test/radio.html");

		WebElement radiobutton = driver.findElement(By.xpath("//input[@id='vfb-7-1']"));
		Assert.assertFalse(radiobutton.isSelected());
		Thread.sleep(2000);
		radiobutton.click();
		Assert.assertTrue(radiobutton.isSelected());

		WebElement checkbox = driver.findElement(By.xpath("//input[@id='vfb-6-2']"));
		Assert.assertFalse(checkbox.isSelected());
		Thread.sleep(2000);
		checkbox.click();
		Assert.assertTrue(checkbox.isSelected());
	}

	@Test
	public void Testcase03() {
		driver.get("https://www.facebook.com/");
		// Chon ngay
		Select selectday = new Select(driver.findElement(By.xpath("//div[@class='_5k_5']//select[@id='day']")));
		selectday.selectByVisibleText("14");
		String selectdayitem = selectday.getFirstSelectedOption().getText();
		Assert.assertEquals("14", selectdayitem);
		// Chon thang
		Select selectmonth = new Select(driver.findElement(By.xpath("//div[@class='_5k_5']//select[@id='month']")));
		selectmonth.selectByVisibleText("Tháng 10");
		String selectitemmonth = selectmonth.getFirstSelectedOption().getText();
		Assert.assertEquals("Tháng 10", selectitemmonth);
		// Chon nam
		Select selectyear = new Select(driver.findElement(By.xpath("//div[@class='_5k_5']//select[@id='year']")));
		selectyear.selectByVisibleText("2019");
		String selectitemyear = selectyear.getFirstSelectedOption().getText();
		Assert.assertEquals("2019", selectitemyear);

	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}
}
