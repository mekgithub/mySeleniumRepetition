import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertJavascript {
    public static void main(String[] args) throws InterruptedException {
        BrowserMain myBrowser=new BrowserMain();
        WebDriver driver=myBrowser.invokeChrome();
        driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[type='button']")).click();
        Thread.sleep(2000);
       /* System.out.println(driver.switchTo().alert().getText());
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        Thread.sleep(2000);*/
        String expectedValue="Are you sure you want to give us the deed to your house?";//yukarridakini veya asagidaki kodu kullanabiliriz
        Thread.sleep(2000);
        if(expectedValue.contains(driver.switchTo().alert().getText())){
            driver.switchTo().alert().accept();
        }


    }
}
