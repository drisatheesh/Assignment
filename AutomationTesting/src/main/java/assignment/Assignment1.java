package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import selenium.Base;

public class Assignment1 extends Base {
	
	public void input()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		List<WebElement> text=driver.findElements(By.xpath("//input[@class='form-control']"));
		for(WebElement enter:text)
		{
			enter.sendKeys("Drisya");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment1 assignment1=new Assignment1(); 
		assignment1.browserIntialisation();
		assignment1.input();
	}

}
