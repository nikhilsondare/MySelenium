package excelSheet;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WorkBookEg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File myFile=new File("C:\\Users\\pooja\\Desktop\\Nikhil\\Sheet 1.xlsx");
		
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
		
		Row myRow = mySheet.getRow(1);
		
		Cell myCell = myRow.getCell(1);
		
		CellType cellType = myCell.getCellType();
		
		System.out.println(cellType);
		
		System.out.println(myCell.getBooleanCellValue());
		
		

	}

}
