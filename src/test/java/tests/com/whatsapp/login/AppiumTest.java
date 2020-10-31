package tests.com.whatsapp.login;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import screenObjects.whatsapp.com.LoginScreenObject;
import tests.AndroidSetup;

public class AppiumTest extends AndroidSetup {

    //private AndroidDriver driver;

    @BeforeClass
    public void setUp() throws Exception {
        prepareAndroidForAppium();
    }

    @AfterClass
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void TC_01_Go_To_PhoneNumber_Page() throws InterruptedException {
        new LoginScreenObject(driver).invalidLogin();
    }

    @Test
    public void TC_02() {

        System.out.println("Test success");
    }

}