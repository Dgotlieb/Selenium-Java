import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    private static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\XXXXXXXXXX\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://translate.google.com");
    }
}
