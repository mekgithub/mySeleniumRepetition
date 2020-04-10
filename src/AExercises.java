import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class AExercises {
   public static String url="http://www.amazon.com";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\18327\\Downloads\\chromedriver_win32_ version80\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        //driver.get("http://www.expedia.com");
       //driver.get("http://www.facebook.com");
        driver.get("http://www.amazon.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        Actions myMouse=new Actions(driver);
        myMouse.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
        myMouse.moveToElement(driver.findElement(By.cssSelector("##twotabsearchtextbox"))).click().perform();
        myMouse.sendKeys("#twotabsearchtextbox").perform();
        myMouse.moveToElement(driver.findElement(By.cssSelector("input[type='submit']"))).click().perform();

    }
    //OUTPUT = Current url is: https://www.amazon.com/
}

/*
 System.setProperty("webdriver.chrome.driver","C:\\Users\\18327\\Downloads\\chromedriver_win32_ version80\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.amazon.com");
        String currenturl=driver.getCurrentUrl();
        System.out.println("Current url is: "+currenturl);
 */