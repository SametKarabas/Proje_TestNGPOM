package Projeler.Proje_5.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
    public CheckoutPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "termsofservice")
    public WebElement terms;

    @FindBy(id = "checkout")
    public WebElement checkOut;

    @FindBy(id = "BillingNewAddress_CountryId")
    public WebElement country;
    @FindBy(id = "BillingNewAddress_Address1")
    public WebElement address;

    @FindBy(id = "BillingNewAddress_City")
    public WebElement city;

    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    public WebElement zipCode;
    @FindBy(id = "BillingNewAddress_PhoneNumber")
    public WebElement phone;

    @FindBy(css = "input[onclick=\"Billing.save()\"]")
    public WebElement continue1;

    @FindBy(css = "input[onclick=\"Shipping.save()\"]")
    public WebElement continue2;

    @FindBy(css = "input[onclick=\"ShippingMethod.save()\"]")
    public WebElement continue3;

    @FindBy(css = "input[onclick=\"PaymentMethod.save()\"]")
    public WebElement continue4;

    @FindBy(css = "input[onclick=\"PaymentInfo.save()\"]")
    public WebElement continue5;

    @FindBy(css = "input[onclick=\"ConfirmOrder.save()\"]")
    public WebElement confirmBtn;

    @FindBy(xpath = "//*[text()='Your order has been successfully processed!']")
    public WebElement successMessage;


}
