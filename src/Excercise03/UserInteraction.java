package Excercise03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UserInteraction {

	WebDriver driver;
	@BeforeClass
	public void beforeClass() { 
		driver= new ChromeDriver();
		driver.manage().window().maximize();
	}
	
//	@Test
//	public void Testcase01() {
//		driver.get("https://www.w3schools.com/Bootstrap/bootstrap_tooltip.asp");
//		WebElement hoverElement= driver.findElement(By.xpath("//a[@class='bslink']"));
//		Actions action= new Actions(driver);
//		action.moveToElement(hoverElement).perform();
////		String text= driver.findElement(By.xpath("//a[@class='bslink']")).get
//	}
	
	/*@Test
	public void Testcase02() {
		driver.get("https://www.24h.com.vn/");
		WebElement hoverDanhmuc= driver.findElement(By.xpath("//a[contains(text(),'Danh mục')]"));
		Actions action1 =new Actions(driver);
		action1.moveToElement(hoverDanhmuc).perform();
		WebElement hoverBongda= driver.findElement(By.xpath("//li[@class='sbLi']//a[@title='Bóng đá'][contains(text(),'Bóng đá')]"));
		action1.moveToElement(hoverBongda).perform();
		WebElement hoverLichthidau= driver.findElement(By.xpath("//a[contains(text(),'Lịch thi đấu bóng đá')]"));
		action1.moveToElement(hoverLichthidau).perform();
		hoverLichthidau.click();
		String title= driver.getTitle();
		Assert.assertEquals("Lịch thi đấu Bóng Đá Anh, Ý TBN C1, Kết quả Tỉ lệ cược 24h", title);
	}*/
	
	/*@Test
	public void Testcase03() {
		
		driver.get("http://jqueryui.com/resources/demos/selectable/display-grid.html");
		List<WebElement> listItems= driver.findElements(By.xpath("//ol[@id='selectable']/li"));
		
		Actions action= new Actions(driver);
		action.clickAndHold(listItems.get(0)).clickAndHold(listItems.get(5)).click().perform();
		action.release();
		
		
		List<WebElement> itemSelect= driver.findElements(By.xpath("//ol[@id='selectable']/li[@class='ui-state-default ui-selectee ui-selected']"));
		int count= itemSelect.size();
		System.out.println(count);
	}*/
	/*@Test
	public void Testcase04() {
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement rightClick= driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		Actions action=new Actions(driver);
		action.contextClick(rightClick);
		action.build().perform();
		WebElement hoverQuit= driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-quit']"));
		action.moveToElement(hoverQuit).perform();
		String check=hoverQuit.getText();
		Assert.assertEquals("Quit", check);
	}*/
	
	/*@Test
	public void Testcase05() {
		
		driver.get("http://www.seleniumlearn.com/double-click");
		WebElement bttnDouble= driver.findElement(By.xpath("//div[@class='field-item even']//button[@type='button']"));
		Actions action =new Actions(driver);
		action.doubleClick(bttnDouble).perform();
		
	}*/
	
/*	@Test
	public void Testcase06() throws InterruptedException {
		
		driver.get("http://the-internet.herokuapp.com/drag_and_drop");
		
		WebElement col1=driver.findElement(By.xpath("//div[@id='column-a']"));
		
		WebElement col2=driver.findElement(By.xpath("//div[@id='column-b']"));
		
		Actions action=new Actions(driver);
		
		Action DragAndDrop= action.clickAndHold(col1).moveToElement(col2).release(col2).build();
		
		Thread.sleep(5000);
		
		DragAndDrop.perform();
		
		
	}*/
	
/*	@Test
	public void Testcase07() throws InterruptedException {
		
		driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
		
		WebElement col1=driver.findElement(By.xpath("//div[@id='draggable']"));
	
		WebElement col2= driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions action=new Actions(driver);
		
//		Action DragAndDrop= action.clickAndHold(col1).moveToElement(col2).release(col2).build();
//		
//		DragAndDrop.perform();
		
		Thread.sleep(2000);
		
		action.clickAndHold(col1).moveToElement(col2).release(col2).build().perform();
		
		String mess = driver.findElement(By.xpath("//div[@id='droppable']//p")).getText();
		
		Assert.assertEquals("Dropped!", mess);
	}*/
	
	@Test
	public void Testcase08() {
		
		driver.get("http://demo.guru99.com/v4/");
		
		//Tab xuong textbox mat khau 1 phim
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(Keys.TAB);
		
		//Nhap mat khau
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		
		//Chuyen lai len tab username 2 phim tro len
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Keys.chord(Keys.SHIFT,"tab"));
		
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("Giin");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Keys.chord(Keys.CONTROL,"N"));
		
		driver.get("https://www.google.com");
		
		String titleWeb = driver.getTitle();
		
		Assert.assertEquals("Google", titleWeb);
		
		System.out.println(titleWeb);
		
			
	}
	
	
	
	
	
	@AfterClass
	public void afterClass() {
		
	}
}
