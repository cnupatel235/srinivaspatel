package com.vtiger.genericutilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileUtility {
	public String readDataFromExcel(String sheetname,int rownum,int cellnum) throws EncryptedDocumentException, IOException {
		FileInputStream fise=new FileInputStream("path of excell sheet");
		return WorkbookFactory.create(fise).getSheet(sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
	
	}

}
