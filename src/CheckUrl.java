import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//5
public  class CheckUrl {
   public static String url="http://www.amazon.com";
    public static WebDriver driver;

    public static void main(String[] args) {
        chrome(url);
        //boolean result=urlValidation(url);
        System.out.print("Validation is :"+urlValidation(url));
    }
    public static void  chrome(String url){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\18327\\Downloads\\chromedriver_win32_ version80\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get(url);
    }
    public static boolean urlValidation(String url){     //for validation we createdt a method as a boolean. because we need is it true or false ?
        System.out.println("Current url :"+driver.getCurrentUrl());
        System.out.println("Requested url :"+url);

        if(url.equals(driver.getCurrentUrl())){
            return true;
        }else {
            return false;
        }

    }

}
