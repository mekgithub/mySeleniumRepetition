import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSLCertificateClass {
    public static void main(String[] args) {

        DesiredCapabilities dc=new DesiredCapabilities();
        dc.acceptInsecureCerts();
        dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
        ChromeOptions co=new ChromeOptions();
        co.merge(dc);
        System.setProperty("webdriver.chrome.driver","C:\\Users\\18327\\Downloads\\chromedriver_win32_ version80\\chromedriver.exe");
        WebDriver driver=new ChromeDriver(co);
        driver.get("http://www.amazon.com");


    }
}
