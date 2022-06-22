package demoPage.tests;

import demoPage.pages.HomePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInTest extends BaseTest{


    @Test
    public void userLogIn() throws InterruptedException {
        WebElement userLogin = new HomePage(driver).openMyAccountPage()
                .loginUserIn("magdusia425@onetus.pl","magdusia425@onetus.pl").getEntryTitle();
        Thread.sleep(3000);
        Assert.assertEquals(userLogin .getText(),"Log out");

    }

    @Test
    public void userUnLogIn() throws InterruptedException {
        WebElement userLogin = new HomePage(driver).openMyAccountPage()
                .unloginUserIn("mmmagdusia425@onetus.pl","mmmagdusia425@onetus.pl").getErrors();
        Thread.sleep(3000);
        Assert.assertTrue(userLogin.getText().contains("Incorrect username or password."));

    }
}
