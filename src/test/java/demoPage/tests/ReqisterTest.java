package demoPage.tests;

import demoPage.pages.HomePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ReqisterTest extends BaseTest{
    @Test
    public void registerUserTest() throws InterruptedException {

        int random= (int) (Math.random()*1000);

        WebElement entryTitle = new HomePage(driver).openMyAccountPage()
               .registerUserValidDate("magdusia"+random+"@onetus.pl","magdusia"+random+"@onetus.pl").getEntryTitle();
        Thread.sleep(3000);
        Assert.assertTrue(entryTitle.isDisplayed());
        Assert.assertEquals(entryTitle.getText(),"Log out");
    }

    @Test
    public void registerUserwithSameEmailTest() throws InterruptedException {

        WebElement errors = new HomePage(driver).openMyAccountPage()
                .registerUserInvalidDate("magdusia@onetus.pl","magdusia@onetus.pl").getErrors();
        Thread.sleep(3000);
        Assert.assertTrue(errors.isDisplayed());
        Assert.assertEquals(errors.getText(),"Error: An account is already registered with your email address. Please log in.");
        Assert.assertTrue(errors.getText().contains("Error"));
    }
}
