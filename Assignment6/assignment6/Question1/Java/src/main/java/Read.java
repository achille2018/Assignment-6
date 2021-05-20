import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.IOException;

public class Read {
    public static void main(String[] args) {

        try{
            Workbook workbook = WorkbookFactory.create(new File("Readme.xlsx"));
            Sheet mysheet = workbook.getSheetAt(0);
            int first_row = mysheet.getFirstRowNum();
            int last_row = mysheet.getLastRowNum();
            for (int i = first_row; i < last_row; i++){
                Row myrow = mysheet.getRow(i);
                for (int j = myrow.getFirstCellNum(); j < myrow.getLastCellNum(); j++){
                    Cell mycell = myrow.getCell(j);
                    System.out.println(mycell.getStringCellValue());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
