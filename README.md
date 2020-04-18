# Selenium-Java

## 1. Download ChromeDriver:

###   A. Check your Google Chrome version:
![alt text](https://github.com/Dgotlieb/Selenium-Java/blob/master/images/About.png)

![alt text](https://github.com/Dgotlieb/Selenium-Java/blob/master/images/version.png)


###   B. Download the ChromeDriver matching your Google Chrome from:
https://sites.google.com/a/chromium.org/chromedriver/downloads 


----------------------------------------------------------------------------

## 2. Add Selenium Webdriver Java libraries:
### A. Go to https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java
### B. Press on the latest stable release
### C. Copy maven dependency
### D. Paste it inside your POM.xml in between <dependencies></dependencies>

----------------------------------------------------------------------------

## 3. Add WebDriver code:
### A. Create a new Java class name it: WebTest
### B. Copy the below code into tour class:

```java
    import org.openqa.selenium.chrome.ChromeDriver;

    public class WebTest {
        private static ChromeDriver driver;

        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "<PATH_TO_CHROMEDRIVER.EXE>\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://translate.google.com");
        }
    }
```
    
### C. Change the <PATH_TO_CHROMEDRIVER.EXE> to the real path your chromedriver.exe file is in (without deleting chromedriver.exe).


