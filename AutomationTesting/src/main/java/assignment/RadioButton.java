package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import selenium.Base;

public class RadioButton extends Base {
 
	public void radiobu()
	{
		driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement rad=driver.findElement(By.xpath("//input[@value='green']"));
		rad.click();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RadioButton radiobutton=new RadioButton();
		radiobutton.browserIntialisation();
		radiobutton.radiobu();
	}

}
