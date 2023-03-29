package org.action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.repo.CustomerListRepo;

public class CustomerListActions extends CustomerListRepo{
	public  void cs01(WebDriver wb ) {
		wb.findElement(By.id("DivCustomer")).click();
		list.click();
		Select s=new Select(selectinstaller);
		s.selectByVisibleText("Test Client");
		searchButton.click();

	}
	public  void cs02(WebDriver wb ) {
		wb.findElement(By.id("DivCustomer")).click();
		list.click();
		addButton.click();
		actionButton.click();
		saveButton.click();
		warningButton.click();
	}


	public  void cs03(WebDriver wb,String cusid,String cusnam ) {
		wb.findElement(By.id("DivCustomer")).click();
		list.click();
		addButton.click();
		customerid.sendKeys(cusid);
		customername.sendKeys(cusnam);
		Select s=new Select(selectclient);
		s.selectByVisibleText("Test Client");
		Select s1=new Select(selectcustomer);
		s1.selectByIndex(1);
		actionButton.click();
		clearbutton.click();
	}

	public  void cs04(WebDriver wb,String cusid,String cusnam,String monthlypay,String totalyear,String escala,String totalconamount,String ph,String em) {
		wb.findElement(By.id("DivCustomer")).click();
		list.click();
		addButton.click();
		customerid.sendKeys(cusid);
		customername.sendKeys(cusnam);
		Select s=new Select(selectclient);
		s.selectByVisibleText("Test Client");
		Select s1=new Select(selectcustomer);
		s1.selectByIndex(1);
		monthlypaymentbox.sendKeys(monthlypay);
		totalyears.sendKeys(totalyear);
		escalation.sendKeys(escala);
		totalcontractamount.sendKeys(totalconamount);
		phonenum.sendKeys(ph);
		email.sendKeys(em);
		actionButton.click();
		saveButton.click();
		warningButton.click();

	}
	public  void cs05(WebDriver wb ) {
		wb.findElement(By.id("DivCustomer")).click();
		list.click();
		addButton.click();
		actionButton.click();
		backButton.click();
	
	}
	
	public  void cs06(WebDriver wb ) {
		wb.findElement(By.id("DivCustomer")).click();
		list.click();
		addButton.click();
		Select s=new Select(selectclient);
		s.selectByVisibleText("Test Client");
		Select s1=new Select(selectcustomer);
		s1.selectByIndex(1);
		customeraddButton.click();
		saveButton1.click();
}
	
	public  void cs07(WebDriver wb,String port ) {
		wb.findElement(By.id("DivCustomer")).click();
		list.click();
		addButton.click();
		Select s=new Select(selectclient);
		s.selectByVisibleText("Test Client");
		Select s1=new Select(selectcustomer);
		s1.selectByIndex(1);
		customeraddButton.click();
		portfolioBox.sendKeys(port);
		clearButton1.click();
		
}
	public  void cs08(WebDriver wb,String port ) {
		wb.findElement(By.id("DivCustomer")).click();
		list.click();
		addButton.click();
		Select s=new Select(selectclient);
		s.selectByVisibleText("Test Client");
		Select s1=new Select(selectcustomer);
		s1.selectByIndex(1);
		customeraddButton.click();
		portfolioBox.sendKeys(port);
		saveButton1.click();
		warningButton1.click();
}
	public  void cs09(WebDriver wb ) {
		wb.findElement(By.id("DivCustomer")).click();
		list.click();
		addButton.click();
		Select s=new Select(selectclient);
		s.selectByVisibleText("Test Client");
		Select s1=new Select(selectcustomer);
		s1.selectByIndex(1);
		customeraddButton.click();
		backButton1.click();
	
}
	
	public  void cs10(WebDriver wb ) {
		wb.findElement(By.id("DivCustomer")).click();
		list.click();
		addButton.click();
		Select s=new Select(selectclient);
		s.selectByVisibleText("Test Client");
		Select s1=new Select(selectcustomer);
		s1.selectByIndex(1);
		customereditButton.click();
		updatedButton.click();
		warningButton1.click();
}
	public  void cs11(WebDriver wb ) {
		wb.findElement(By.id("DivCustomer")).click();
		list.click();
		addButton.click();
		Select s=new Select(selectclient);
		s.selectByVisibleText("Test Client");
		Select s1=new Select(selectcustomer);
		s1.selectByIndex(1);
		customereditButton.click();
		backButton1.click();
}

	public  void cs12(WebDriver wb,String cusid,String cusnam,String monthlypay,String totalyear,String escala,String totalconamount,String ph,String em ) {
		wb.findElement(By.id("DivCustomer")).click();
		list.click();
		addButton.click();
		customerid.sendKeys(cusid);
		customername.sendKeys(cusnam);
		Select s=new Select(selectclient);
		s.selectByVisibleText("Test Client");
		Select s1=new Select(selectcustomer);
		s1.selectByIndex(1);
		monthlypaymentbox.sendKeys(monthlypay);
		totalyears.sendKeys(totalyear);
		escalation.sendKeys(escala);
		totalcontractamount.sendKeys(totalconamount);
		phonenum.sendKeys(ph);
		email.sendKeys(em);
		JavascriptExecutor jse = (JavascriptExecutor)wb;
		jse.executeScript("window.scrollBy(0,250)");
		actionButton.click();
		saveButton.click();
		warningButton.click();

}
}