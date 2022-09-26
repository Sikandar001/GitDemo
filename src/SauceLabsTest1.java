
import java.net.MalformedURLException;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

//import org.openqa.selenium.remote.DesiredCapabilities;

import org.openqa.selenium.remote.RemoteWebDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;


public class SauceLabsTest1 {

	public static void main(String[] args) throws MalformedURLException {
			ChromeOptions browserOptions = new ChromeOptions();
			//browserOptions.set
		browserOptions.setPlatformName("Windows 7");
		browserOptions.setBrowserVersion("84");
		Map<String, Object> sauceOptions = new HashMap<>();
		sauceOptions.put("build", "sikku*1");
		sauceOptions.put("name", "oauth-sksingh-39e29");
		browserOptions.setCapability("sauce:options", sauceOptions);

		URL url = new URL("https://oauth-sksingh-39e29:caa0ec9f-8bf0-401e-93cc-1c842d170b7b@ondemand.eu-central-1.saucelabs.com:443/wd/hub");
		RemoteWebDriver driver = new RemoteWebDriver(url, browserOptions);
		
		
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\sksingh\\Documents\\geckodriver.exe");
		//WebDriver driver=new RemoteWebDriver(new URL(),cap);
		driver.manage().window().maximize();
		driver.get("https://www.etsy.com");
		System.out.println(driver.getTitle());
		
	}

}
