package vn.amabuy.steps.serenity;

import vn.amabuy.pages.HomePage;
import net.thucydides.core.annotations.Step;

public class HomeSteps {

    HomePage onHomePage;

   
    @Step
    public void open_home_page() {
    	onHomePage.open();
    }
    
    @Step
    public void click_on_login_link() {
    	onHomePage.clickOnLoginLink();
    }


}