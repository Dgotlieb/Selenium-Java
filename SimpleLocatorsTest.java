import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SimpleLocatorsTest {
    private static WebDriver driver;

    @BeforeClass
    public static void runOnceBeforeClass() {
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\dgotl\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
    }

    @Test
    public void test01_findByID(){
        System.out.println(driver.findElement(By.id("twotabsearchtextbox")));
    }

    @Test
    public void test02_findByClassName(){
        System.out.println(driver.findElement(By.className("nav-input")));
    }

    @Test
    public void test03_findByName(){
        System.out.println(driver.findElement(By.name("field-keywords")));
    }

    @Test
    public void test04_findByTagName(){
        System.out.println(driver.findElement(By.tagName("input")));
    }

    @Test
    public void test05_findAllElementsWithATagName(){
        String locatorValue = "input";
        System.out.println("Total elements with tag name " +
                locatorValue + " :" + driver.findElements(By.tagName(locatorValue)).size());
    }
    
    @Test
    public void test06_iterateElementsList(){
        List<WebElement> elementList = driver.findElements(By.tagName("input"));
        for (int i = 0; i < elementList.size(); i++) {
            if (elementList.get(i).getAttribute("autocomplete").equals("off")){
                elementList.get(i).sendKeys("shoes");
            }
        }
    }

    @AfterClass
    public static void tearDown(){
        driver.quit();
    }
}
