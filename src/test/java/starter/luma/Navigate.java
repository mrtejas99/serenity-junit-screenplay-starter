package starter.luma;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Open;

public class Navigate {
    public static Performable toTheHomePage() {
        return Open.url("https://magento.softwaretestingboard.com/");
    }
    public static Performable toTheLoginPage() {
        return Open.url("https://magento.softwaretestingboard.com/customer/account/login/");
    }
}
