import java.net.MalformedURLException;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;

public class runTest {
    public static AppiumDriver<MobileElement> driver;

    public static void main(String[] args) {
        // Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("deviceName", "My Phone");
        caps.setCapability("udid", "99081FFBA000QB");  // ID of the desired device
        caps.setCapability("platformName", "Android"); // Platform type
        caps.setCapability("platformVersion", "11.0"); // Platform OS Version

        caps.setCapability("appPackage", "com.bom.mappo"); // Main package of the application
        caps.setCapability("appActivity", "com.bom.mappo.MainActivity");  // The starting activity of the app
        caps.setCapability("noReset", "true");


        try {
             driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),
                    caps);

             Thread.sleep(5000);

            MobileElement accountButton = Actions.findElementByXPath(Selectors.AccountButton);
            accountButton.click();

            MobileElement loginButton =  Actions.findElementByXPath(Selectors.LoginButton);
            loginButton.click();

            Thread.sleep(2000);

            MobileElement AlreadyHaveAnAccountLink =  Actions.findElementByXPath(Selectors.AlreadyHaveAnAccountLink);
            AlreadyHaveAnAccountLink.click();

            Thread.sleep(2000);

            MobileElement emailField =  Actions.findElementByXPath(Selectors.emailField);
            emailField.sendKeys("tabualrob@itgsoftware.com");

            MobileElement passwordField =  Actions.findElementByXPath(Selectors.passwordField);
            passwordField.sendKeys("tariq2015tariq");

            MobileElement signInButton =  Actions.findElementByXPath(Selectors.signInButton);
            signInButton.click();



        } catch (MalformedURLException | InterruptedException e) {
            System.out.println(e.getMessage());
        }


    }

}
