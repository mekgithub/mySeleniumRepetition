import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {//selenium day 14
    public static void main(String[] args) {
        BrowserMain myBrowser=new BrowserMain();
        WebDriver driver=myBrowser.invokeChrome();
        driver.get("http://www.expedia.com");
        //set the timeout for axpilict wait,expedia .com,clicking the flights button
        WebDriverWait wait=new WebDriverWait(driver,20);

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("#tab-flight-tab-hp"))));
        driver.findElement(By.id("tab-flight-tab-hp")).click();

        //click hotel button
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("tab-hotel-tab-hp")));//day 14,01:21:00
        driver.findElement(By.id("#tab-hotel-tab-hp")).click();

        //click bundle and save
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("tab-package-tab-hp")))).click();
        driver.findElement(By.id("tab-package-tab-hp")).click();
        //yukaridi bundle save tiklayinca going to part kayboldugu icin,
        // yani hotel inputu kyaboldugu icin asagidaki kodda invisibility of kullanildi.
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.id("hotel-destination-hp-hotel"))));
        driver.findElement(By.id("hotel-destination-hp-hotel")).click();
        System.out.println("The input of hotel is invisible");


    }
}
