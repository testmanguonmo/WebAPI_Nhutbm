package Webdriver;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.thoughtworks.selenium.webdriven.commands.GetAttribute;

public class textbox {

	
		WebDriver driver;
		
		@BeforeClass
		public void beforeClass() {
//			driver = new FirefoxDriver();
			driver= new ChromeDriver();
			driver.get("http://demo.guru99.com/v4/");
		}
		
		@Test
		
		public void testcase01() throws InterruptedException {
		String url =driver.getCurrentUrl();
		System.out.println("URL: "+url);
		
		WebElement user= driver.findElement(By.xpath("//input[@name='uid']"));
		user.sendKeys("Nhut");
		WebElement password= driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("123456");
		Thread.sleep(1000);
		user.clear();
		Thread.sleep(2000);
		password.clear();
		String charusername= driver.findElement(By.xpath("//label[@id='message23']")).getText();
		System.out.println("Message in username: " + charusername);
		
//		driver.findElement(GetAttribute)
		
		
		
		}
		
		@AfterClass
		public void afterClass() {
		
		}
	}
