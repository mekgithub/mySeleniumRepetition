import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLOcator {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        invokeChromeBrowser();
        driver.get("http://www.turkishairlines.com");
        Thread.sleep(3000);
        driver.findElement(By.className("thyHeaderLink")).click();

    }
    public static void invokeChromeBrowser(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\18327\\Downloads\\chromedriver_win32_ version80\\chromedriver.exe");
        driver=new ChromeDriver();

    }
}
