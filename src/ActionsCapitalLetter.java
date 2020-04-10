import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class ActionsCapitalLetter {
    public static void main(String[]args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\18327\\Downloads\\chromedriver_win32_ version80\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.facebook.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.manage().window().maximize();
        Actions myActions=new Actions(driver);
      /*  myActions.moveToElement(driver.findElement(By.id("email"))).build().perform();
        myActions.keyDown(driver.findElement(By.id("email")), Keys.SHIFT).build().perform();
        myActions.sendKeys("mehmet").build().perform();*/

      //or we can use that code below
        WebElement myWebEelement=driver.findElement(By.id("email"));
        myActions.moveToElement(myWebEelement).click().keyDown(myWebEelement,Keys.SHIFT).sendKeys("mehmet").build().perform();



    }
}
