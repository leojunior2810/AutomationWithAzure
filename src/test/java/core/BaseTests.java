package core;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.bs.A;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;

public class BaseTests {
    public static WebDriver driver;
    

    public BaseTests() {
    }
    @Before
    public static WebDriver getDriver() {
            System.setProperty("webdriver.chrome.driver", "src/test/java/support/chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless");
            WebDriver driver = new ChromeDriver(options);
            driver.navigate().to("https://www.google.com.br");
            return driver;
    }



    @After
    public void tearDown(){
        if(driver != null){
            driver.quit();
        }
    }

}
