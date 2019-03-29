import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Readfromexcel {
    public static void main(String args[])
    {
        String filePath = "D:\\WebPackExampleProject\\JAVAEXAMPLES\\src\\main\\resources\\readfromexcel.xlsx";
        File f = new File(filePath);
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Workbook w = new XSSFWorkbook(inputStream);
            Sheet s = w.getSheet("ROLES");
            int intRowCount = s.getLastRowNum() - s.getFirstRowNum();
            System.out.println("Total rows in excel" + intRowCount);

            for (int i =0; i<=intRowCount; i++)
            {
                Row row = s.getRow(i);
                for(int j = 0; j< row.getLastCellNum(); j++)
                {
                    System.out.println(row.getCell(j).getStringCellValue());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
