


import java.text.ParseException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RowsAndColumsInWebPage {

        public static void main(String[] args) throws ParseException {
            WebDriver wd;
            System.setProperty("webdriver.chrome.driver","D:\\Project-selenium\\src\\main\\resources\\BrowserDependencies\\chromedriver.exe");
            wd= new ChromeDriver();
            wd.get("http://demo.guru99.com/test/web-table-element.php");
            //No.of Columns
            List  col = wd.findElements(By.xpath(".//*[@id='leftcontainer']/table/thead/tr/th"));
            System.out.println("No of cols are : " +col.size());
            //No.of rows
            List  rows = wd.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr"));
            System.out.println("No of rows are : " + rows.size());
            for(int i =0; i< rows.size();i++)
            {
                List  cols = wd.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr["+i+"]/td"));
                for( int j =  1 ; j<cols.size(); j++)
                {
                    WebElement cellvalue = wd.findElement(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr["+i+"]/td["+j+"]"));
                    System.out.println("Row "+i+ "cell value"+cellvalue.getText());
                }
            }

            wd.close();
        }
    }

