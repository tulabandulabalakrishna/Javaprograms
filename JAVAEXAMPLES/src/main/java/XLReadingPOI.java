import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLReadingPOI {

    public static void main(String args[]) throws IOException {
       String strFile = "C:/Users/NUC/Desktop/Selenium_XL.xlsx";

        FileInputStream excelFile = new FileInputStream(new File(strFile));

        Workbook workBook = new XSSFWorkbook(excelFile);

        Sheet s = workBook.getSheetAt(1);

        Iterator<Row> rowIterator = s.rowIterator();
        while((rowIterator.hasNext()))
        {
            Row row = rowIterator.next();
            Iterator<Cell> cellIterator = row.cellIterator();
            while(cellIterator.hasNext())
            {
                Cell c = cellIterator.next();
                //if(c.getCellStyle() != "")
                System.out.println(c.getStringCellValue() + " ");
            }
        }
    }
}
