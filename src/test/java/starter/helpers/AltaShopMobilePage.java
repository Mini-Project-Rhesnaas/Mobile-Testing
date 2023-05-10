package starter.helpers;

import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

@DefaultUrl("http://127.0.0.1:4723")
public class AltaShopMobilePage extends PageObject {
    public static Target LOGIN_MENU = Target.the("login menu").located(By.xpath("/hierarchy" +
            "/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout" +
            "/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button"));

    public static Target EMAIL_FIELD = Target.the("email field").located(By.xpath("/hierarchy/android.widget.FrameLayout" +
            "/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View" +
            "/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]"));

    public static Target PASSWORD_FIELD = Target.the("password field").located(By.xpath("/hierarchy/android.widget.FrameLayout" +
            "/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View" +
            "/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]"));

    public static Target LOGIN_BUTTON = Target.the("login button").located(By.xpath("//android.widget.Button[@content-desc=\"Login\"]"));

    public static Target REGISTER_MENU = Target.the("resgister menu").located(By.xpath("//android.widget.Button[@content-desc=\"Register\"]"));

    public static Target FULLNAME_FIELD = Target.the("fullname field").located(By.xpath("/hierarchy/android.widget.FrameLayout" +
            "/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View" +
            "/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]"));

    public static Target EMAIL_REGIS_FIELD = Target.the("email regis field").located(By.xpath("/hierarchy/android.widget.FrameLayout" +
            "/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View" +
            "/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]"));

    public static Target PASSWORD_REGIS_FIELD = Target.the("password regis field").located(By.xpath("/hierarchy/android.widget.FrameLayout" +
            "/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View" +
            "/android.view.View/android.view.View/android.view.View/android.widget.EditText[3]"));

    public static Target RESGISTER_BUTTON = Target.the("register button").located(By.xpath("//android.widget.Button[@content-desc=\"Register\"]"));

    public static Target LOGOUT_BUTTON = Target.the("logout button").located(By.xpath("/hierarchy/android.widget.FrameLayout" +
            "/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View" +
            "/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button"));

    public static Target BUY_BUTTON = Target.the("buy button").located(By.xpath("(//android.widget.Button[@content-desc=\"Beli\"])[1]"));
}
