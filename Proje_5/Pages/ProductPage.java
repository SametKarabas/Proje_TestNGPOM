package Projeler.Proje_5.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
    public ProductPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[class=\"product-grid home-page-product-grid\"]>:nth-child(3) [value=\"Add to cart\"]")
    public WebElement addToCart;

}
