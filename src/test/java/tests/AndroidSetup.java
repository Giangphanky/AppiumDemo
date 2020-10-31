package tests;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;


public class AndroidSetup {
    protected AndroidDriver driver;
    protected void prepareAndroidForAppium() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName","Android");

        //mandatory capabilities
        capabilities.setCapability("platformVersion","5.0");
        capabilities.setCapability("deviceName","Google Nexus 6");
        capabilities.setCapability("noReset","True");
        capabilities.setCapability("autoGrantPermissions","True");
        capabilities.setCapability("appPackage","com.whatsapp");
        capabilities.setCapability("appActivity","com.whatsapp.Main");

        //other caps
        driver =  new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }
}