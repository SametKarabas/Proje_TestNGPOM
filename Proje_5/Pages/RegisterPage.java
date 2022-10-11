package Projeler.Proje_5.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
    public RegisterPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "ico-register")
    public WebElement registerMenuBtn;

    @FindBy(id = "gender-female")
    public WebElement genderFemale;

    @FindBy(id = "FirstName")
    public WebElement firstNameInput;

    @FindBy(id = "LastName")
    public WebElement lastNameInput;

    @FindBy(id = "Email")
    public WebElement emailInput;

    @FindBy(id = "Password")
    public WebElement passwordInput;

    @FindBy(id = "ConfirmPassword")
    public WebElement passwordInput2;

    @FindBy(className = "result")
    public WebElement successMessage;

    @FindBy(id = "register-button")
    public WebElement registerBtn;

    @FindBy(css = "[value='Continue']")
    public WebElement continueBtn;

    @FindBy(className = "ico-logout")
    public WebElement logOutBtn;
}
