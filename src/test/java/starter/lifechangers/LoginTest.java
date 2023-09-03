package starter.lifechangers;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.openqa.selenium.WebDriver;


public class LoginTest {

    @Managed(driver = "chrome")
    private WebDriver driver;

    @Steps
    private UserSteps user;

    @Test
    @Title("User can log in with valid credentials")
    public void userCanLoginWithValidCredentials() {
        // Given the user is on the login page
        user.opensLoginPage();

        // When the user logs in with valid credentials
        user.attemptsToLoginWithCredentials("username", "password");

        // Then the user should be successfully logged in
        user.shouldSeeDashboardPage();
    }

    @Test
    @Title("User cannot log in with invalid credentials")
    public void userCannotLoginWithInvalidCredentials() {
        // Given the user is on the login page
        user.opensLoginPage();

        // When the user logs in with invalid credentials
        user.attemptsToLoginWithCredentials("invalid_username", "invalid_password");

        // Then the user should see an error message
        user.shouldSeeErrorMessage("Invalid credentials. Please try again.");
    }
}
