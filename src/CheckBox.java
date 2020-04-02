import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBox {
    public static void main(String[] args) throws InterruptedException {
        BrowserMain myBrowser=new BrowserMain();
        WebDriver driver=myBrowser.invokeChrome();
        driver.get("http://www.expedia.com");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#partialHotelBooking-hp-package")).click();
        Thread.sleep(2000);
        System.out.println("It is "+driver.findElement(By.cssSelector("input#partialHotelBooking-hp-package")).isSelected());
        //Boolean sel= driver.findElement(By.cssSelector("input#partialHotelBooking-hp-package")).isSelected();//veya yukaridkai sekilde
        //System.out.println(sel);//yapilabilirdi
        Thread.sleep(2000);

    }
}
