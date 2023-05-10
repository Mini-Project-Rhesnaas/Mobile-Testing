package starter.helpers;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import net.serenitybdd.screenplay.Performable;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class NavigateToAltaShopMobile {
    public static Performable theAltaShopLoginPage() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options()
                .setUdid("emulator-5554")
                .setApp("C:/Users/My Windows/Documents/app-release.apk");
        AndroidDriver driver = new AndroidDriver(
                // The default URL in Appium 1 is http://127.0.0.1:4723/wd/hub
                new URL("http://127.0.0.1:4723"), options);
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
        return null;
    }
}
