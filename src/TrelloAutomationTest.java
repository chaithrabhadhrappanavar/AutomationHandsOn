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
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TrelloAutomationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--incognito");
		System.setProperty("webdriver.chrome.driver", "D:\\eclipseProject\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(op);
		//login to trello
		driver.get("https://trello.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("user")).sendKeys("jayon@ukdiningh.com");
		driver.findElement(By.id("login")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
		driver.findElement(By.name("password")).sendKeys("jayon@12345");
		driver.findElement(By.id("login-submit")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[@class='rta9kchj3lSXQk QWO+HauLbGdqT2 soqkBVb8aJJ0wI WrgVKSfIAMO9VB'][1]")).click();
		driver.findElement(By.xpath("//div[@class='board-tile-details is-badged']")).click();
		FluentWait<WebDriver> w = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(60)).pollingEvery(Duration.ofSeconds(2)).ignoring(Exception.class);
		driver.findElement(By.xpath("//*[@id=\"board\"]/div[1]/div/div[3]/a")).click();
		driver.findElement(By.xpath("//textarea[@class = 'list-card-composer-textarea js-card-title']")).sendKeys("card1");
		driver.findElement(By.xpath("//*[@id=\"board\"]/div[1]/div/div[2]/div/div[2]/div[1]/input")).click();
		Actions a = new Actions(driver);
		WebElement fromEle = driver.findElement(By.xpath("//*[@id=\"board\"]/div[1]/div/div[2]/a/div[3]/span"));
		WebElement toEle = driver.findElement(By.xpath("//*[@id=\"board\"]/div[2]/div/div[3]/a"));
		a.dragAndDrop(fromEle, toEle).build().perform();
		WebElement card = driver.findElement(By.xpath("//*[@id=\"board\"]/div[2]/div/div[2]/a/div[3]/span"));
		Point point = card.getLocation();
		int xCoord = point.getX();
		int yCoord = point.getY();
		System.out.println("X coordinate of the card that we moved : "+xCoord);
		System.out.println("Y coordinate of the card that we moved : "+yCoord);
		driver.close();
	}
}