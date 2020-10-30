package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage extends BasePage {
    By alertTitle = By.id("com.whatsapp:id/alertTitle");
    By acceptAlert = By.id("android:id/button2");
    By agreeAndContinueButton = By.id("com.whatsapp:id/eula_accept");
    By enterPhoneNumberTitle = By.id("com.whatsapp:id/register_phone_toolbar_title");
    By nextButton = By.id("com.whatsapp:id/registration_submit");


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage invalidLogin() {
        waitForVisibilityOf(alertTitle);
        driver.findElement(acceptAlert).click();
        waitForClickabilityOf(agreeAndContinueButton);
        driver.findElement(agreeAndContinueButton).click();

        waitForVisibilityOf(enterPhoneNumberTitle);
        waitForClickabilityOf(nextButton);
        driver.findElement(nextButton).click();
        return new LoginPage(driver);
    }
}