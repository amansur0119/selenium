import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class motgagecalc {
 WebDriver driver;
 
 @BeforeTest
 public void openbrowser() {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\am88\\Desktop\\chromedriver.exe");
 driver=new ChromeDriver();
 driver.get("https://www.mortgagecalculator.org/");
 
 }
 
 
 @Test
  public void Homeval() {
	 driver.findElement(By.id("homeval")).sendKeys("2000000");
	}
 
@Test
public void downpayment() {
	driver.findElement(By.id("downpayment")).sendKeys("1000000");
	}

@Test
public void Loanamount() {
driver.findElement(By.id("loanamt")).sendKeys("100000");
}

@Test
public void interstrate() {
driver.findElement(By.id("intrstsrate")).sendKeys("3.8");
}

@Test
public void loanterm() {
driver.findElement(By.id("loanterm")).sendKeys("40");
}
@Test

public void StartDate(){
Select dropdown = new Select(driver.findElement(By.name("param[start_month]")));
dropdown.selectByVisibleText("jan");
driver.findElement(By.id("start_year")).sendKeys("2020");
}
@Test
public void propertytax() {
driver.findElement(By.id("pptytax"));

}
@Test

public void PMI()

{
driver.findElement(By.id("pmi")).sendKeys("0.7");
}
@Test
public void HomeIns(){
driver.findElement(By.id("hoi")).sendKeys("2000");
}
@Test
public void MonthlyHOA() { 
driver.findElement(By.id("hoa")).sendKeys("1");
}
@Test
public void LoanType(){
 Select dropdown = new Select(driver.findElement(By.name("param[milserve]")));
dropdown.selectByVisibleText("USDA");
}
@Test
public void BuyorRefill(){
Select dropdown = new Select(driver.findElement(By.name("param[refiorbuy]")));
dropdown.selectByVisibleText("Buy");
}
@Test
public void CreditRating(){
Select dropdown = new Select(driver.findElement(By.name("param[credit_rating]")));
dropdown.selectByVisibleText("Excellent (720+)");
}
@Test
public void Submit(){
driver.findElement(By.name("cal")).click();

}

@AfterTest
public void CloseBrowser(){
driver.close();
}

}







































