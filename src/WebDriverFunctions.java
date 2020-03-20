import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverFunctions {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\18327\\Downloads\\chromedriver_win32_ version80\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.amazon.com");
        driver.get("http://www.facebook.com");

        driver.navigate().back();
        driver.navigate().forward();

        System.out.println("Current url :"+driver.getCurrentUrl());
    }

}
