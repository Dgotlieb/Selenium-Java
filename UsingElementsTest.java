import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class UsingElementsTest {
    private static WebDriver driver;

    @BeforeClass
    public static void runOnceBeforeClass() {
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\dgotl\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
        driver = new ChromeDriver();
        driver.get("https://translate.google.com");
    }

    @Test
    public void test01_clickAnElement() {
        driver.findElement(By.id("source")).click();
    }

    @Test
    public void test02_submitForm() {
        driver.findElement(By.id("source")).submit();
    }

    @Test
    public void test03_sendKeys() {
        driver.findElement(By.id("source")).sendKeys("hello");
    }

    @Test
    public void test04_clearTextArea() {
        driver.findElement(By.id("source")).clear();
    }

    // todo @Test - will not work now...
    public void test05_clickAnElementFromAListWithAKnownIndex() {
        List<WebElement> buttonsList = driver.findElements(By.id("Button"));
        buttonsList.get(3).click();
    }

    //todo @Test - will not work now...
    public void test06_iteratingAListOfElements(){
        // Create a list of all elements with the ID=Button
        List<WebElement> buttonsList = driver.findElements(By.id("Button"));
        // Iterating through the list
        for (WebElement currentButton : buttonsList) {
            // Finding a specific element with a specific text and clicking it
            if (currentButton.getText().equals("button1")) {
                currentButton.click();
            }
        }
    }

    @AfterClass
    public static void tearDown(){
        driver.quit();
    }
}
