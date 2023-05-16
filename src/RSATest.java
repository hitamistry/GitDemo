import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class RSATest {

	
	@Test
	public void HomePageCheck() throws MalformedURLException {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setBrowserName("firefox");
//		caps.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		caps.setCapability(CapabilityType.BROWSER_NAME, "firefox");
//		caps.setAcceptInsecureCerts(true);
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.43.116:4444"), caps);
		driver.get("http://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("rahul shetty");
		driver.close();
		System.out.println("new code");
		System.out.println("second code");
		System.out.println("third code");
		System.out.println("Merge code 2");
	}
	
	
}
