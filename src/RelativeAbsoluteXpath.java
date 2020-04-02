import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RelativeAbsoluteXpath {
    public static void main(String[] args) throws InterruptedException {
        BrowserMain myBrowser=new BrowserMain();
        WebDriver driver=myBrowser.invokeChrome();
        driver.get("http://www.expedia.com");
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("//*[@id='flight-departing-wrapper-hp-flight']/label/child::input")).sendKeys("11/11/2020");
        Thread.sleep(5000);
       // driver.findElement(By.cssSelector("#flight-origin-hp-flight")).clear();
     //  Thread.sleep(5000);
      // driver.findElement(By.cssSelector("#flight-origin-hp-flight")).sendKeys("Atlanta");
    }
}
