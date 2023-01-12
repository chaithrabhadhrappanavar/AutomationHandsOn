import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class LocatorsDemo {
	static String message = "Incorrect phone number";

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\eclipseProject\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//creating scroll functioning demo
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//go to Amazon website
		driver.navigate().to("https://www.oyorooms.com/");
		//maximize the window
		driver.manage().window().maximize();
		//js.executeScript("window.scrollBy(0,1000)");
		//get the title of the page and print it
		String title = driver.getTitle();
		System.out.println("Title of the page:"+title);
		
		Select sls = new Select(driver.findElement(By.className("u-textEllipsis d-text14")));
		sls.selectByIndex(0);
		driver.close();
		
//		//here we're passing 2 different phone numbers to check the behaviour
//		String[] str = {"9901120110","7026501293"};
//		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
//		for(String s : str)
//		{
//			driver.findElement(By.id("ap_email")).sendKeys(s);
//			driver.findElement(By.id("continue")).click();
//			if(driver.getPageSource().contains(message))
//			{
//				System.out.println("Error Found!! "+message );
//				driver.findElement(By.id("ap_email")).clear(); // this will clear the input fi
//			}
//			else
//			{
//				System.out.println("Login Successful!");
//				driver.quit();
//				
//			}
//		}
		
		
	}

}
