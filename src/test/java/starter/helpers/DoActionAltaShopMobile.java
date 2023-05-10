package starter.helpers;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://127.0.0.1:4723")
public class DoActionAltaShopMobile {
    public static Performable clickLoginMenu(){
        return Task.where("{0} click login menu", Click.on(AltaShopMobilePage.LOGIN_MENU));
    }
    public static Performable tapEmailField(){
        return Task.where("{0} fill email field", Click.on(AltaShopMobilePage.EMAIL_FIELD));
    }
    public static Performable fillEmail(String email){
        return Task.where("{0} fill email field" + email, Enter.theValue(email).into(AltaShopMobilePage.EMAIL_FIELD));
    }
    public static Performable tapPasswordField(){
        return Task.where("{0} fill email field", Click.on(AltaShopMobilePage.PASSWORD_FIELD));
    }
    public static Performable fillPassword(String password){
        return Task.where("{0} fill password field" + password, Enter.theValue(password).into(AltaShopMobilePage.PASSWORD_FIELD));
    }
    public static Performable clickLoginButton(){
        return Task.where("{0} click login button", Click.on(AltaShopMobilePage.LOGIN_BUTTON));
    }
    public static Performable clickRegisMenu(){
        return Task.where("{0} click regis menu", Click.on(AltaShopMobilePage.REGISTER_MENU));
    }
    public static Performable fillFullname(String fullname){
        return Task.where("{0} fill fullname field" + fullname, Enter.theValue(fullname).into(AltaShopMobilePage.FULLNAME_FIELD));
    }
    public static Performable fillEmailRegis(String emailRegis){
        return Task.where("{0} fill email regis field" + emailRegis, Enter.theValue(emailRegis).into(AltaShopMobilePage.EMAIL_REGIS_FIELD));
    }
    public static Performable fillPasswordRegis(String passwordRegis){
        return Task.where("{0} fill password regis field" + passwordRegis, Enter.theValue(passwordRegis).into(AltaShopMobilePage.PASSWORD_REGIS_FIELD));
    }
    public static Performable clickRegisButton(){
        return Task.where("{0} click regis button", Click.on(AltaShopMobilePage.RESGISTER_BUTTON));
    }
    public static Performable clickLogoutButton(){
        return Task.where("{0} click logout button", Click.on(AltaShopMobilePage.LOGOUT_BUTTON));
    }
    public static Performable clickBuyButton(){
        return Task.where("{0} click buy button", Click.on(AltaShopMobilePage.BUY_BUTTON));
    }
}
