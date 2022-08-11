import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelTest {
    @Test
    public void excelTest() throws IOException {

        FileInputStream fileInputStream=new FileInputStream("D:\test.xlsx");

        Workbook workbook= new HSSFWorkbook(fileInputStream);
        Sheet sheet= workbook.getSheetAt(0);
        int lastRow= sheet.getLastRowNum();


    }
}
