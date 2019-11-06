package vn.amabuy.capabilities.chrome;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import net.serenitybdd.core.webdriver.enhancers.BeforeAWebdriverScenario;
import net.thucydides.core.model.TestOutcome;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.webdriver.SupportedWebDriver;

public class MyCapabilityEnhancer implements BeforeAWebdriverScenario {

	@Override
    public DesiredCapabilities apply(EnvironmentVariables environmentVariables,
                                     SupportedWebDriver driver,
                                     TestOutcome testOutcome,
                                     DesiredCapabilities capabilities) {
        //capabilities.setCapability("name", testOutcome.getStoryTitle() + " - " + testOutcome.getTitle());
    	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--incognito");
		options.addArguments("--disable-infobars");
		
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		return capabilities;
    }	
}