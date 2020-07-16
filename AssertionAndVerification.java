import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssertionAndVerification {
    private static WebDriver driver;

    @BeforeClass
    public static void runOnceBeforeClass() {
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\dgotl\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
        driver = new ChromeDriver();
        driver.get("https://dgotlieb.github.io/CountryList/index.html");
    }

    @Test
    public void assertAndVerify() {
        WebElement countriesElement = driver.findElement(By.id("country"));
        System.out.println("Is displayed: " + countriesElement.isDisplayed());
        System.out.println("Is enabled: " + countriesElement.isEnabled());
        System.out.println("Is selected: " + countriesElement.isSelected());

        System.out.println("Height: " + countriesElement.getRect().getHeight());
        System.out.println("Width: " + countriesElement.getRect().getWidth());
        System.out.println("X: " + countriesElement.getRect().getX());
        System.out.println("Y: " + countriesElement.getRect().getY());

        System.out.println("Tag name: " + countriesElement.getTagName());
        System.out.println("Text: " + countriesElement.getText());
        System.out.println("Attribute: " + countriesElement.getAttribute("class"));
    }

    @AfterClass
    public static void tearDown(){
        driver.quit();
    }
}
