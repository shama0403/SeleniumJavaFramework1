package Utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	// took variables and declated at class level as we will use in all functions. 
	static String projectPath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	// when ever we created an object for this class class constructor is called - even if constructor is not there default constructor is called
	
	// path, workbook , sheetname should be given inside constructor 
	//From external class whenever we create object for this class constructor will be called and it will ask for excel path and sheet name
	public ExcelUtils(String excelPath, String sheetName) {
		try {
			
			//remove from here and give in test function
		// projectPath=System.getProperty("user.dir");
		workbook = new XSSFWorkbook(excelPath);
		sheet = workbook.getSheet(sheetName);
		
		}
		catch(Exception e){
			System.out.println(e.getMessage());;
			System.out.println(e.getCause());;
			e.printStackTrace();
			
		}
	}
	// commenting main method if we are calling from another class
	//to use main method if we are executing from same class. Here we have used constructor and executing from another class
//	public static void main(String[] args) {
//		getRowCount();
//		// passing the rownum and colnum from calling function which is main function now
//		getColumnCount(0,0);
//	}
	
	 public static void getRowCount() {
		
		try {
			// take relative path from project
			//get framework path
	 	int RowCount = sheet.getPhysicalNumberOfRows();
		System.out.println("Number of rows : " +RowCount);
		}
		
		catch(Exception exp1){
			System.out.println(exp1.getMessage());;
			System.out.println(exp1.getCause());;
			exp1.printStackTrace();
			
		}
	}
	// get the row and column number from calling function to avoid hard coding
	public static void getColumnCount(int rowNum, int colNum) {
		try {
	
			String celldataString = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			System.out.println("This is cell data "+celldataString);
		}
		catch(Exception exp2){
			System.out.println(exp2.getMessage());;
			System.out.println(exp2.getCause());;
			exp2.printStackTrace();
			
		}
		}
	}


