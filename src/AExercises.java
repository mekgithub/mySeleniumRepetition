import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AExercises {
   public static String url="http://www.amazon.com";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\18327\\Downloads\\chromedriver_win32_ version80\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.amazon.com");
       // driver.get("http://www.facebook.com");
     //   driver.navigate().back();
        Thread.sleep(5000);
        System.out.println("1");
        driver.manage().window().maximize();
        //driver.findElement(By.xpath("//div[@id='nav-xshop']/a[6]")).click();
        driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(6)")).click();//for css same part
        Thread.sleep(5000);
        System.out.println("2");
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("flour");
        System.out.println("3");
        //Thread.sleep(5000);
        driver.findElement(By.cssSelector("input.nav-input")).click();
        Thread.sleep(2000);
        //driver.close();

    }
    //OUTPUT = Current url is: https://www.amazon.com/
}

/*
 System.setProperty("webdriver.chrome.driver","C:\\Users\\18327\\Downloads\\chromedriver_win32_ version80\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.amazon.com");
        String currenturl=driver.getCurrentUrl();
        System.out.println("Current url is: "+currenturl);
 */