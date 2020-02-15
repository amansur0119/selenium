import java.sql.Time;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class target {

	public static void main(String[] args) {
		
		
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\am88\\Desktop\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
	 
		
		driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		
		driver.get("https://www.target.com/");
		
		
		WebElement search = driver.findElement(By.name("searchTerm"));
	    
	    
	    SendKeys(driver, search,10, "Ali");
	    
	    
	    WebElement poiu = driver.findElement(By.xpath("//*[@id=\"headerMain\"]/div[1]/form/button[2]"));
	    poiu.click();
	    
	}
	
	public static void SendKeys(WebDriver driver, WebElement locators, int timeout,String value) {
    	
    	new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(locators));
	    locators.sendKeys(value);
    }
	
	public static void clickon(WebDriver driver,WebElement elements,int timeout) {
		
	new WebDriverWait(driver,timeout).until(ExpectedConditions.elementToBeClickable(elements));
	
	}
}


