import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FBTESTNG {

	WebDriver driver;
	
  @BeforeTest
  public void OpenBrowser() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\am88\\Desktop\\chromedriver.exe");
	  ChromeOptions option =new ChromeOptions();
	  option.setHeadless(true);
	  driver = new ChromeDriver(option);
	  driver.get("https://facebook.com");
  }
  
  @Test(enabled=true, priority=0, description="Set First and Last Name", testName="NA")
  public void FirstLastName()
  {
	  driver.findElement(By.id("u_0_f")).sendKeys("Ali");
	  driver.findElement(By.id("u_0_h")).sendKeys("Mansur");
  }
  
  @Test(enabled=true, priority=1, description="Write and Confirm Email", testName="NA")
  public void SetConfEmail()
  {
	  driver.findElement(By.id("u_0_k")).sendKeys("a.mansur0119@gmail.com");
	  driver.findElement(By.id("u_0_n")).sendKeys("a.mansur0119@gmail.com");
  }
  
  
  @Test(enabled=true, priority=2, description="Set Password", testName="NA")
  public void SetPassword()
  {
	  driver.findElement(By.id("u_0_p")).sendKeys("1988"
	  		+ "");
  }
  
  @Test(enabled=true, priority=3, description="Set Da"
  		+ "te of Birth", testName="NA")
  public void SetDOB()
  {
	  	Select dropdown = new Select(driver.findElement(By.id("month")));
		dropdown.selectByIndex(7);
		
		Select dropdown2 = new Select(driver.findElement(By.id("day")));
		dropdown2.selectByIndex(27);
		
		Select dropdown3 = new Select(driver.findElement(By.id("year")));
		dropdown3.selectByIndex(23);
  }
  
  @Test(enabled=true, priority=4, description="Set Gender", testName="NA")
  public void setGender() throws InterruptedException
  {
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
	  Thread.sleep(1000);
  }
  
  @Test(enabled=true, priority=5, description="Click Submit button", testName="NA")
  public void Submit()
  {
	  driver.findElement(By.name("websubmit")).click();
  }
  
  @AfterTest
  public void CloseBrowser()
  {
	  driver.close();
  }
  
  
}
