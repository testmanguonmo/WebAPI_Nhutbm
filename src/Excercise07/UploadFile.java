package Excercise07;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UploadFile {
	
	WebDriver driver;
	
	@BeforeTest
	
	public void beforeTest() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	@Test
	
	public void Testcase01() throws  Exception {
		driver.get("http://demo.guru99.com/test/upload/");
		
		
	/*	//Cach 1
		WebElement buttonUpload= driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
		
		buttonUpload.sendKeys("C:\\2-22-2019 11-23-39 AM.png");*/
		
		//Cach 2
		
		StringSelection select = new StringSelection("C:\\2-22-2019 11-23-39 AM.png");
		WebElement btnBrowse = driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
		btnBrowse.click();
				// Copy to clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select, null);

		Robot robot = new Robot();
		Thread.sleep(1000);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);

		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(1000);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		
		driver.findElement(By.xpath("//input[@id='terms']")).click();
		
		driver.findElement(By.xpath("//button[@id='submitbutton']")).click();
		
		Thread.sleep(2000);
		
		String messUpload= driver.findElement(By.xpath("//h3[@id='res']//center")).getText();
		
		System.out.println(messUpload);
		
		Assert.assertTrue(messUpload.contains("has been successfully uploaded."));
//		Assert.assertEquals(messUpload, "1 file " + "\n" + "has been successfully uploaded.");
		
		
	}
	
	@AfterTest
	
	public void afterTest() {
		
		
	}

}
