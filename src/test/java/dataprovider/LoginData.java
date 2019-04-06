package dataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class LoginData {

	
	@DataProvider (name="Logindata")
	public Object[][] data() throws IOException{
		
		
		File src= new File("./TestData/credentials.xlsx");
		FileInputStream fis= new FileInputStream(src);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Credentials");
	
		int Row= sheet.getPhysicalNumberOfRows();
		int Col= sheet.getRow(0).getPhysicalNumberOfCells();
		
		Object[][] obj= new Object[Row][Col];
		for(int i=0; i<Row;i++)
		{
			for(int j=0;j<Col;j++)
			{
			obj[i][j]=sheet.getRow(i).getCell(j).getStringCellValue();
		
			
		}}
		
		
		return obj;
		
	}
	
}
