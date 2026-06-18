package tests;


import org.testng.annotations.Test;

import pages.ProductPage;

import static pages.ProductPage.*;

public class ProductTest extends LoginTest {
   @Test

   public void AddtoCart() {
       ProductPage productPage= new ProductPage(driver);
       productPage.clickSaucelabbackpack();
       ProductPage.clickAddtocartbutton();

  //ProductPage.clickAddtocartbutton0();

   }
}