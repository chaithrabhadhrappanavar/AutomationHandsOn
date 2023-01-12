import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class PracticeTest {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipseProject\\chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(op);
//		driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		WebElement ele = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
//		Select sel = new Select(ele);
//		sel.selectByIndex(1);
//		driver.switchTo().newWindow(WindowType.TAB);
		//Launch the first URL
		driver.get("http://www.google.com");
		//Use robot class to press Ctrl+t keys     
		Robot robot = new Robot();                          
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_T); 
		robot.keyRelease(KeyEvent.VK_CONTROL); 
		robot.keyRelease(KeyEvent.VK_T);
		//Switch focus to new tab
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		//Launch URL in the new tab
		driver.get("http://google.com");
		//driver.close();
		
		

	}

}
