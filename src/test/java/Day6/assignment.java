package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class assignment {
	
	@Test

	public void opc() throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
	        driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	        
	        
	        Thread.sleep(4000);
	      
	        Actions actions = new Actions(driver);
	        actions.click(driver.findElement(By.id("Email")))
	        .keyDown(Keys.CONTROL)
	        .sendKeys("a")
	        .keyUp(Keys.CONTROL)
	        .sendKeys(Keys.BACK_SPACE)
	        .build()
	        .perform();
	        
	        Thread.sleep(3000);
	       WebElement email = driver.findElement(By.id("Email"));
	       email.sendKeys("admin@yourstore.com");
	       
	       Thread.sleep(3000);
	       
	       actions.click(driver.findElement(By.id("Password")))
	        .keyDown(Keys.CONTROL)
	        .sendKeys("a")
	        .keyUp(Keys.CONTROL)
	        .sendKeys(Keys.BACK_SPACE)
	        .build()
	        .perform();
	       
	       Thread.sleep(3000);
	       
	       WebElement Password = driver.findElement(By.id("Password"));
	       Password.sendKeys("admin");
	       
	       driver.findElement(By.id("RememberMe")).click();
	       Thread.sleep(2000);
	       driver.findElement(By.tagName("button")).click();
	       	       
	       Thread.sleep(3000);
	       
	      //Click on customer 
	       driver.findElement(By.xpath("//a[contains(@href,\"/Admin/Customer/List\")]")).click();
	    
	       driver.findElement(By.xpath("//a[contains(@href,\"/Admin/Customer/List\")]//child::p[contains(text(),'Cus')]")).click();
	       Thread.sleep(8000);
	       
	       //Click for logout
	       driver.findElement(By.xpath("//*[@id=\"navbarText\"]/ul/li[3]/a")).click();
	        
	       Thread.sleep(3000);
	        driver.close();
	}

}
