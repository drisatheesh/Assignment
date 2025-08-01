package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import selenium.Base;

public class DropAssignment extends Base {
	public void dropDown()
	{
		driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement sel=driver.findElement(By.xpath("//select[@id='dropdowm-menu-1']"));
		Select select=new Select(sel);
		select.selectByIndex(3);
	}
	public void dropDown2()
	{
		driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement select=driver.findElement(By.xpath("//select[@id='dropdowm-menu-2']"));
		Select sele=new Select(select);
		sele.selectByValue("maven");
	}
	public void dropDown3()
	{
		driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement select=driver.findElement(By.xpath("//select[@id='dropdowm-menu-3']"));
		Select sele=new Select(select);
		sele.selectByVisibleText("CSS");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 DropAssignment  dropassignment=new  DropAssignment();
		 dropassignment.browserIntialisation();
		 //dropassignment.dropDown();
		 dropassignment.dropDown2();
		 dropassignment.dropDown3();
	}

}
