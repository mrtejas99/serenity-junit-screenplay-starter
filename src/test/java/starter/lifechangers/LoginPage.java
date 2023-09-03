package starter.lifechangers;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://example.com/login")
public class LoginPage extends PageObject {

    @FindBy(id = "username")
    private WebElement usernameField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "loginButton")
    private WebElement loginButton;

    public void enterUsername(String username) {
        element(usernameField).type(username);
    }

    public void enterPassword(String password) {
        element(passwordField).type(password);
    }

    public void clickLoginButton() {
        element(loginButton).click();
    }
}
