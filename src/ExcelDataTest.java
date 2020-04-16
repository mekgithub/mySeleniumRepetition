import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.*;

public class ExcelDataTest {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\18327\\Downloads\\chromedriver_win32_ version80\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.facebook.com");

        File file=new File("C:\\Users\\18327\\Desktop\\EXAM1.xls");
        FileInputStream fs=new FileInputStream(file);
        Workbook wb=new HSSFWorkbook(fs);
        Sheet sh=wb.getSheet("DataTest");
        int totalRows=sh.getLastRowNum();

        for(int i=1;i<totalRows;i++){

            Row  rw=sh.getRow(i);
            Cell username=rw.getCell(0);
            Cell pasword=rw.getCell(1);

            driver.findElement(By.id("email")).sendKeys(username.getStringCellValue());
            Thread.sleep(1000);
            driver.findElement(By.id("pass")).sendKeys(pasword.getStringCellValue());
            Thread.sleep(1000);

            Cell passed=rw.getCell(2);
            passed.setCellValue("Succes Login");
            fs.close();

            FileOutputStream fos=new FileOutputStream(file);
            wb.write(fos);
            fos.close();
        }
    }
}
