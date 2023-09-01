package starter.luma;

import org.openqa.selenium.Keys;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.ui.InputField;

public class Login {
	public static Performable sendCredentials(String email, String password) {
        return Task.where("{0} tries to login " + email,
          Ensure.that(LoginPageContent.headingText()).isEqualTo("Customer Login"),
          Enter.theValue(email).into(InputField.withNameOrId("email")).thenHit(Keys.TAB),
          Enter.theValue(password).into(InputField.withNameOrId("pass")).thenHit(Keys.ENTER)
        );
    }
}

