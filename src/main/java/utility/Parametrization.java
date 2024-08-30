package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrization {
	public static String getDataSheet(int row,int cell,String sheetname) throws EncryptedDocumentException, IOException {
	FileInputStream File=new FileInputStream("E:\\Automation Programs\\SwagLab\\src\\main\\resources\\TestData.xlsx");
    return WorkbookFactory.create(File).getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
}
}
