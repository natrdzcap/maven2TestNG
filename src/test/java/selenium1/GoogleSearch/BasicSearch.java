package selenium1.GoogleSearch;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class BasicSearch extends AppTest {
    public  BasePage page = new BasePage();
    public  String search = "Esta es una prueba";
    

 

    @Test
	public void fillTextBox() throws Exception{
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        page.textbox_search(driver).sendKeys(search);
    }

 

}

