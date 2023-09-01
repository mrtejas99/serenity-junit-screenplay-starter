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
class TestForFixedObjects {

    @CastMember(name = "Tejas")
    Actor tejas;

	@Before
    public void setUp() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized"); // Add other arguments as needed
        
    }
	
    @Test
    void visitHomePage() {
        tejas.attemptsTo(
            Navigate.toTheHomePage(),
            Ensure.that(HomepageContent.getMessageBeforeLogin()).isEqualTo("Default welcome msg!"),
            Ensure.that(HomepageContent.bannerText()).isEqualTo("This is a demo store. No orders will be fulfilled.")
        );
    }
}