import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonWhooleFoodTestCase {
    public static void main(String[] args) throws InterruptedException {
        BrowserMain myBrowser=new BrowserMain();
        WebDriver driver=myBrowser.invokeChrome();
        driver.get("http://www.amazon.com");
        //Thread.sleep(2000);
      // driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(7)")).click();
        driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("shoes");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input.nav-input[type='submit']")).click();
        Thread.sleep(3000);

    }
}
