package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import selenium.Base;

public class Table extends Base {
    public void readTable()
    {
    	driver.navigate().to("https://selenium.qabible.in/table-sort-search.php");
    	WebElement sort=driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
    	System.out.println(sort.getText());
    }
    public void readRow()
    {
    	driver.navigate().to("https://selenium.qabible.in/table-sort-search.php");
    	WebElement row=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[3]"));
    	System.out.println(row.getText());
    }
    public void readColumn()
    {
    	driver.navigate().to("https://selenium.qabible.in/table-sort-search.php");
    	List<WebElement> colomn=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[3]"));
    	for(WebElement col:colomn)
    	{
    		System.out.println(col.getText());
    	}
    }
    public void data()
    {
    	driver.navigate().to("https://selenium.qabible.in/table-sort-search.php");
    	WebElement data1=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[1]/td[3]"));
    	System.out.println(data1.getText());
    }
    public void search()
    {
    	driver.navigate().to("https://selenium.qabible.in/table-sort-search.php");
    	String input="Accountant";
    	List<WebElement> ser=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr[1]/td[2]"));
    	for(WebElement serr:ser)
    	{
    		if(serr.getText().equals(input))
    		{
    			System.out.println(serr.getText());
    		}
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Table table=new  Table();
		 table.browserIntialisation();
		 //table.readTable();
		 //table.readRow();
		 //table.readColumn();
		// table.data();
		 table.search();
		 table.quickAndclose();
	}

}
