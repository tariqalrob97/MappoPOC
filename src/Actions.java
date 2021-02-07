import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Actions extends runTest{

    public static AndroidDriver driver = (AndroidDriver) runTest.driver;
    
    public static MobileElement findElementByXPath (String Selector){
        try {
            MobileElement element = (MobileElement) driver.findElementByXPath(Selector);
            return element;
        }
        catch (Exception e){
            throw e;
        }
    }
}
