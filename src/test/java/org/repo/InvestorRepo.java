package org.repo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InvestorRepo {
	public @FindBy (xpath="//*[@id=\\\"DivUser\\\"]/span/span[2]") WebElement admin;
	public @FindBy (linkText="Investor") WebElement Investor;
	public @FindBy (id="ContentPlaceHolder1_lnkbtnadd") WebElement addinv;
	public @FindBy (id="ContentPlaceHolder1_txtCompanyName") WebElement invname;
	public @FindBy (id="ContentPlaceHolder1_btnlnkSave") WebElement saveButton;
	public @FindBy (xpath="//button[@type=\"reset\"][@class=\"btn btn-primary\"]") WebElement okwarning;
	public @FindBy (id="ContentPlaceHolder1_lnkclear") WebElement clearButton;
	public @FindBy (id="ContentPlaceHolder1_lnkBack") WebElement backButton;
	public @FindBy (id="ContentPlaceHolder1_gvinvester_lnkEdit_0") WebElement Ronnieedit;
	public @FindBy (xpath="//div[@class=\"btn btn-primary btn-sm\"]") WebElement actionButton;
	public @FindBy (id="ContentPlaceHolder1_LinkButton1") WebElement editInv;
	public @FindBy (id="ContentPlaceHolder1_btnlnkSave") WebElement updateButton;
	public @FindBy (id="ContentPlaceHolder1_lnkbtnCloseSUccessPopop") WebElement updatesuccessButton;
	public @FindBy (id="ContentPlaceHolder1_lnkbtnadd") WebElement addTrans;
	public @FindBy (id="ContentPlaceHolder1_txtamount") WebElement transamt;
	public @FindBy (id="ContentPlaceHolder1_btnlnkClear") WebElement tranclearButton;
	public @FindBy (id="ContentPlaceHolder1_lnkBack") WebElement tranbackButton;
	public @FindBy (xpath="//input[@id=\"ContentPlaceHolder1_txttransdat\"]") WebElement trandateButton;
	public @FindBy (id="ContentPlaceHolder1_lnkbtncusmapping") WebElement customersButton;
	public @FindBy (id="ContentPlaceHolder1_lnkexcel") WebElement eportexccelButton;
	public @FindBy (id="ContentPlaceHolder1_LinkButton4") WebElement investorbackButton;
	public @FindBy (xpath="	//a[@id=\"ContentPlaceHolder1_lnkadd\"]\r\n"+ "") WebElement addcustomersButton;
	public @FindBy (id="ContentPlaceHolder1_ddlinstaller") WebElement selectinstallerButton;
	public @FindBy (id="ContentPlaceHolder1_rptcustomerslist_checkAll") WebElement selectallButton;
	public @FindBy (xpath="	//a[@id=\"ContentPlaceHolder1_lnkbtnsave\"]\r\n"+ "") WebElement saveButton2;
	public @FindBy (id="ContentPlaceHolder1_button3") WebElement warningButton;
	public @FindBy (id="ContentPlaceHolder1_gvcustmapping_lnkEdit_4") WebElement customereditButton;
	public @FindBy (xpath="	//a[@id=\"ContentPlaceHolder1_lnkbtnupdate\"]\r\n"+ "") WebElement customerupdatedButton;
	public @FindBy (id="ContentPlaceHolder1_lnkExcel") WebElement excelButton;
	public @FindBy (linkText="View users") WebElement viewuserButton;
	public @FindBy (id="ContentPlaceHolder1_txtFname") WebElement usernameButton;
	public @FindBy (id="ContentPlaceHolder1_txtLastName") WebElement userlastnameButton;
	public @FindBy (id="ContentPlaceHolder1_ddlusertpenew") WebElement selectusertypeButton;
	public @FindBy (id="ContentPlaceHolder1_ddlinvestor") WebElement selectinvestorButton;
	public @FindBy (id="ContentPlaceHolder1_lnkbtnviewinvestor") WebElement backButton1;

	
}