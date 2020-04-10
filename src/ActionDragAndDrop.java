import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionDragAndDrop {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\18327\\Downloads\\chromedriver_win32_ version80\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/drag_drop.html");
        WebDriverWait wait=new WebDriverWait(driver,20);
        driver.manage().window().maximize();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()=' BANK ']")));
        WebElement from=driver.findElement(By.xpath("//a[text()=' BANK ']"));
        WebElement target=driver.findElement(By.xpath("//ol[@id='bank']/li"));
        Actions myAction=new Actions(driver);
        myAction.dragAndDrop(from,target).build().perform();

        WebElement source2=driver.findElement(By.xpath("//div[@id='products']/div/ul/li[4]/a"));
        WebElement target2=driver.findElement(By.xpath("//ol[@id='amt7']/li"));


         WebElement source3=driver.findElement(By.xpath("//a[text()=' SALES ']"));
         WebElement target3=driver.findElement(By.xpath("//ol[@id='loan']/li"));
         myAction.dragAndDrop(source3,target3).build().perform();
    }
}
