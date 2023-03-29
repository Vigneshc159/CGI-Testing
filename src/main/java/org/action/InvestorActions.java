package org.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.repo.InvestorRepo;

public class InvestorActions extends InvestorRepo{
	public void inv01(WebDriver wb) {
		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();
		Investor.click();
	}
	public void inv02(WebDriver wb,String Invname) {
		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();
		Investor.click();
		addinv.click();
		//invname.sendKeys(Invname);
		saveButton.click();
		okwarning.click();
		
	}
	public void inv03(WebDriver wb,String Invname) {
		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();
		Investor.click();
		addinv.click();
		invname.sendKeys(Invname);
		clearButton.click();
		
	}
	public void inv04(WebDriver wb,String Invname) {
		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();
		Investor.click();
		addinv.click();
		backButton.click();
		addinv.click();
		
	}
	public void inv05(WebDriver wb,String Invname) {
		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();
		Investor.click();
		addinv.click();
		invname.sendKeys(Invname);
		saveButton.click();
		okwarning.click();
		
		
	}
	public void inv06(WebDriver wb,String Invname) {
		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();
		Investor.click();
		Ronnieedit.click();
		actionButton.click();
		editInv.click();
		updateButton.click();
		updatesuccessButton.click();
		
	}
	public void inv07(WebDriver wb,String Invname) {
		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();
		Investor.click();
		Ronnieedit.click();
		actionButton.click();
		editInv.click();
		clearButton.click();
		
	}
	public void inv08(WebDriver wb,String Invname) {
		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();
		Investor.click();
		Ronnieedit.click();
		actionButton.click();
		editInv.click();
		backButton.click();
		
	}
	public void inv09(WebDriver wb,String tranamt) throws InterruptedException {
		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();
		Investor.click();
		Ronnieedit.click();
		actionButton.click();
		addTrans.click();
		Actions act=new Actions(wb);
		Thread.sleep(10000);
		act.clickAndHold(wb.findElement(By.id("ContentPlaceHolder1_txttransdat"))).build().perform();
		act.click(wb.findElement(By.id("ContentPlaceHolder1_CalendarExtender1_days"))).build().perform();
		transamt.sendKeys(tranamt);
		saveButton.click();
		
	}
	public void inv10(WebDriver wb,String tranamt) throws InterruptedException {
		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();
		Investor.click();
		Ronnieedit.click();
		actionButton.click();
		addTrans.click();
		Actions act=new Actions(wb);
		Thread.sleep(10000);
		act.clickAndHold(wb.findElement(By.id("ContentPlaceHolder1_txttransdat"))).build().perform();
		act.click(wb.findElement(By.id("ContentPlaceHolder1_CalendarExtender1_days"))).build().perform();
		transamt.sendKeys(tranamt);
		tranclearButton.click();
		
	}
	public void inv11(WebDriver wb,String tranamt,String transdate) throws InterruptedException {
		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();
		Investor.click();
		Ronnieedit.click();
		actionButton.click();
		
		//WebDriverWait wait=new WebDriverWait(wb, 20);
		//WebElement actionButton1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class=\"btn btn-primary btn-sm\"]")));
		
		//actionButton.click();
		addTrans.click();
		transamt.sendKeys(tranamt);
		trandateButton.sendKeys(transdate);
		tranbackButton.click();
		//addTrans.click();
		
	}
	
	public void inv12(WebDriver wb) throws InterruptedException {
		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();
		Investor.click();
		Ronnieedit.click();
		actionButton.click();
		customersButton.click();
	
}
	
	public void inv13(WebDriver wb) throws InterruptedException {
		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();
		Investor.click();
		Ronnieedit.click();
		actionButton.click();
		eportexccelButton.click();
	
}
	
	public void inv14(WebDriver wb) throws InterruptedException {
		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();
		Investor.click();
		Ronnieedit.click();
		actionButton.click();
		investorbackButton.click();
}
	public void inv15(WebDriver wb) throws InterruptedException {
		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();
		Investor.click();
		Ronnieedit.click();
		actionButton.click();
		customersButton.click();
		actionButton.click();
		addcustomersButton.click();
		Select s= new Select(selectinstallerButton);
		s.selectByVisibleText("PowerFund 31");
		selectallButton.click();
		actionButton.click();
		saveButton2.click();
		warningButton.click();
		customereditButton.click();
		selectallButton.click();
		selectallButton.click();
		actionButton.click();
		customerupdatedButton.click();
		warningButton.click();

}
	public void inv16(WebDriver wb) throws InterruptedException {
		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();
		Investor.click();
		Ronnieedit.click();
		actionButton.click();
		customersButton.click();
		actionButton.click();
		backButton1.click();
	}
	
	public void inv17(WebDriver wb) throws InterruptedException {
		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();
		Investor.click();
		excelButton.click();
		
}
	public void inv18(WebDriver wb,String UserName1,String userlastnam) throws InterruptedException {
		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();
		viewuserButton.click();
		addinv.click();
		usernameButton.sendKeys("suriya");
		userlastnameButton.sendKeys("s");
		Select s= new Select(selectusertypeButton);
		s.selectByIndex(4);
		Select s1= new Select(selectinvestorButton);
		s.selectByIndex(1);
}
	public void inv19(WebDriver wb) throws InterruptedException {
}	
}