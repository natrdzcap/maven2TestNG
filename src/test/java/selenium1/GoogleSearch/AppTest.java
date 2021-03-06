package selenium1.GoogleSearch;

import java.util.concurrent.TimeUnit;

 


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

 

public class AppTest {
    private static String baseUrl = "https://www.google.com";
    public static WebDriver driver;
    
    @BeforeClass
    public static void setUp() throws Exception{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\diego.ambriz.amad\\Desktop\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }
    
    @AfterClass
    public static void tearDown() throws Exception{
        driver.quit();
    }

 

}