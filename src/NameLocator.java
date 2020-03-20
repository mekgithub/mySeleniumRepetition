import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {
    static WebDriver driver;
    public static void main(String[] args) {
        invokeChromeBrowser();
        driver.get("http://www.facebook.com");
        driver.findElement(By.name("firstname")).sendKeys("Mehmet");
        driver.findElement(By.name("lastname")).sendKeys("Kortak");
    }
    public static void invokeChromeBrowser(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\18327\\Downloads\\chromedriver_win32_ version80\\chromedriver.exe");
        driver=new ChromeDriver();

    }



}
