package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import selenium.Base;

public class CheckBox extends Base {
 
	public void checkBox1()
	{
		driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement check=driver.findElement(By.xpath("//input[@value='option-1']"));
		System.out.println(check.isSelected());
		check.click();
		System.out.println(check.isSelected());
	}
	public void checkAll()
	{
		driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		List<WebElement> chall=driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(WebElement che:chall)
		{
			che.click();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 CheckBox checkbox=new  CheckBox();
		 checkbox.browserIntialisation();
		 //checkbox.checkBox1();
		 checkbox.checkAll();
		 
	}

}
