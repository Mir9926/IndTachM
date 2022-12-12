package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Amazon {
	
	@Test
	public void Seemore() throws InterruptedException{
		 WebDriver driver = new ChromeDriver();
	        //driver.get("https://www.amazon.in/");
	       // driver .get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
	        driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	        
	        Thread.sleep(4000);
	        
	       // driver.findElement(By.xpath("//*[@id=\"IU6SYXpvK54wNAfGnoM3vg\"]/div[3]/a")).click();
	        
	       // driver.findElement(By.xpath("//h2[text()='Shop by Category']//parent::div//following-sibling::div[@class=\"a-cardui-footer\"]//child::a[text()='See more']")).click()
	        Thread.sleep(4000);
	       // seemore.click();
	     
	       // driver.findElement(By.xpath("//td[contains(text(),'Helen Bennett')]//preceding-sibling::td/input[@type='checkbox']")).click();

//	        String heading = driver.findElement(By.xpath("//h2[text()='Shop by Category']//parent::div//following-sibling::div[@class=\\\"a-cardui-footer\\\"]//child::a[text()='See more']")).getText();
//	        System.out.println(heading);
	        Thread.sleep(5000);
	        
	        driver.close();
	        
	      
	        
	        
	        
		
	}

}
