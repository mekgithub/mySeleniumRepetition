import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DatePicker {
    public static void main(String[] args) throws InterruptedException {
        BrowserMain myBrowser=new BrowserMain();
        WebDriver driver=myBrowser.invokeChrome();
        driver.get("http://www.expedia.com");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input#package-departing-hp-package")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("button[data-year='2020'][data-month='4'][data-day='20']")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("button.datepicker-cal-date.end")).click();//burada class i kullandik. class daki bosluklarin yerine nokta koyduk.
        Thread.sleep(3000);
    }
}
