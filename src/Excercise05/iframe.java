package Excercise05;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class iframe {

	WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	/*
	 * @Test public void Testcase01() {
	 * driver.get("http://the-internet.herokuapp.com/iframe");
	 * 
	 * WebElement switchto=
	 * driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
	 * 
	 * driver.switchTo().frame(switchto);
	 * driver.findElement(By.xpath("//body[@id='tinymce']")).clear();
	 * 
	 * driver.findElement(By.xpath("//body[@id='tinymce']")).sendKeys("Giin");
	 * 
	 * driver.switchTo().defaultContent();
	 * 
	 * String text=
	 * driver.findElement(By.xpath("//div[@class='example']//h3")).getText();
	 * 
	 * Assert.assertEquals("An iFrame containing the TinyMCE WYSIWYG Editor", text);
	 * 
	 * }
	 */

//	@Test
	public void Testcase02() {

		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_disabled");

		WebElement info = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));

		driver.switchTo().frame(info);

		WebElement lastnameTextbox = driver.findElement(By.xpath("//input[@type='text' and @name='lname']"));

		Assert.assertFalse(lastnameTextbox.isEnabled());

		driver.findElement(By.xpath("//input[@type='text' and @name='fname']")).sendKeys("Giin");

		driver.findElement(By.xpath("//input[@type='submit']")).click();

		String username = driver.findElement(By.xpath("//div[@class='w3-container w3-large w3-border']")).getText()
				.trim();

		System.out.println("Ten nhap vao: " + username);
	}

	public void switchToWindowByTitle(String title) {
		Set<String> allWindows = driver.getWindowHandles();
		for (String childWindows : allWindows) {
			driver.switchTo().window(childWindows);
			String childTitle = driver.getTitle();
			if (childTitle.equals(title)) {
				break;
			}
		}
	}

	@Test
	public void Testcase04() {

		driver.get("https://www.hdfcbank.com/");

		driver.findElement(By.xpath("//div[@class='sectionnav']//a[@target='_blank'][contains(text(),'Agri')]"))
				.click();

		switchToWindowByTitle("HDFC Bank Kisan Dhan Vikas e-Kendra");

		driver.findElement(By.xpath("//p[contains(text(),'Account Details')]")).click();

		switchToWindowByTitle("Welcome to HDFC Bank NetBanking");
		
		
		//Thao tac tren iframe

		WebElement footerpolicy = driver.findElement(By.xpath("//frame[@name='footer']"));

		

		driver.switchTo().frame(footerpolicy);

		driver.findElement(By.xpath("//form[@name='frmFooter']//a[contains(text(),'Privacy Policy')]")).click();
		
		switchToWindowByTitle("HDFC Bank - Leading Bank in India, Banking Services, Private Banking, Personal Loan, Car Loan");
		
		
		
		driver.findElement(By.xpath("//div[@class='hygeinenav']//a[contains(text(),'CSR')]")).click();
		
		
		switchToWindowByTitle("HDFC Bank: Personal Banking Services");
		
		
		
		
//			String parentID= driver.getWindowHandle();
//			
//			Set<String> allWindows= driver.getWindowHandles();

	}

	@AfterTest
	public void afterTest() {

	}

}
