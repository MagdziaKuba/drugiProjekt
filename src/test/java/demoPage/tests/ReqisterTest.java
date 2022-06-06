package demoPage.tests;

import demoPage.pages.HomePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ReqisterTest extends BaseTest{
    @Test
    public void registerUserTest() throws InterruptedException {
        WebElement entryTitle = new HomePage(driver).openMyAccountPage()
               .registerUser("qqqqwqwwwwwemmmmagdamagdusia@onetus.pl","qwwqqwqwweqwmmmmagdamagdusia@onetus.pl").getEntryTitle();
        Thread.sleep(3000);
        Assert.assertTrue(entryTitle.isDisplayed());
        Assert.assertEquals(entryTitle.getText(),"Log out");
    }
}
