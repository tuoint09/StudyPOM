package vn.amabuy.pages;

import net.thucydides.core.pages.PageObject;

public class LoginPage extends PageObject {

	public void clickOnRegisterLink() {
		element("//a[@href='/register']").click();
	}

}
