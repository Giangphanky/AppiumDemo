package screenObjects.whatsapp.com;

import commons.BaseScreen;
import io.appium.java_client.android.AndroidDriver;
import screenUIs.whatsapp.com.LoginScreenUI;

public class LoginScreenObject extends BaseScreen {


    public LoginScreenObject(AndroidDriver driver) {
        super(driver);
    }

    public LoginScreenObject invalidLogin() {
        waitForVisibilityOf(LoginScreenUI.alertTitle);
        driver.findElement(LoginScreenUI.acceptAlert).click();
        waitForClickabilityOf(LoginScreenUI.agreeAndContinueButton);
        driver.findElement(LoginScreenUI.agreeAndContinueButton).click();

        waitForVisibilityOf(LoginScreenUI.enterPhoneNumberTitle);
        waitForClickabilityOf(LoginScreenUI.nextButton);
        driver.findElement(LoginScreenUI.nextButton).click();
        return new LoginScreenObject(driver);
    }
}