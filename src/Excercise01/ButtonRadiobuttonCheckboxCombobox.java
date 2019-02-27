package Excercise01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ButtonRadiobuttonCheckboxCombobox {
	
	WebDriver driver;
	@BeforeClass
	public void beforeClass() throws InterruptedException {
	
		driver = new ChromeDriver();
		driver.get("http://live.guru99.com/");
		Thread.sleep(5000);
		
	}
	@Test
/*	public void Testcase01() throws InterruptedException {
		driver.findElement(By.xpath("//div[@class='footer']//a[contains(text(),'My Account')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='send2']")).click();
		Thread.sleep(2000);
		String erroremail= driver.findElement(By.xpath("//div[@id='advice-required-entry-email']")).getText();
		Assert.assertEquals("This is a required field.", erroremail);
		
		String errorpassword= driver.findElement(By.xpath("//div[@id='advice-required-entry-pass']")).getText();
		Assert.assertEquals("This is a required field.", errorpassword);

	}*/
	
/*	public void Testcase02() throws InterruptedException {
		driver.findElement(By.xpath("//div[@class='footer']//a[contains(text(),'My Account')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("123434234@12312.123123");
		driver.findElement(By.xpath("//button[@id='send2']")).click();
		Thread.sleep(2000);
		String emailvalid= driver.findElement(By.xpath("//div[@id='advice-validate-email-email']")).getText();
		Assert.assertEquals("Please enter a valid email address. For example johndoe@domain.com.", emailvalid);
	}*/
	
	
/*	public void Testcase03() throws InterruptedException {
		driver.findElement(By.xpath("//div[@class='footer']//a[contains(text(),'My Account')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("automation@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(" 123");

		driver.findElement(By.xpath("//button[@id='send2']")).click();
		Thread.sleep(2000);
		String passwordvalid= driver.findElement(By.xpath("//div[@id='advice-validate-password-pass']")).getText();
		Assert.assertEquals("Please enter 6 or more characters without leading or trailing spaces.", passwordvalid);
	
	}*/
	
	public void Testcase04() throws InterruptedException {
		driver.findElement(By.xpath("//div[@class='footer']//a[contains(text(),'My Account')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@title='Create an Account']")).click();
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Nhut");
		
		driver.findElement(By.xpath("//input[@id='middlename']")).sendKeys("Giin");
		
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Bui");

		driver.findElement(By.xpath("//input[@id='email_address']")).sendKeys("nhut16@gmail.com");

		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456abc");
		
		driver.findElement(By.xpath("//input[@id='confirmation']")).sendKeys("123456abc");
		
		driver.findElement(By.xpath("//input[@name='is_subscribed']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@title='Register']")).click();
		
		String message = driver.findElement(By.xpath("//span[contains(text(),'Thank you for registering with Main Website Store.')]")).getText();
		
		Assert.assertEquals("Thank you for registering with Main Website Store.", message);
//		System.out.println("My dashboard: "+message);
		
		
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//span[contains(text(),'Account')]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@title='Log Out']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class='footer']//a[contains(text(),'My Account')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("nhut16@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123456abc");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='send2']")).click();
		
		String url= driver.getCurrentUrl();
		
		System.out.println("Present URL: "+url);
		

	
	}
	
	
	
	@AfterClass
	public void afterClass()
	{
//	driver.quit();	
	}
	
	
	
}
