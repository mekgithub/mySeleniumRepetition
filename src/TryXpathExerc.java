import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TryXpathExerc {

    public static void main(String[] args) throws InterruptedException {
        BrowserMain myBrowser=new BrowserMain();
        WebDriver driver=myBrowser.invokeChrome();
        driver.get("http://www.facebook.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[contains(@type,'ema')]")).sendKeys("Mehmet");//this xpath is for using contains method
        // : //tagname[contains(@attr,'particulaText')]
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("qaz");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Forgot account?']")).click();//this method for using text()..
       // driver.findElement(By.xpath("//input[@id='u_0_b']")).click();
        String currentPage=driver.getCurrentUrl();
        System.out.println("The current page is :"+currentPage);

    }
}
