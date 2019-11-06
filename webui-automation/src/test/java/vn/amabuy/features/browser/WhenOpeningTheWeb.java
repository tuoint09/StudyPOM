package vn.amabuy.features.browser;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.util.EnvironmentVariables;

import org.assertj.core.api.SoftAssertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import vn.amabuy.features.properties.MyProperties;
import vn.amabuy.steps.serenity.HomeSteps;

@RunWith(SerenityRunner.class)
public class WhenOpeningTheWeb {
	/*
	
	private EnvironmentVariables  environments;
	private String myProperties;
	
	@Before
	public void get_properties_from_serenity_config_test() {
		
		myProperties = environments.optionalProperty(MyProperties.NAME).orElse("xinh");
		}
	
	@Test
	
	public void soft_assertion_assertj_test() {
		SoftAssertions soft = new SoftAssertions();
		soft.assertThat("Tuoi").isEqualTo(myProperties);
		soft.assertThat("xinh").isEqualTo(myProperties);
		soft.assertThat("James Nguyen").isEqualTo(myProperties);
		soft.assertThat("Nguyen").isEqualTo(myProperties);
		soft.assertAll();
	}
	*/

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Steps
	public HomeSteps anna;

	@Test
	public void open_homepage() {
		anna.open_home_page();

	}


}