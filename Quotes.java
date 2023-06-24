package Vtiger1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Quotes {
	
	public static void main(String[] args) throws InterruptedException {

		

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://demo.vtiger.com/vtigercrm/");

		driver.findElement(By.xpath("//button[.='Sign in']")).click();

		driver.findElement(By.xpath("//DIV[@id='appnavigator']/DIV[@class='row app-navigator']")).click();

		WebElement ele=driver.findElement(By.id("SALES_modules_dropdownMenu"));

		Actions action=new Actions (driver);

		action.moveToElement(ele).perform();

		

		driver.findElement(By.xpath("//span[text()=' Quotes']")).click();

		driver.findElement(By.id("Quotes_listView_basicAction_LBL_ADD_RECORD")).click();

		

		driver.findElement(By.id("Quotes_editView_fieldName_subject")).sendKeys("abcd");

		driver.findElement(By.id("potential_id_display")).sendKeys("XYZ");

		

		driver.findElement(By.id("select2-chosen-2")).click();

	    WebElement ele1=driver.findElement(By.id("s2id_autogen2_search"));

	    ele1.sendKeys("Created");

	    ele1.sendKeys(Keys.ENTER);

	    WebElement ele2=driver.findElement(By.id("Quotes_editView_fieldName_validtill"));

	    ele2.click();

	    ele2.sendKeys(Keys.ENTER);
	 
	    driver.findElement(By.id("contact_id_display")).sendKeys("Rathod");

	    driver.findElement(By.id("select2-chosen-4")).click();

	    WebElement ele3=driver.findElement(By.id("s2id_autogen4_search"));

	    ele3.sendKeys("Fed");

	    ele3.sendKeys(Keys.ENTER);

	    

	    driver.findElement(By.id("Quotes_editView_fieldName_shipping")).sendKeys("Nagpur");

	    driver.findElement(By.id("assigned_user_id1_display")).sendKeys("Mr.Prasad");
	   
	   driver.findElement(By.id("select2-drop-mask")).click();
	   WebElement e1 = driver.findElement(By.id("s2id_autogen6_search"));
	   e1.sendKeys("Markketing Group");
	   e1.sendKeys(Keys.ENTER);
	    

	    driver.findElement(By.id("Quotes_editView_fieldName_bill_street")).sendKeys("Ambika nagar");

	    driver.findElement(By.id("Quotes_editView_fieldName_ship_street")).sendKeys("Nagpur"); 

	    driver.findElement(By.id("Quotes_editView_fieldName_bill_pobox")).sendKeys("457567");

	    driver.findElement(By.id("Quotes_editView_fieldName_ship_pobox")).sendKeys("235465");

	    driver.findElement(By.id("Quotes_editView_fieldName_bill_city")).sendKeys("Nagpur");

	    driver.findElement(By.id("Quotes_editView_fieldName_ship_city")).sendKeys("Pune");

	    driver.findElement(By.id("Quotes_editView_fieldName_bill_state")).sendKeys("Maharashtra");

	    driver.findElement(By.id("Quotes_editView_fieldName_ship_state")).sendKeys("Maharashtra");

	    driver.findElement(By.id("Quotes_editView_fieldName_bill_code")).sendKeys("2354");

	    driver.findElement(By.id("Quotes_editView_fieldName_ship_code")).sendKeys("3457");

	    driver.findElement(By.id("Quotes_editView_fieldName_bill_country")).sendKeys("India");

	    driver.findElement(By.id("Quotes_editView_fieldName_ship_country")).sendKeys("India");

	    

	    driver.findElement(By.id("Quotes_editView_fieldName_description")).sendKeys("It contains dangerous gas");

	    driver.findElement(By.id("productName1")).sendKeys("Agreeseeds");

	    driver.findElement(By.id("comment1")).sendKeys("phone");

	    driver.findElement(By.xpath("//button[text()='Save']")).click();
	       
	       
	    
	       driver.findElement(By.xpath("//span[@class='fa fa-user']")).click();
	      
	       driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).click();
	       

	}

}



