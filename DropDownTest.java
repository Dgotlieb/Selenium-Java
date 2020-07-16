import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest {
    private static WebDriver driver;

    @BeforeClass
    public static void runOnceBeforeClass() {
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\dgotl\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
        driver = new ChromeDriver();
        driver.get("https://dgotlieb.github.io/CountryList/index.html");
    }

    @Test
    public void test01_selectCountryByVisbleText() {
        Select mySelection = new Select(driver.findElement(By.id("country")));
        mySelection.selectByVisibleText("Israel");
        System.out.println(mySelection.getFirstSelectedOption().getText());
    }

    @Test
    public void test02_selectCountryByIndex() {
        Select mySelection = new Select(driver.findElement(By.id("country")));
        mySelection.selectByIndex(108);
        System.out.println(mySelection.getFirstSelectedOption().getText());
    }

    @Test
    public void test03_selectCountryByValue() {
        Select mySelection = new Select(driver.findElement(By.id("country")));
        mySelection.selectByValue("IL");
        System.out.println(mySelection.getFirstSelectedOption().getText());
    }

    @AfterClass
    public static void tearDown(){
        driver.quit();
    }
}
