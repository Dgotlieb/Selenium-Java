import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpecialLocatorsTest {
    private static WebDriver driver;

    @BeforeClass
    public static void runOnceBeforeClass() {
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\dgotl\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
        driver = new ChromeDriver();
        driver.get("https://translate.google.com");
    }

    @Test
    public void test01_findByCSSSelector() {
        System.out.println(driver.findElement(By.cssSelector("div[value=en]")));
    }

    @Test
    public void test02_findByXpath(){
        System.out.println(driver.findElement(By.xpath("//textarea[@spellcheck='false' and @rows='1']")));
    }

    @AfterClass
    public static void tearDown(){
        driver.quit();
    }
}
