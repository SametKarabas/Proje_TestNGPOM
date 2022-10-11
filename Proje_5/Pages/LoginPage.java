package Projeler.Proje_5.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "login-button")
    public WebElement loginBtn;

    @FindBy(className = "account")
    public WebElement successMessage;

    @FindBy(className = "validation-summary-errors")
    public WebElement errorMessage;
}
