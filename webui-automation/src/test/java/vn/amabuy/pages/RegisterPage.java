package vn.amabuy.pages;

import net.serenitybdd.core.pages.PageObject;

public class RegisterPage extends PageObject {
	
	
	private static final String REGISTER_BUTTON = "//button[@class='btn btn-login']";
	private static final String ALERT_DANGER_TEXT = "//div[@class='alert alert-danger text-center']";
	private static final String CONFIRMPASSWORD_FIELD = "Nhập lại mật khẩu";
	private static final String PASSWORD_FIELD = "Mật khẩu";
	private static final String PHONENUMBER_FIELD = "Số điện thoại";
	private static final String EMAIL_FIELD = "Địa chỉ Email";
	private static final String FULLNAME_FIELD = "Họ và tên";

	public void enterTextIntoFullName(String name) {
		element(Target.of(FULLNAME_FIELD)).type(name);
	}

	public void enterTextIntoEmail(String email) {
		element(Target.of(EMAIL_FIELD)).type(email);
	}

	public void enterTextIntoPhone(String phoneNumber) {
		element(Target.of(PHONENUMBER_FIELD)).type(phoneNumber);
	}
	
	public void enterTextIntoPassword(String password) {
		element(Target.of(PASSWORD_FIELD)).type(password);
	}
	
	public void enterTextIntoConfirmPassword(String confirmPassword) {
		element(Target.of(CONFIRMPASSWORD_FIELD)).type(confirmPassword);
	}
	
	static class Target{
		private static final String TARGET = "//label[contains(text(),'%s')]/following-sibling::input";
		public static String of(String label) {
			return String.format(TARGET, label);
		}
		
	}
	
	public void click_on_register_button() {
		$(REGISTER_BUTTON).click();
	}

	public String getWarningErrMsg() {
		return element(ALERT_DANGER_TEXT).getText();
	}

}
