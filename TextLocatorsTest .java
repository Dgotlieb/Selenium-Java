import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TextLocatorsTest {
    private static WebDriver driver;

    @BeforeClass
    public static void runOnceBeforeClass() {
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\dgotl\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
        driver = new ChromeDriver();
        driver.get("https://translate.google.com");
    }

    @Test
    public void test01_findElementByText() {
        System.out.println(driver.findElement(By.linkText("History")));
    }

    @Test
    public void test02_findElementByPartialText(){
        System.out.println(driver.findElement(By.partialLinkText("Trans")));
    }

    @AfterClass
    public static void tearDown(){
        driver.quit();
    }
}
