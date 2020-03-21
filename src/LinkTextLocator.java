import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextLocator {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        String expectedValue="NASIL ÇALIŞIR?";
        invokeChromeBrowser();
        driver.get("http://www.flypgs.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id='sf-recase-query']/h2")).click();
        Thread.sleep(2000);
        System.out.println(isTextTrue(expectedValue));

    }
    public static void invokeChromeBrowser(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\18327\\Downloads\\chromedriver_win32_ version80\\chromedriver.exe");
        driver=new ChromeDriver();

    }
   public static boolean isTextTrue(String expectedValue){
        String resultValue=driver.findElement(By.linkText("//*[@id='sf-recase-query']/h2")).getText();
      return resultValue.equals(expectedValue);
    }
}
