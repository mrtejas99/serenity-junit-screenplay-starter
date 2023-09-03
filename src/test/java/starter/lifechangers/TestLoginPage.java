package starter.lifechangers;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.annotations.CastMember;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class TestLoginPage extends BaseTest{
	@CastMember(name = "Tejas")
    Actor tejas;
    @Steps
    LoginPageSteps loginPageSteps;

    @Title("Login test with correct data")
    @Test
    public void appLoginTest(){
    	loginPageSteps.isOnLoginPage(tejas);
//    	tejas.attemptsTo(
//        loginPageSteps.loginAsUser(),
//        loginPageSteps.userShouldBeLogin()
//        );
    }

}
