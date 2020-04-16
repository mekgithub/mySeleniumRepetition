import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

import java.io.*;

public class ExcelWrite {
    public static void main(String[] args) throws IOException {

        File file=new File("C:\\Users\\18327\\Desktop\\EXAM1.xls");
        FileInputStream fs=new FileInputStream(file);
        Workbook wb=new HSSFWorkbook(fs);
        Sheet sh=wb.getSheet("Write");
        Row rw=sh.getRow(0);
        Cell cell=rw.createCell(2, CellType.STRING);
        cell.setCellValue("updated");
        fs.close();
        FileOutputStream fos=new FileOutputStream(file);
        wb.write(fos);
        fos.close();
       // System.out.println(cell.);
    }
}
