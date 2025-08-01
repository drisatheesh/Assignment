package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop extends Base {

public void dragAndDrop()
{
	driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
	WebElement drag=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
	Actions actions=new Actions(driver);
	actions.moveToElement(drag).click();
	actions.doubleClick(drag).perform();
	WebElement drop=driver.findElement(By.xpath("//div[@id='mydropzone']"));
	actions.dragAndDrop(drag, drop).build().perform();
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        DragAndDrop draganddrop=new DragAndDrop();
        draganddrop.browserIntialisation();
        draganddrop.dragAndDrop();
	}

}
