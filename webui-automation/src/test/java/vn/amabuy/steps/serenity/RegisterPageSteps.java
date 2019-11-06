package vn.amabuy.steps.serenity;

import net.thucydides.core.annotations.Step;
import vn.amabuy.models.Account;
import vn.amabuy.pages.RegisterPage;
//import static org.junit.Assert.assertEquals;
//import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.Matchers.equalTo;
//import static org.hamcrest.core.Is.is;
//import static org.assertj.core.api.Assertions.assertThat;
import static com.google.common.truth.Truth.*;

public class RegisterPageSteps {
	
	RegisterPage onRegisterPage;
	
	@Step
	public void register_new_account(Account account) {
		enter_full_name(account.getFullName());
		enter_email(account.getEmail());
		enter_phone_number(account.getPhone());
		enter_password(account.getPwd());
		enter_confirm_password(account.getCfPwd());		
	}
	
	@Step
	public void enter_confirm_password(String cfpwd) {
		onRegisterPage.enterTextIntoConfirmPassword(cfpwd);
	}

	@Step
	public void enter_password(String pwd) {
		onRegisterPage.enterTextIntoPassword(pwd);
	}

	@Step
	public void enter_phone_number(String phone) {
		onRegisterPage.enterTextIntoPhone(phone);
	}

	@Step
	public void enter_email(String email) {
		onRegisterPage.enterTextIntoEmail(email);
	}

	@Step
	public void enter_full_name(String fullName) {
		onRegisterPage.enterTextIntoFullName(fullName);
	}
	
	@Step
	public void click_on_register_button() {
		onRegisterPage.click_on_register_button();
	}
	
	@Step
	public void should_see_warning_message_corect(String expectErrMsg) {
		
		String actualErrMsg = onRegisterPage.getWarningErrMsg();
		
		// junit
		//assertEquals(expectErrMsg, actualErrMsg);
		
		//Hamcrest
		//assertThat(expectErrMsg, is(equalTo(actualErrMsg)));
		
		//Assertj OR truth
		assertThat(expectErrMsg).isEqualTo(actualErrMsg);
		
		
		
	}

}
