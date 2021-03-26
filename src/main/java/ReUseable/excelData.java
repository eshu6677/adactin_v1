package ReUseable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelData {
	
	FileInputStream fis;
	
	public static String testData(String SheetName,int rowNumber,int cellNmuber) throws IOException {
	FileInputStream fis;

			fis = new FileInputStream("‪C:\\Users\\em21154\\Documents\\testdata.xlsx");
		
        Workbook w;
		
			w = WorkbookFactory.create(fis);
		
        String s = w.getSheet(SheetName).getRow(rowNumber).getCell(cellNmuber).getStringCellValue();
        return s;
        
	}

}
