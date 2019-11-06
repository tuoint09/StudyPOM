package vn.amabuy.features.register;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import vn.amabuy.models.Account;
import vn.amabuy.steps.serenity.HomeSteps;
import vn.amabuy.steps.serenity.LoginSteps;
import vn.amabuy.steps.serenity.RegisterPageSteps;


@RunWith(SerenityRunner.class)
public class WhenRegisterNewAccount {
		
	@Managed
	WebDriver webdriver;
	
    @Steps
    public HomeSteps homeSteps;
    
    @Steps
    public LoginSteps loginSteps;
    
    @Steps
    public RegisterPageSteps registerSteps;
    
	String errorMessage = "Mật khẩu xác nhận không 1 chính xác";
	Account infor = new Account("Tuoi xenh", "Jamesnguyen0102@gmail.com", "0936175530", "xinhgai", "xinhxinhgai");

    @Test
    public void register_a_new_account() {
    	
   	
    	homeSteps.open_home_page();
    	homeSteps.click_on_login_link();
    	
    	loginSteps.click_on_register_link();
    	
    	registerSteps.register_new_account(infor);
    	registerSteps.click_on_register_button();
    	registerSteps.should_see_warning_message_corect(errorMessage);

    }
    
}
