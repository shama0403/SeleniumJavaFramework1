package Utils;

public class ExcelUtilDemo {
	
	public static void main(String[] args) {
		//excel path
		String projectPath=System.getProperty("user.dir");
		
		//create object for the function having code. As we have created constructor it will ask for path and sheet name
		ExcelUtils excel = new ExcelUtils(projectPath+"/Excel/data.xlsx", "Creds");
		excel.getRowCount();
		excel.getColumnCount(0, 0);
	}

}
