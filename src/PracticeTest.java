import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticeTest {

	public static void main(String[] args) throws Exception {
//		ATUTestRecorder recorder = new ATUTestRecorder("D:\\scriptVideos\\", "TestVideo1", false);
//		recorder.start();
		System.setProperty("webdriver.chrome.driver", "D:\\eclipseProject\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		WebElement ele = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
//		Select sel = new Select(ele);
//		sel.selectByIndex(1);
//		driver.switchTo().newWindow(WindowType.TAB);
		//Launch the first URL
		driver.get("https://web.whatsapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"pane-side\"]/button/div/div[2]/div/div")));
		driver.findElement(By.xpath("//*[@id=\"pane-side\"]/button/div/div[2]/div/div")).click();
		driver.findElement(By.xpath("//div[@class='_8nE1Y']")).click();
		WebElement e1 = driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[1]"));
		e1.sendKeys("@bharati"+Keys.ENTER+"Bharati mele kalsiddu ella msgs odu bharati. And this is an automated text send my me!!");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[2]/button/span")).click();
		driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[1]/div[1]/button[2]/div/span")).click();
		driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[1]/div[1]/button[3]/div/span")).click();
		driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[2]/div/div[3]/div/div/div[1]/div/div[6]/span")).click();
		driver.findElement(By.xpath("//img[@class='_1mEXy']")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/span/div/span/div/div/div[2]/div/div[1]/div[3]/div/div/div[1]/div[1]/p")).sendKeys("It's Done!!");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/span/div/span/div/div/div[2]/div/div[2]/div[2]/div/div/span")).click();
		driver.close();
//		//Use robot class to press Ctrl+t keys     
//		Robot robot = new Robot();                          
//		robot.keyPress(KeyEvent.VK_CONTROL); 
//		robot.keyPress(KeyEvent.VK_T); 
//		robot.keyRelease(KeyEvent.VK_CONTROL); 
//		robot.keyRelease(KeyEvent.VK_T);
//		//Switch focus to new tab
//		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
//		driver.switchTo().window(tabs.get(1));
//		//Launch URL in the new tab
//		driver.get("http://google.com");
//		//driver.close();
		
		

	}

}
