import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectCombo {
    public static void main(String[] args) throws InterruptedException {
        BrowserMain myBrowser=new BrowserMain();
        WebDriver driver=myBrowser.invokeChrome();
        driver.get("http://www.expedia.com");
        driver.manage().window().maximize();
        Thread.sleep(1000);
    /*    driver.findElement(By.id("package-advanced-preferred-class-hp-package")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("option[value='b']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("option[value='b']")).sendKeys(Keys.ENTER);*/ //yukaridaki tum kodalri asafgdaki sadece "select" metodu ile de yapabiliyoruz
        Select s=new Select(driver.findElement(By.cssSelector("#package-advanced-preferred-class-hp-package")));
        Thread.sleep(1000);
        s.selectByValue("b");
        Thread.sleep(1000);
        s.selectByIndex(0);
        Thread.sleep(1000);
        s.selectByVisibleText("First class");
        Thread.sleep(1000);
      //  s.deselectAll();
    }
}
