package org.repo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomerListRepo {
	public @FindBy(id="DivCustomer")WebElement customer ;
	public @FindBy(linkText="List")WebElement list ;
	public @FindBy(id="ContentPlaceHolder1_ddlclientfilter")WebElement selectinstaller ;
	public @FindBy(xpath="//a[@id=\"ContentPlaceHolder1_lnkbtnSearch\"]")WebElement searchButton ;
	public @FindBy(xpath="//a[@id=\"ContentPlaceHolder1_lnkaddcust\"]")WebElement addButton ;
	public @FindBy(id="ContentPlaceHolder1_txtcustomerid")WebElement customerid ;
	public @FindBy(id="ContentPlaceHolder1_txtcustname")WebElement customername ;
	public @FindBy(xpath="//a[@id=\"ContentPlaceHolder1_LinkButton1\"]")WebElement warningButton ;
	public @FindBy(id="ContentPlaceHolder1_ddlclient")WebElement selectclient ;
	public @FindBy(id="ContentPlaceHolder1_ddlcustgrp")WebElement selectcustomer ;
	public @FindBy(id="ContentPlaceHolder1_LinkButton15")WebElement clearbutton ;
	public @FindBy(id="ContentPlaceHolder1_txtmonthPay")WebElement monthlypaymentbox ;
	public @FindBy(id="ContentPlaceHolder1_txtyears")WebElement totalyears ;
	public @FindBy(id="ContentPlaceHolder1_txtescal")WebElement escalation  ;
	public @FindBy(id="ContentPlaceHolder1_txtprocostauto")WebElement totalcontractamount  ;
	public @FindBy(id="ContentPlaceHolder1_txtphoeNo")WebElement phonenum ;
	public @FindBy(id="ContentPlaceHolder1_txtEmail")WebElement email  ;
	public @FindBy(xpath="//span[@class=\"svg-icon svg-icon-5 m-0\"]")WebElement actionButton ;
	public @FindBy(xpath="//a[@id=\"ContentPlaceHolder1_lnkBack\"]\r\n"+ "")WebElement backButton  ;
	public @FindBy(xpath="//a[@id=\"ContentPlaceHolder1_LinkButton14\"]\r\n"+ "")WebElement customeraddButton ;
	public @FindBy(id="ContentPlaceHolder1_lnksave")WebElement saveButton  ;
	public @FindBy(xpath="//a[@id=\"ContentPlaceHolder1_lnkSaveAccGroup\"]\r\n"+ "")WebElement saveButton1 ;
	public @FindBy(id="ContentPlaceHolder1_txtPortfolio")WebElement portfolioBox ;
	public @FindBy(xpath="//a[@id=\"ContentPlaceHolder1_lnkClearAccGroup\"]\r\n"+ "")WebElement clearButton1 ;
	public @FindBy(id="ContentPlaceHolder1_LinkButton7")WebElement warningButton1 ;
	public @FindBy(id="HyperlinkAcc")WebElement backButton1  ;
	public @FindBy(id="ContentPlaceHolder1_LinkButton16")WebElement customereditButton  ;
	public @FindBy(xpath="//a[@id=\"ContentPlaceHolder1_lnkSaveAccGroup\"]\r\n"+ "")WebElement updatedButton ;

	

	
	
}
