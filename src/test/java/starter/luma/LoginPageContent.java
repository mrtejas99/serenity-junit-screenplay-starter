package starter.luma;

import org.junit.jupiter.api.Timeout;
import org.openqa.selenium.By;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


public class LoginPageContent {
	@Timeout(15)
    public static Question<String> headingText() {
        return Text.of(By.cssSelector("span.base"));
    }
}
