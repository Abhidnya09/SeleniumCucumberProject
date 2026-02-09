package stepDefinition;

import io.cucumber.java.en.Given;

import static pages.HomePage.hamburger_click;
import static pages.HomePage.signin_click;
public class BasePage {
    @Given("^User navigates to the Login page$")
    public void user_navigates_to_the_login_page() throws InterruptedException {
    hamburger_click();
    signin_click();
    }
}
