import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
// 2
public class Browsers {
    public static void main(String [] args){
        int i=1;
        while (i<4) {

            Chrome();
            i++;
        }
        //Firefox();
    }
    //this method will invoke the chrome browser
    public static void Chrome(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\18327\\Downloads\\chromedriver_win32_ version80\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.skyscanner.com");
    }
    //this method invokes the firefoxdriver
    public static void Firefox(){
        System.setProperty("webdriver.gecko.driver","C:\\Users\\18327\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("http://www.amazon.com");
    }
}
