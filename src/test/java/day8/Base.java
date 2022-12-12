package day8;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
    
    
    public WebDriver driver;
    //public ReadConfig conf;
    //ctrl+Shoift+O ----- autoimport
    //pre-condition    ----- @BeforeSuite-----
    //Test
    //post-condition   ----- @AfterSuite
    
    
    @BeforeTest
    public void launchApp() throws Exception {
        
        System.out.println("launching application");
        
        
        //create an Object on ReadConfig file
        //conf = new ReadConfig();
        
        driver = WebDriverManager.chromedriver().create();
        
        
        
        driver.get("http://only-testing-blog.blogspot.com/2013/11/new-test.html");
        //driver.get(conf.get_sampleApp_URL());
        driver.manage().window().maximize();
        
    }
    
    @AfterTest
    public void closeApp() throws Exception {
        
        Thread.sleep(5000);
        driver.close();
        System.out.println("closing application");
    }

}


