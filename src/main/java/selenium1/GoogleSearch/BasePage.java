package selenium1.GoogleSearch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement; //Agregadas al POM
public class BasePage 
{
	private static String searchBoxName = "q";
	private static String searchButtonName = "btnK";
	private static String amFeelingLuckyName = "btnI";
//	private static String extraBttn = null;

	public WebElement textbox_search(WebDriver driver) {
		return driver.findElement(By.name(searchBoxName));
	}
	public  WebElement button_search(WebDriver driver) {
		return driver.findElement(By.name(searchButtonName));
	}
	public  WebElement button_amFeelingLucky(WebDriver driver) {
		return driver.findElement(By.name(amFeelingLuckyName));
	}
}
