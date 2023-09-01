package starter.luma;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import org.junit.jupiter.api.Timeout;
import org.openqa.selenium.By;

public class HomepageContent {

	@Timeout(15)
    public static Question<String> bannerText() {
        return Text.of(By.cssSelector("div.message.global.demo"));
    }
	@Timeout(15)
    public static Question<String> getMessageAfterLogin() {
        return Text.of(By.cssSelector("span.logged-in"));
    }
	@Timeout(15)
	public static Question<String> getMessageBeforeLogin() {
        return Text.of(By.cssSelector("span.not-logged-in"));
    }

}
