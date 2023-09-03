package starter.lifechangers;

import net.thucydides.core.annotations.Step;

public class UserSteps {

    private LoginPage loginPage;

    @Step("User opens the login page")
    public void opensLoginPage() {
        loginPage.open();
    }

    @Step("User attempts to log in with username: {0} and password: {1}")
    public void attemptsToLoginWithCredentials(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLoginButton();
    }

    @Step("User should see the dashboard page")
    public void shouldSeeDashboardPage() {
        // Add assertion to verify that the user is on the dashboard page
    }

    @Step("User should see an error message: {0}")
    public void shouldSeeErrorMessage(String errorMessage) {
        // Add assertion to verify the error message is displayed
    }
}
