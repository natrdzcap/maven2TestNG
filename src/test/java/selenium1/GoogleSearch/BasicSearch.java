package selenium1.GoogleSearch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement; //Agregadas al POM
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;



public class BasicSearch extends AppTest {
    public  BasePage page = new BasePage();
    public  String search = "Esta es una prueba";
    

 

    @Test
     public void fillTextBox() throws Exception{
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        page.textbox_search(driver).sendKeys(search);
    }

 

}

