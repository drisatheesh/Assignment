package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
WebDriver driver;
public void frames()
{
	driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/guru99home/");
	driver.manage().window().maximize();
	WebElement iframe=driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
	driver.switchTo().frame(iframe);
	WebElement jmeter=driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
	
	jmeter.click();
}
//iframe[@width='560']
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Frames frames=new Frames();
          frames.frames();
	}

}
