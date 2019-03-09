package Excercise06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Alert {
	WebDriver driver;
	
	
	@BeforeClass
	public void beforeClass() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	/*@Test
	public void Testcase01() throws InterruptedException {
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
		
		Thread.sleep(2000);
		
		
		//Switch to alert
		Alert alert= new Alert();
		driver.switchTo().alert();
		
		String messageAlert= driver.switchTo().alert().getText();
		
		Assert.assertEquals("I am a JS Alert",messageAlert);
		
		//Click Ok on popup
		
		driver.switchTo().alert().accept();
		
		//Verify message
		String result= driver.findElement(By.xpath("//p[@id='result']")).getText();
		
		Assert.assertEquals("You successfuly clicked an alert", result);
			
	}*/
	
	@Test
	public void Testcase02() {
		
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();;
		
		Alert alert= new Alert();
		
		driver.switchTo().alert();
		
		String messageAlert = driver.switchTo().alert().getText();
		
		Assert.assertEquals("I am a JS Confirm", messageAlert);
		
		driver.switchTo().alert().dismiss();
		
		String cancelmess= driver.switchTo().alert().getText();
		
		
		
		
	}
	
	@AfterClass
	public void afterClass() {
		
		
	}

}
