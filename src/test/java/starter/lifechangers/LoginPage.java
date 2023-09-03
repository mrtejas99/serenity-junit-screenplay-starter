package starter.lifechangers;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://lifechangers.org/")
public class LoginPage extends PageObject{
    public String getHomepageTitle() {
    	return getTitle();
    }

    public void doLogin(){
        $("#username").sendKeys("tejas.lotlikar@xyzabc.com");
        $("#password").sendKeys("1234578");
        $("p:nth-child(3) > input.btn.btn-primary").click();
    }
    
    public String accountPageIsVisible(){
        return $("body > div > section.section.section-home-latest.woocommerce > div > div > h5").getText();
    }
}
