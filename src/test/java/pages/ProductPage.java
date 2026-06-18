package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
   public static WebDriver driver;
    //Define Locators for "Swag Lab product list " elements
    private By screenheading = By.className("app_logo");
    private static By Saucelabbackpack = By.xpath("//*[@id=\"item_4_title_link\"]/div");
    private static By Addtocartbutton = By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]");
    private By SauceLabsFleeceJacket = By.xpath("//*[@id=\"item_5_title_link\"]/div");
    private By Addtocartbutton0 = By.xpath("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]");

    public ProductPage(WebDriver driver) {this.driver = driver;}

  //Actions
    public static void clickAddtocartbutton()
    {
          driver.findElement(Addtocartbutton).click();
    }
    public void clickSaucelabbackpack() {
        driver.findElement(Saucelabbackpack).click();
    }
    public void clickAddtocartbutton0(){
        driver.findElement(Addtocartbutton0).click();
    }



}