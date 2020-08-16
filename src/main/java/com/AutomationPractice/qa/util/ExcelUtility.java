package com.AutomationPractice.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.AutomationPractice.qa.base.TestBase;

public class ExcelUtility extends TestBase{
	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static XSSFRow row;
	public static XSSFCell cell;
	
public static int getRowCount(String xFile, String xSheet) {
	int rowCount;
	try {
		fi = new FileInputStream(xFile);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		wb = new XSSFWorkbook(fi);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	ws = wb.getSheet(xSheet);
	rowCount = ws.getLastRowNum();
	try {
		wb.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		fi.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("The Row Count Is :" + rowCount);
	return rowCount;
	
}
public static int getCellCount(String xFile, String xSheet , int rowno)
{
	int colCount;
	try {
		fi = new FileInputStream(xFile);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		wb = new XSSFWorkbook(fi);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	ws = wb.getSheet(xSheet);
	row = ws.getRow(rowno);
	colCount = row.getLastCellNum();
	System.out.println("The Cell Count Is :" + colCount);
	try {
		wb.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		fi.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return colCount;
	
}
public static String getCellData(String xFile, String xSheet, int rowno,int colno)
{
	String data;
	try {
		fi = new FileInputStream(xFile);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		wb = new XSSFWorkbook(fi);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	ws = wb.getSheet(xSheet);
	row = ws.getRow(rowno);
	cell =row.getCell(colno);
    data = cell.getStringCellValue();
    return data;
	
}

}
