package ShareData.browser;

import ShareData.browser.service.ChromBrowserService;
import ShareData.browser.service.EdgeBrowserService;
import configFile.ConfigFile;
import configFile.configNode.ConfigurationNode;
import org.openqa.selenium.WebDriver;

import java.util.Locale;

public class BrowserFactory {
    public WebDriver getBrowserFactory() {
        String ciCd = System.getProperty("ciCd");
        String browser = System.getProperty("browser").toLowerCase(Locale.ROOT);
        System.out.println("Uitat-te aici " + browser);
        ConfigurationNode configurationNode = ConfigFile.createConfingNode(ConfigurationNode.class);
        if (Boolean.parseBoolean(ciCd)) {
            configurationNode.driverConfigNode.headLess = "--headless";
        } else {
            browser = configurationNode.driverConfigNode.localBrowser;
        }
        switch (browser) {
            case BrowserType.BROWSER_CHROME:
                ChromBrowserService chromeService = new ChromBrowserService();
                chromeService.openBrowser(configurationNode.driverConfigNode);
                return chromeService.getDriver();
            case BrowserType.BROWSER_EDGE:
                EdgeBrowserService edgeService = new EdgeBrowserService();
                edgeService.openBrowser(configurationNode.driverConfigNode);
                return edgeService.getDriver();
        }
        return null;
    }
}
