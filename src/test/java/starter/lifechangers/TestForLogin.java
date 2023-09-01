package starter.luma;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.chrome.ChromeOptions;

import net.serenitybdd.screenplay.annotations.CastMember;

@ExtendWith(SerenityJUnit5Extension.class)
class TestForLogin {

    @CastMember(name = "Tejas")
    Actor tejas;
    
	@Before
    public void setUp() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized"); // Add other arguments as needed
        
    }
	
    @Test
    void performLogin() {
    	tejas.attemptsTo(
			Navigate.toTheLoginPage(),
			Login.sendCredentials("tejas.lotlikar@abcxyz.com", "Password@123"),
			Ensure.that(HomepageContent.getMessageAfterLogin()).isEqualTo("Welcome, tejas lotlikar!"),
            Ensure.that(HomepageContent.bannerText()).isEqualTo("This is a demo store. No orders will be fulfilled.")
    	);

    }
}