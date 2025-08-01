package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableHandling extends Base {

	public void readFulltabledata() 
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement table=driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		System.out.println(table.getText());
	}
	public void selectRow()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement row=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[2]"));
		System.out.println(row.getText());
	}
	public void selectpertiData()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement data=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[3]/td[1]"));
		System.out.println(data.getText());
	}
	public void selectColumn()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> coloumn=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[1]"));
		for(WebElement col:coloumn)
		{
			System.out.println(col.getText());
		}
		
	}
	public void searchElement()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		String input="Tiger Nixon";
		List<WebElement> sear=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[1]"));
		for(WebElement search:sear)
		{
			if(search.getText().equals(input))
			{
				System.out.println(search.getText());
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TableHandling tablehandling=new TableHandling();
		tablehandling.browserIntialisation();
		tablehandling.readFulltabledata();
		System.out.println("****************");
		
		tablehandling.selectRow();
		System.out.println("****************");
		tablehandling.selectpertiData();
		System.out.println("****************");
		tablehandling.selectColumn();
		System.out.println("*******************");
		tablehandling.searchElement();
		tablehandling.quickAndclose();
	}

}
