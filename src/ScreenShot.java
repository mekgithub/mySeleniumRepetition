import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class ScreenShot {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\18327\\Downloads\\chromedriver_win32_ version80\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        HSSFWorkbook wb=new HSSFWorkbook();




    }
}
/*
System.setProperty("webdriver.chrome.driver","C:\\Users\\18327\\Downloads\\chromedriver_win32_ version80\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.amazon.com");
        /*File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File("C:\\Users\\18327\\Desktop\\myScreenShot2.bmp"));*/
//File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        //FileUtils.copyFile(file,new File("C:\\Users\\18327\\Desktop\\myScreenShot2.bmp"));*/
