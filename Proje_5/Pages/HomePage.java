package Projeler.Proje_5.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "ico-login")
    public WebElement loginMenuBtn;

    @FindBy(className = "ico-logout")
    public List<WebElement> logOutBtn;

    @FindBy(id = "topcartlink")
    public WebElement shoppingCart;
}
