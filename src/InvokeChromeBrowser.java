import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
// 1
public class InvokeChromeBrowser {
    public static void main (String args[]){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\18327\\Downloads\\chromedriver_win32_ version80\\chromedriver.exe");//
        // ;So we are telling our computer ;the chrome deriver that you are
        // looking for is located here. (key,path)= setProperty helps the code,to find the key and the value in java ,our key is chrome driver key
        WebDriver driver=new ChromeDriver();//Chromwdriver is a constractor. I have chrome driver but computer must know where the driver is ?
        //
        driver.get("http://www.amazon.com");

    }



}
//TO DO THAT, WE NEED TO :
//1-We need to Seleium Library..
//

