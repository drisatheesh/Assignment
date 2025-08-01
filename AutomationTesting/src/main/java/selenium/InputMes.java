package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InputMes extends Base {
    public void enterMessage()
    {
    	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
    	WebElement enter=driver.findElement(By.xpath("//input[@id='single-input-field']"));
    	System.out.println(enter.isEnabled());
    	enter.sendKeys("Hai");
    	WebElement show=driver.findElement(By.xpath("//button[@id='button-one']"));
    	show.click();
    	WebElement input=driver.findElement(By.xpath("//input[@id='value-a']"));
    	input.sendKeys("55");
        WebElement input2=driver.findElement(By.xpath("//input[@id='value-b']"));
        input2.sendKeys("100");
        WebElement button=driver.findElement(By.xpath("//button[@id='button-two']"));
        button.click();
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputMes inputmes=new InputMes();
		inputmes.browserIntialisation();
		inputmes.enterMessage();
		//inputmes.quickAndclose();
	}

}
