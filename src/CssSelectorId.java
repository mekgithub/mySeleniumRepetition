import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class CssSelectorId {
    public static void main(String[] args) throws InterruptedException {
        BrowserMain myBrowser=new BrowserMain();
        WebDriver driver=myBrowser.invokeChrome();
        driver.get("https://www.expedia.com");
        driver.findElement(By.cssSelector("input#flight-origin-hp-flight")).clear();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input#flight-origin-hp-flight")).sendKeys("Atl");//it is not mandatory too use input
        Thread.sleep(1000);
        System.out.println("atlanata");
        for( int i=0;i<4;i++){
            driver.findElement(By.cssSelector("#flight-origin-hp-flight")).sendKeys(Keys.ARROW_DOWN);//atlanatada 3 havalani var,
            // 3.cusunu DeKalb i sececgimiz icin 4 kez mouse down yapmali.
        }


    }
}
