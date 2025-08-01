package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHandling extends Base {
    public void alertHandling()
    {
    	driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
    	WebElement alert=driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
    	alert.click();
    	driver.switchTo().alert().accept();
    }
    public void okCancel()
    {
    	driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
    	WebElement cancel=driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
    	cancel.click();
    	driver.switchTo().alert().dismiss();
    }
    public void messageAlert()
    {
    	driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
    	WebElement mess=driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
    	mess.click();
    	driver.switchTo().alert().sendKeys("drisya");
    	driver.switchTo().alert().accept();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlertHandling alertHandling=new AlertHandling();
		alertHandling.browserIntialisation();
		//alertHandling.alertHandling();
		//alertHandling.okCancel();
		alertHandling.messageAlert();
		//alertHandling.quickAndclose();
	}

}
