import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriversTest{

    @BeforeClass
    public static void runOnceBeforeClass() {
        System.setProperty("webdriver.chrome.driver" , "C://…..ChromeDriver.exe");
        WebDriver driver = new ChromeDriver();
        // Get driver at: https://chromedriver.chromium.org/downloads

        System.setProperty("webdriver.gecko.driver","C://..geckodriver.exe");
        WebDriver fireFoxDriver = new FirefoxDriver();
        // Get driver at: https://github.com/mozilla/geckodriver/releases
    }
}
