import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--incognito");
		System.setProperty("webdriver.chrome.driver", "D:\\eclipseProject\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(op);
		//1. login to trello
		driver.get("https://trello.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("user")).sendKeys("jayon@ukdiningh.com");
		driver.findElement(By.id("login")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
		driver.findElement(By.name("password")).sendKeys("jayon@12345");
		driver.findElement(By.id("login-submit")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/div/div/div/div[2]/div/div/div/div[2]/div/div[2]/ul/li[2]/div")).click();
		driver.findElement(By.xpath("//input[@class='nch-textfield__input Hj0IB7nx8rs7UO Hj0IB7nx8rs7UO ysTE7s-UXRkpYP']")).sendKeys("BoardB");
		driver.findElement(By.cssSelector("button[class='G2lWjDVJsvar3H Ts+YceGnvTbKoG HPCwi137Em5EYI JIXQq8gDYY04N6']")).click();

		
	}
}


