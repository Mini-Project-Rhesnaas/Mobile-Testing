package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import starter.helpers.DoActionAltaShopMobile;
import starter.helpers.NavigateToAltaShopMobile;

import java.net.MalformedURLException;

public class StepDefinitions {

    @Given("{actor} open the app")
    public void userOpenTheApp(Actor actor) throws MalformedURLException {
        actor.wasAbleTo(NavigateToAltaShopMobile.theAltaShopLoginPage());
    }

    @When("{actor} tap login menu")
    public void userTapLoginMenu(Actor actor) {
        actor.attemptsTo(DoActionAltaShopMobile.clickLoginMenu());
    }

    @And("{actor} tap email field")
    public void userTapEmailField(Actor actor) {
        actor.attemptsTo(DoActionAltaShopMobile.tapEmailField());
    }

    @And("{actor} input valid email {string}")
    public void userInputValidEmail(Actor actor, String email) {
        actor.attemptsTo(DoActionAltaShopMobile.fillEmail(email));
    }

    @And("{actor} tap password field")
    public void userTapPasswordField(Actor actor) {
        actor.attemptsTo(DoActionAltaShopMobile.tapPasswordField());
    }

    @And("{actor} input valid password {string}")
    public void userInputValidPassword(Actor actor, String password) {
        actor.attemptsTo(DoActionAltaShopMobile.fillPassword(password));
    }

    @And("{actor} tap login button")
    public void userClickLoginButton(Actor actor) {
        actor.attemptsTo(DoActionAltaShopMobile.clickLoginButton());
    }

    @Then("User on home page")
    public void userOnHomePage() {

    }

}
