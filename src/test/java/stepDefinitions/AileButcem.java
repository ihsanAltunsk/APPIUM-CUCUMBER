package stepDefinitions;

import io.cucumber.java.en.Given;
import pages.AileButcemPage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class AileButcem {
    AileButcemPage aileButcemPage = new AileButcemPage();
    @Given("Set up the initial screen settings {int} {int} {int} {int} {int} {int} and then access the login {string} page.")
    public void set_up_the_initial_screen_settings_and_then_access_the_login_page(int for1, int for2, int x, int y, int z, int duration, String text) throws InterruptedException {
        ReusableMethods.wait(3);
        for (int i = for1; i < for2; i++) {
            ReusableMethods.scrollPageHorizantal(x , y , z , duration);
        }
        ReusableMethods.scrollWithUiScrollable(text);
    }
    @Given("Log in with user credentials by entering {string} and {string} information.")
    public void log_in_with_user_credentials_by_entering_email_and_password_information(String email , String password) {
        aileButcemPage.emailBox.sendKeys(ConfigReader.getProperty(email));
        aileButcemPage.passwordBox.sendKeys(ConfigReader.getProperty(password));
    }
    @Given("Confirm that the login to the application is successful with user credentials.")
    public void confirm_that_the_login_to_the_application_is_successful_with_user_credentials() {

    }
    @Given("Click on the plus button on the homepage.")
    public void click_on_the_plus_button_on_the_homepage() {

    }
    @Given("Click on the income addition section.")
    public void click_on_the_income_addition_section() {

    }
    @Given("Specify and save the description, income type, category, date, and amount.")
    public void specify_and_save_the_description_income_type_category_date_and_amount() {

    }
    @Given("Confirm that it has been successfully added.")
    public void confirm_that_it_has_been_successfully_added() {

    }
}
