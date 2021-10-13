package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ViewLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
		WebElement fname = driver.findElement(By.id("createLeadForm_firstName"));
		fname.sendKeys("Rabecca Mary");		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rayyar");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("10/01/21");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Mrs");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Electronics");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("10000");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("OK");
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("91");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("044");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9876543210");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abc@xyz.com");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("TEST");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("TEST2");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("abc colony");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("xyz nagar");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dropdown1 = new Select(state);
		dropdown1.selectByValue("IN");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("900601");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		String title = driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
		System.out.println("Title is " +title);

	}

}
