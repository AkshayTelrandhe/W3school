package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FetchData {

	public static void main(String[] args) throws IOException {
		FetchData fd = new FetchData();
		// fd.data1();
		// fd.data2();
		// fd.data3();
		fd.data4("Sheet3","TC_name","c");

	}

	public void data1() throws IOException {

		FileInputStream fs = new FileInputStream(
				"D:\\Pratice java\\w3school\\src\\test\\resources\\testdata\\Testcasedata.xlsx");
		// workbook reading
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		// sheet select based on name
		Sheet sh = wb.getSheet("Sheet1");
		// to run through rows
		Iterator<Row> rw = sh.iterator();
		Row firstrow = rw.next();
		// to run through cell and get value
		Iterator<Cell> ce = firstrow.cellIterator();
		System.out.println(ce.next().toString());

	}

	public void data2() throws IOException {

		FileInputStream fs = new FileInputStream(
				"D:\\Pratice java\\w3school\\src\\test\\resources\\testdata\\Testcasedata.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		Sheet sh = wb.getSheet("Sheet1");
		Iterator<Row> rw = sh.iterator();
		Row firstrow = rw.next();
		Iterator<Cell> ce = firstrow.cellIterator();

		while (ce.hasNext()) {

			System.out.println(ce.next().toString());

		}

	}

	public void data3() throws IOException {

		FileInputStream fs = new FileInputStream(
				"D:\\Pratice java\\w3school\\src\\test\\resources\\testdata\\Testcasedata.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		Sheet sh = wb.getSheet("Sheet1");
		Iterator<Row> rw = sh.iterator();
		while (rw.hasNext()) {
			Row firstrow = rw.next();
			Iterator<Cell> ce = firstrow.cellIterator();
			while (ce.hasNext()) {
				System.out.println(ce.next().toString());

			}

		}

	}

	public void data4(String sheetnames,String colname,String value) throws IOException {
		FileInputStream fs = new FileInputStream(
				"D:\\Pratice java\\w3school\\src\\test\\resources\\testdata\\Testcasedata.xlsx");

		XSSFWorkbook wb = new XSSFWorkbook(fs);
		int sheetno = wb.getNumberOfSheets();
		for (int i = 0; i < sheetno; i++) {
			String sheetname = wb.getSheetName(i);

			if (sheetname.equalsIgnoreCase(sheetnames)) {

				Sheet sh = wb.getSheetAt(i);
				Iterator<Row> row = sh.iterator();
				Row firstrow = row.next();

				Iterator<Cell> ce = firstrow.cellIterator();

				int col = 0;
				int k = 0;
				while (ce.hasNext()) {

					Cell firstcell = ce.next();

					if (firstcell.getStringCellValue().equalsIgnoreCase(colname)) {

						col = k;
					}
					k++;
				}
				while (row.hasNext()) {

					Row firstrow1 = row.next();
					if (firstrow1.getCell(col).toString().equalsIgnoreCase(value)) {

						Iterator<Cell> cell = firstrow1.cellIterator();
						while (cell.hasNext()) {
							System.out.println(cell.next().toString());
						}
					}
				}
			}

		}
	}
	public void data5() throws FileNotFoundException {
		FileInputStream fs = new FileInputStream(
				"D:\\Pratice java\\w3school\\src\\test\\resources\\testdata\\Testcasedata.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook();
		int sheetno=wb.getNumberOfSheets();
		
		
	}
	
	
	
	
	

}
