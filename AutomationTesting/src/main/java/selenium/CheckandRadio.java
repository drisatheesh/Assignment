package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckandRadio extends Base {
	
	public void checkBox()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement check=driver.findElement(By.xpath("//input[@id='gridCheck']"));
		System.out.println(check.isSelected());
		check.click();
		System.out.println(check.isSelected());
	}
	public void redio()
	{
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement radio=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		radio.click();
	}
	public void findElementseg()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		List<WebElement> multiple=driver.findElements(By.xpath("//input[@class='check-box-list']"));
		for(WebElement boxes:multiple)
		{
			boxes.click();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckandRadio checkandradio=new CheckandRadio();
		checkandradio.browserIntialisation();
		checkandradio.checkBox();
		checkandradio.findElementseg();
		
		//checkandradio.redio();
		
	}

}
