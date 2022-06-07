package demoPage.tests;

import demoPage.utils.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver=DriverFactory.getDriver();
        driver.get("http://seleniumdemo.com/");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown(){
        //driver.quit();
    }
}
