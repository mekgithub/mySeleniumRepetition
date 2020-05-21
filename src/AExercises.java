import javafx.scene.Parent;
import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.*;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class AExercises {
   public static String url="http://www.amazon.com";

    public static void main(String[] args) throws InterruptedException, IOException {
   //  System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\18327\\\\Downloads\\\\chromedriver_win32_ version80\\\\chromedriver.exe");
     WebDriver driver=new ChromeDriver();
        //driver.get("https://accounts.google.com/signup");
     //   driver.get("https://jqueryui.com/droppable/");
        //driver.get("http://www.expedia.com");
        //driver.get("http://www.facebook.com");
        // driver.get("http://demo.guru99.com/test/drag_drop.html");
        //driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
        //File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        //FileUtils.copyFile(file,new File("C:\\Users\\18327\\Desktop\\myscreen1.bmp"));
      File file=new File("C:\\Users\\18327\\Desktop\\EXAM1.xls");
      FileInputStream fs=new FileInputStream(file);
      Workbook wb=new HSSFWorkbook(fs);
      Sheet sh=wb.getSheet("DataTest");
      int rowcount=sh.getLastRowNum();
      for(int i=1;i<rowcount; i++){
          Row rw=sh.getRow(i);
          Cell cell=rw.getCell(0);
          System.out.println(cell.getStringCellValue());
      }







    }
    //OUTPUT = Current url is: https://www.amazon.com/
}

/*
 System.setProperty("webdriver.chrome.driver","C:\\Users\\18327\\Downloads\\chromedriver_win32_ version80\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.amazon.com");
        String currenturl=driver.getCurrentUrl();
        System.out.println("Current url is: "+currenturl);
        ****************
          WebElement myElement= driver.findElement(By.id("email"));
       Actions myAction=new Actions(driver);

       myAction.moveToElement(myElement).build().perform();
       myAction.click().perform();
       myAction.keyDown(myElement, Keys.SHIFT).build().perform();
       myAction.sendKeys(myElement,"mehmet").build().perform();
       myAction.keyUp(myElement,Keys.SHIFT).build().perform();
 */