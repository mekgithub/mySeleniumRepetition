import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CssExercise {
    public static void main(String[] args) throws InterruptedException {
        BrowserMain myBrowser=new BrowserMain();
        WebDriver driver=myBrowser.invokeChrome();
        driver.get("http://www.facebook.com");
        driver.findElement(By.cssSelector("input#email")).sendKeys("MEK");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input#pass")).sendKeys("qaz");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input#u_0_b")).click();//we used id value for css(means #)
        Thread.sleep(3000);
    }
}






