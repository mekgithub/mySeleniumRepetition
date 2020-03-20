import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebLocators {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        firefox();
        driver.get("http://www.expedia.com");
       Thread.sleep(2000);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("input[@id='flight-origin-hp-flight']")).clear();
        Thread.sleep(2000);
        driver.findElement(By.xpath("input[@id='flight-origin-hp-flight']")).sendKeys("H");
        Thread.sleep(2000);
        driver.findElement(By.xpath("input[@id='flight-origin-hp-flight']")).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        driver.findElement(By.xpath("input[@id='flight-origin-hp-flight']")).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        driver.findElement(By.xpath("input[@id='flight-origin-hp-flight']")).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        driver.findElement(By.xpath("input[@id='flight-origin-hp-flight']")).sendKeys(Keys.ENTER);

    }
    public static void firefox(){
        System.setProperty("webdriver.gecko.driver","C:\\Users\\18327\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
       driver=new FirefoxDriver();


    }
}
