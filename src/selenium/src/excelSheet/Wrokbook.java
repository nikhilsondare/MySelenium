package excelSheet;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Wrokbook {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myFile=new File("C:\\Users\\pooja\\Desktop\\Nikhil\\Sheet 1.xlsx");
		
		//For String values
		String value = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
        System.out.println(value);
        
        //for numeric cell values
        double value1 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(2).getCell(2).getNumericCellValue();
        System.out.println(value1);
       
        //for boolean value
        boolean value2 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(1).getCell(1).getBooleanCellValue();
        System.out.println(value2);
        
	}

}
