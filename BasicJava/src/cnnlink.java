import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cnnlink {
	
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\am88\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://cnn.com");
		
		driver.manage().window().maximize(); 
		Thread.sleep(3000);
		
		driver.manage().window().fullscreen(); 
		
		List<WebElement>number_of_hidden_elements = driver.findElements(By.tagName("input"));  
		
		System.out.println(number_of_hidden_elements.size()); 
		
		for(int i=0; i<number_of_hidden_elements.size(); i++) 
		{
			
			if(number_of_hidden_elements.get(i).getAttribute("type").trim().equalsIgnoreCase("hidden"))
			{
				if(!number_of_hidden_elements.get(i).getAttribute("value").trim().isEmpty()) 
				{
				
					System.out.println("Hidden Element Text = " + i + " " + number_of_hidden_elements.get(i).getAttribute("value").trim());
				}
			
			}
		}
		
	}

}