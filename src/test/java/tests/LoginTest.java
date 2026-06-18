package tests;

import base.BaseTest;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import pages.LoginPage;
import pages.ProductPage;

public class LoginTest extends BaseTest {
    @Test
    public void testValidLogin() {
   LoginPage loginPage = new LoginPage(driver);
   loginPage.enterUsername("standard_user");
   loginPage.enterPassword("secret_sauce");
   loginPage.clickloginButton();

   // Assertions
   //     Assert.assertTru(driver.findElement(
   //             By.id("Welcome message")
    //    ))
    }

}
