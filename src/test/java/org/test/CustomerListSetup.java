package org.test;

import org.testng.annotations.Test;
import org.utility.Base;
import org.utility.PropertyFileReader;

public class CustomerListSetup extends Base{
//	@Test
//	public void TC01() {
//		PropertyFileReader.propertyRead();
//		String LoginID=PropertyFileReader.propertymap.get("loginid");
//		String Password=PropertyFileReader.propertymap.get("password");
//		loginaction.login(LoginID, Password);
//		customerlistactions.cs01(wb);
//	}
//	@Test
//	public void TC02() {
//		PropertyFileReader.propertyRead();
//		String LoginID=PropertyFileReader.propertymap.get("loginid");
//		String Password=PropertyFileReader.propertymap.get("password");
//		loginaction.login(LoginID, Password);
//		customerlistactions.cs02(wb);
//	}
////	
//	@Test
//	public void TC03() {
//		PropertyFileReader.propertyRead();
//		String LoginID=PropertyFileReader.propertymap.get("loginid");
//		String Password=PropertyFileReader.propertymap.get("password");
//		String cusid=PropertyFileReader.propertymap.get("CustomerId");
//		String cusnam=PropertyFileReader.propertymap.get("CustomerName");
//		loginaction.login(LoginID, Password);
//		customerlistactions.cs03(wb,cusid,cusnam);
//	}
//	
//	@Test
//	public void TC04() {
//		PropertyFileReader.propertyRead();
//		String LoginID=PropertyFileReader.propertymap.get("loginid");
//		String Password=PropertyFileReader.propertymap.get("password");
//		String cusid=PropertyFileReader.propertymap.get("CustomerId");
//		String cusnam=PropertyFileReader.propertymap.get("CustomerName");
//		String monthlypay=PropertyFileReader.propertymap.get("MothlyPyment");
//		String totalyear=PropertyFileReader.propertymap.get("TotalYears");
//		String escala=PropertyFileReader.propertymap.get("Escalation");
//		String totalconamount=PropertyFileReader.propertymap.get("TotalContractAmount");
//		String ph=PropertyFileReader.propertymap.get("PhoneNumber");
//		String em=PropertyFileReader.propertymap.get("Email");
//		loginaction.login(LoginID, Password);
//		customerlistactions.cs04(wb,cusid,cusnam,monthlypay,totalyear,escala,totalconamount,ph,em);
//		
//}
	
//	@Test
//	public void TC05() {
//		PropertyFileReader.propertyRead();
//		String LoginID=PropertyFileReader.propertymap.get("loginid");
//		String Password=PropertyFileReader.propertymap.get("password");
//		loginaction.login(LoginID, Password);
//		customerlistactions.cs05(wb);
//}
//	@Test
//	public void TC06() {
//		PropertyFileReader.propertyRead();
//		String LoginID=PropertyFileReader.propertymap.get("loginid");
//		String Password=PropertyFileReader.propertymap.get("password");
//		loginaction.login(LoginID, Password);
//		customerlistactions.cs06(wb);
////}
//	@Test
//	public void TC07() {
//		PropertyFileReader.propertyRead();
//		String LoginID=PropertyFileReader.propertymap.get("loginid");
//		String Password=PropertyFileReader.propertymap.get("password");
//		String port=PropertyFileReader.propertymap.get("portfolio");
//		loginaction.login(LoginID, Password);
//		customerlistactions.cs07(wb,port);
//}
	
//	@Test
//	public void TC08() {
//		PropertyFileReader.propertyRead();
//		String LoginID=PropertyFileReader.propertymap.get("loginid");
//		String Password=PropertyFileReader.propertymap.get("password");
//		String port=PropertyFileReader.propertymap.get("portfolio");
//		loginaction.login(LoginID, Password);
//		customerlistactions.cs08(wb,port);
//}
	
//	@Test
//	public void TC09() {
//		PropertyFileReader.propertyRead();
//		String LoginID=PropertyFileReader.propertymap.get("loginid");
//		String Password=PropertyFileReader.propertymap.get("password");
//		loginaction.login(LoginID, Password);
//		customerlistactions.cs09(wb);
//}
//	
//	@Test
//	public void TC10() {
//		PropertyFileReader.propertyRead();
//		String LoginID=PropertyFileReader.propertymap.get("loginid");
//		String Password=PropertyFileReader.propertymap.get("password");
//		loginaction.login(LoginID, Password);
//		customerlistactions.cs10(wb);
//}
//	@Test
//	public void TC11() {
//		PropertyFileReader.propertyRead();
//		String LoginID=PropertyFileReader.propertymap.get("loginid");
//		String Password=PropertyFileReader.propertymap.get("password");
//		loginaction.login(LoginID, Password);
//		customerlistactions.cs11(wb);
//}
	
	@Test
	public void TC12() {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String cusid=PropertyFileReader.propertymap.get("CustomerId");
		String cusnam=PropertyFileReader.propertymap.get("CustomerName");
		String monthlypay=PropertyFileReader.propertymap.get("MothlyPyment");
		String totalyear=PropertyFileReader.propertymap.get("TotalYears");
		String escala=PropertyFileReader.propertymap.get("Escalation");
		String totalconamount=PropertyFileReader.propertymap.get("TotalContractAmount");
		String ph=PropertyFileReader.propertymap.get("PhoneNumber");
		String em=PropertyFileReader.propertymap.get("Email");
		loginaction.login(LoginID, Password);
		customerlistactions.cs12(wb,cusid,cusnam,monthlypay,totalyear,escala,totalconamount,ph,em);
		
}
}




