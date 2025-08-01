package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public WebDriver driver;
	public void fileUpload()
	{
		driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		WebElement file=driver.findElement(By.xpath("//input[@id='file-upload']"));
		file.sendKeys("C:\\Users\\drisa\\OneDrive\\Desktop\\java interview.docx");
		WebElement upload=driver.findElement(By.xpath("//input[@id='file-submit']"));
		upload.click();
		
		
	}
	public void robot() throws AWTException
	{
		driver=new ChromeDriver();
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		driver.manage().window().maximize();
		WebElement pdf=driver.findElement(By.xpath("//a[@id='pickfiles']"));
		pdf.click();
		StringSelection selection=new StringSelection("C:\\Users\\drisa\\Downloads\\POJ UNIT - 1.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);
		Robot robot=new Robot();
		robot.delay(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		FileUpload fileupload=new FileUpload();
		//fileupload.fileUpload();
		fileupload.robot();
	}

}
