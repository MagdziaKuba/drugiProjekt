package demoPage.tests;

import demoPage.pages.HomePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutTest extends BaseTest{
    @Test
    public void checkoutTest(){
        new HomePage(driver).openShopPage().openProduct("Java Selenium WebDriver").addProductToCart()
                .viewCart().openAddressDetails();

    }

}
