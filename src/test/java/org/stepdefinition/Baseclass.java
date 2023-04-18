package org.stepdefinition;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
		
		public static WebDriver driver;
		
		public static void launchBrowser() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		public static void windowmaximize() {
			driver.manage().window().maximize();
		}
        public static void launchurl(String url) {
        	driver.get(url);
        }
        public static String pagetitle() {
        	String title = driver.getTitle();
        	System.out.println(title);
			return title;
        }
        public static void pageurl() {
        	String currentUrl = driver.getCurrentUrl();
        	System.out.println(currentUrl);
        }
        public static void passtext(String txt,WebElement ele) {
        	ele.sendKeys(txt);
        }
        public static void closebrowser() {
        	driver.quit();
        }
        public static void clickbtn(WebElement ele) {
        	ele.click();
        }
        public static void takescreenshot(String imgname) throws IOException {
        	TakesScreenshot screenshot = (TakesScreenshot)driver;
        	File src = screenshot.getScreenshotAs(OutputType.FILE);
        	File des = new File("C:\\Users\\vickysingle\\eclipse-workspace\\com.Mavan_Project\\Screenshots\\imgname.png");
        	FileUtils.copyFile(src, des);
        }
        public static Actions a;
        
        public static void movetocursor(WebElement tarelement) {
        	a = new Actions(driver);
        	a.moveToElement(tarelement).perform();
        }
        public static void dragdrop(WebElement source,WebElement target) {
        	a = new Actions(driver);
        	a.dragAndDrop(source, target).perform();
        }
        public static void createexcelsheet(int rownum,int cellnum,String newdata) throws IOException {
        	File f = new File("C:\\Users\\vickysingle\\eclipse-workspace\\com.Mavan_Project\\Excel\\datadriven.xlsx");
    		
    		Workbook book = new XSSFWorkbook();
    		Sheet Sheet = book.createSheet("datas");
    		Row newRow = Sheet.createRow(rownum);
    		Cell newCell = newRow.createCell(cellnum);
    		newCell.setCellValue(newdata);
    		FileOutputStream fos = new FileOutputStream(f);
    		book.write(fos);
        }
        public static void createcell(int rownum,int cellnum,String newdata) throws IOException {
           File f = new File("C:\\Users\\vickysingle\\eclipse-workspace\\com.Mavan_Project\\Excel\\datadriven.xlsx");
    		FileInputStream fis = new FileInputStream(f);
    		Workbook book = new XSSFWorkbook(fis);
    		Sheet Sheet = book.getSheet("datas");
    		Row newRow = Sheet.getRow(rownum);
    		Cell newCell = newRow.createCell(cellnum);
    		newCell.setCellValue(newdata);
    		FileOutputStream fos = new FileOutputStream(f);
    		book.write(fos);
        }
        public static void createrow(int rownum,int cellnum,String newdata) throws IOException {
            File f = new File("C:\\Users\\vickysingle\\eclipse-workspace\\com.Mavan_Project\\Excel\\datadriven.xlsx");
     		FileInputStream fis = new FileInputStream(f);
     		Workbook book = new XSSFWorkbook(fis);
     		Sheet Sheet = book.getSheet("datas");
     		Row newRow = Sheet.createRow(rownum);
     		Cell newCell = newRow.createCell(cellnum);
     		newCell.setCellValue(newdata);
     		FileOutputStream fos = new FileOutputStream(f);
     		book.write(fos);
         }
}


