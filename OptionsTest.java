import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class OptionsTest {
    private static WebDriver driver;

    @BeforeClass
    public static void beforeAll() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\XXXXXXXXXX\\Downloads\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("-incognito");
        driver = new ChromeDriver(options);
        driver.get("https://translate.google.com");
    }

    @Test
    public void test_01(){
        System.out.println(driver.getTitle());
    }

    @AfterClass
    public static void afterAll(){
        driver.quit();
    }
}
