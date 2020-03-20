import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//3
public class AllBrowserClass {
    public void chrome(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\18327\\Downloads\\chromedriver_win32_ version80\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.skyscanner.com");
    }
    //this method invokes the firefoxdriver
    public  void firefox(){
        System.setProperty("webdriver.gecko.driver","C:\\Users\\18327\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("http://www.amazon.com");
    }
}
