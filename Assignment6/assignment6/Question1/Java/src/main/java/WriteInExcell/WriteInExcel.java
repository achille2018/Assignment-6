package WriteInExcell;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteInExcel {
    public void WriteInExcelMethod() throws IOException {
        Workbook xlsxWorkbook = new HSSFWorkbook();
        Sheet mysheet = xlsxWorkbook.createSheet("Sheet");

        //create a new row
        Row row_1 = mysheet.createRow(0);

        //give rows a title
        row_1.createCell(0).setCellValue("Name");
        row_1.createCell(1).setCellValue("Genre");
        row_1.createCell(2).setCellValue("Country");

        // Create cell in row 2
        Row row_2 = mysheet.createRow(1);
        row_2.createCell(0).setCellValue("Achille");
        row_2.createCell(1).setCellValue("Male");
        row_2.createCell(2).setCellValue("Cameroon");


        // Save workbook
        xlsxWorkbook.write(new FileOutputStream("EmployeeId.xlsx"));
        System.out.println("created Sheet!");
    }
}
