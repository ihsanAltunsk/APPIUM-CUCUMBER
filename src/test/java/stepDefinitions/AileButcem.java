package stepDefinitions;

import io.cucumber.java.en.Given;
import utilities.ReusableMethods;

public class AileButcem {
    @Given("Set up the initial screen settings and then access the login page.")
    public void set_up_the_initial_screen_settings_and_then_access_the_login_page() throws InterruptedException {
        ReusableMethods.wait(3);
        for (int i = 0; i < 6; i++) {
            ReusableMethods.scrollPageHorizantal(900 , 1000 , 200 , 500);
        }
    }
    @Given("Log in with user credentials by entering email and password information.")
    public void log_in_with_user_credentials_by_entering_email_and_password_information() {

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
