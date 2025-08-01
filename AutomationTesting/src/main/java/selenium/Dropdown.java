package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdown extends Base{
public void dropDown()
{
	driver.navigate().to("https://selenium.qabible.in/select-input.php");
	WebElement sele=driver.findElement(By.xpath("//select[@id='single-input-field']"));
	Select select=new Select(sele);
	//select.selectByIndex(1);
	//select.selectByVisibleText("Red");
	select.selectByValue("Yellow");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dropdown dropdown=new Dropdown();
		dropdown.browserIntialisation();
		dropdown.dropDown();
		dropdown.quickAndclose();
	}

}
