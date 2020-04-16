import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelRead {//using apache poi libraries

    public static void main(String[] args) throws IOException {
        File file=new File("C:\\Users\\18327\\Desktop\\EXAM1.xls");
        FileInputStream fs=new FileInputStream(file);
        Workbook wb=new HSSFWorkbook(fs);
        Sheet sh=wb.getSheet("Test1");//bundan sonra istersek en asagidaki kodu da kullanbiliriz,ancak o zaman sadece 1 cell i bulabilir.
        int rowcount=sh.getLastRowNum();
        Row rw;
        Cell cell;

        for(int i=0;i<rowcount;i++){
            rw=sh.getRow(i);
            cell=rw.getCell(0);
            System.out.println(cell.getStringCellValue());

        }



    }
}
/*
        Row rw=sh.getRow(1);
        Cell cell1=rw.getCell(0);
        System.out.println(cell1.getStringCellValue());
 */