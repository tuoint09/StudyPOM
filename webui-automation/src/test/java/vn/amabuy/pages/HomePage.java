package vn.amabuy.pages;

import net.thucydides.core.pages.PageObject;


public class HomePage extends PageObject {

	public void clickOnLoginLink() {
		element("//a[@href='/login']").click();
	}

}
