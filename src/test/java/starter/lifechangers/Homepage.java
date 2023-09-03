package starter.lifechangers;


import java.util.HashMap;
import java.util.*;

import org.openqa.selenium.By;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://lifechangers.org/")

public class Homepage extends PageObject {
    public void verifyHOmepageNaviagtionLinks() {
    	HashMap<String,String> map=new HashMap<String,String>();  
    	map.put("#menu-top-menu > li.menu-home > a", null);
    	map.put("#menu-top-menu > li.menu-about-us > a", null);
    	map.put("#menu-top-menu > li.menu-resources > a", null);
    	map.put("#menu-top-menu > li.menu-fathers-house > a", null);
    	map.put("#menu-top-menu > li.menu-events > a", null);
    	map.put("#menu-top-menu > li.menu-news > a", null);
    	map.put("#menu-top-menu > li.menu-contact > a", null);

    	for(@SuppressWarnings("rawtypes") Map.Entry m : map.entrySet()){  
    		goToAPage(m.getKey().toString());
    		map.put((String) m.getKey(), getTitle());
    	    System.out.println(getTitle());    
    	}  
    }
    
    public void goToAPage(String identifier){
        $(By.cssSelector(identifier)).click();
    }
    
    public void isLogoExist(){
        shouldBeVisible(By.cssSelector("a.navbar-brand"));
    }
}