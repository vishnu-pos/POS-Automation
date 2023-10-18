package test.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FilenameUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import test.utilities.ReadConfig;


public class BaseClass {
	private static final String value = null;
	public static WebDriver driver;
	
	ReadConfig readconfig = new ReadConfig();

	public String Url =readconfig.getAppUrl();

	public String Adminusername =readconfig.getAdminuserName();
	
	public String Adminpass =readconfig.getAdminUserPass();
	
	
	
	public String EUrl =readconfig.getEUrl();

	public String Eusername =readconfig.getEnergyUser();
	
	public String Epass =readconfig.getEnergyPass();
	
	
	@BeforeClass
	public static void browsersetup() {
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		//options.addArguments("--remote-allow-origins=*");
		driver= new ChromeDriver(options);
		driver.manage().window().maximize();
		

	}

	

	public void browserlaunch(String url) {
	driver.get(url);

	}


	public static void implicityWait(long arg) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(arg));
		/*	
	}
	public static void openurl(String url) {
		driver.get(url);*/
	}

	public static WebElement locatedById(String id) {
		WebElement findElement = driver.findElement(By.id(id));

		return findElement;

	}

	public static WebElement locatedByName(String name ) {
		WebElement findElement = driver.findElement(By.name(name));

		return findElement;

	}
	public static WebElement locatedByClassName(String name) {
		WebElement findElement = driver.findElement(By.className(name));
		return findElement;

	}

	public static WebElement locatedByXpath(String xpath) {
		WebElement findElement = driver.findElement(By.xpath(xpath));
		return findElement;

	}


	/*public static WebElement locatedByXpath(String xpath) {
		WebElement findElement = driver.findElements(By.xpath(xpath))
		return findElements;
	 */

	public static void sendkeys(WebElement element, String value) {
		element.sendKeys(value);


	}

	public static void click(WebElement element) {
		element.click();

	}
	public static String getText(WebElement element) {
		String text = element.getText();
		return text;

	}
	public static String getAttribute(WebElement element, String value) {
		String attribute = element.getAttribute(value);
		return attribute;

	}

	public static void takeScreenshot() throws IOException {
		TakesScreenshot ts= (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		System.out.println(screenshotAs);
		//FilenameUtils.copyFile(screenshotAs,new File(path));

	}

	public static  String excelRead(String path, String sheet, int rowIndex,int cellIndex) throws IOException{

		File f= new File(path);
		FileInputStream file=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(file);
		Sheet st = wb.getSheet(sheet);
		Row row = st.getRow(rowIndex);
		Cell cell = row.getCell(cellIndex);
		CellType cellType = cell.getCellType();
		switch (cellType) {
		case STRING:
			String value = cell.getStringCellValue();
			break;
		case NUMERIC:	
			if(DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat sim=new SimpleDateFormat("dd-MM-YYYY");
				String format = sim.format(dateCellValue);
			}
			else {
				double numericCellValue = cell.getNumericCellValue();
				BigDecimal big = BigDecimal.valueOf(numericCellValue);
				String string = big.toString();
			}
			break;
		default:
			break;
		}
		return value;
	}



	public static void browserClose() {
		driver.close();
	}










}
