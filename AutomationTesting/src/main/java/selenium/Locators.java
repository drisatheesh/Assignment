package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locators extends Base {
	public WebDriver driver;
 public void idLocator()
 {
	WebElement id=driver.findElement(By.id("value-b"));
	WebElement id1=driver.findElement(By.id("button-one"));
	WebElement id2=driver.findElement(By.id("single-input-field"));
 }
 public void nameLocator()
 {
	 WebElement name=driver.findElement(By.name("viewport"));
	 WebElement name1=driver.findElement(By.name("description"));
	 WebElement name2=driver.findElement(By.name("keywords"));
 }
 public void classLocator()
 {
	 WebElement cl=driver.findElement(By.className("col-lg-3 col-md-3 col-sm-12 col-xs-12"));
	 WebElement cl1=driver.findElement(By.className("clearfix"));
	 WebElement cl2=driver.findElement(By.className("container page"));
	 WebElement cl3=driver.findElement(By.className("list-group list-group-flush"));
 }
 public void linkText()
 {
	 WebElement link=driver.findElement(By.linkText("check-box-demo.php"));
 }
 public void partialLink()
 {
	 WebElement partial=driver.findElement(By.partialLinkText("check-box-de"));
 }
 public void cssSelector()
 {
	 WebElement css=driver.findElement(By.cssSelector("input#single-input-field"));
	 WebElement css1=driver.findElement(By.cssSelector("input.form-control"));
	 WebElement css2=driver.findElement(By.cssSelector("input[id=single-input-field]"));
	 //tag[attributetype=attributevalue]
	// tag.class[attributetype=attributevalue]
	 WebElement css3=driver.findElement(By.cssSelector("input.form-control[id=single-input-field]"));
 }
 //   /html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/input
 public void absoulutexpath()
 {
	 WebElement absxpath=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/input"));
 }
//TAGNAME[@ATTRIBUTE='ATTRIBUTE VALUE']
  public void relativeXpath()
  {
	  WebElement relxpath=driver.findElement(By.xpath("//button[@id='button-one']"));
	  WebElement textxpath=driver.findElement(By.xpath("//button[text()='Get Total']"));
	  WebElement andxpath=driver.findElement(By.xpath("//button[@id='button-one' and @type='button']"));
	  WebElement orxpath=driver.findElement(By.xpath("//button[@id='button-one' or @id='button-one-electronics']"));
	  WebElement parentxpath=driver.findElement(By.xpath("//div[contains (text(), 'Single Input Field')]//parent::div[@class='card']"));
	  WebElement childxpath=driver.findElement(By.xpath("//div[@class='card']//child::button[@id='button-one']"));
	  WebElement followingxpath=driver.findElement(By.xpath("//button[@id='button-one']//following::div[@class='card']"));
	  WebElement preceexpath=driver.findElement(By.xpath("//button[@id='button-one']//preceding:: div[@class='card']"));
	  WebElement ancesxpath=driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div"));
	  WebElement desenxpath=driver.findElement(By.xpath("//div[@class='card']//descendant::div"));
	  WebElement contains=driver.findElement(By.xpath("//button[contains(@id,'-one')]"));
	  WebElement index=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	  WebElement strats=driver.findElement(By.xpath("//input[starts-with(@id,'single')]"));
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
