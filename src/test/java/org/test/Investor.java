package org.test;

import org.testng.annotations.Test;
import org.utility.Base;
import org.utility.PropertyFileReader;

public class Investor extends Base {

	@Test
	public void TC01() {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		investoractions.inv01(wb);

	}
	@Test
	public void TC02() {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String Invname=PropertyFileReader.propertymap.get("InvestorName");
		loginaction.login(LoginID, Password);
		investoractions.inv02(wb,Invname);

	}
	@Test
	public void TC03() {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String Invname=PropertyFileReader.propertymap.get("InvestorName");
		loginaction.login(LoginID, Password);
		investoractions.inv03(wb,Invname);

	}
	@Test
	public void TC04() {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String Invname=PropertyFileReader.propertymap.get("InvestorName");
		loginaction.login(LoginID, Password);
		investoractions.inv04(wb,Invname);

	}
	@Test
	public void TC05() {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String Invname=PropertyFileReader.propertymap.get("InvestorName");
		loginaction.login(LoginID, Password);
		investoractions.inv05(wb,Invname);

	}
	@Test
	public void TC06() {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String Invname=PropertyFileReader.propertymap.get("InvestorName");
		loginaction.login(LoginID, Password);
		investoractions.inv06(wb,Invname);

	}
	@Test
	public void TC07() {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String Invname=PropertyFileReader.propertymap.get("InvestorName");
		loginaction.login(LoginID, Password);
		investoractions.inv07(wb,Invname);

	}
	@Test
	public void TC08() {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String Invname=PropertyFileReader.propertymap.get("InvestorName");
		loginaction.login(LoginID, Password);
		investoractions.inv08(wb,Invname);

	}
	@Test
	public void TC09() throws InterruptedException {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String tranamt=PropertyFileReader.propertymap.get("TransactionAmt");
		loginaction.login(LoginID, Password);
		investoractions.inv09(wb,tranamt);

	}
	@Test
	public void TC10() throws InterruptedException {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String tranamt=PropertyFileReader.propertymap.get("TransactionAmt");
		loginaction.login(LoginID, Password);
		investoractions.inv10(wb,tranamt);

	}
	@Test
	public void TC11() throws InterruptedException {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String tranamt=PropertyFileReader.propertymap.get("TransactionAmt");
		String transdate =PropertyFileReader.propertymap.get("Transactiondate");
		loginaction.login(LoginID, Password);
		investoractions.inv11(wb,tranamt,transdate);

	}

	@Test
	public void TC12() throws InterruptedException {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		investoractions.inv12(wb);


	}


	@Test
	public void TC13() throws InterruptedException {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		investoractions.inv13(wb);


	}
	@Test
	public void TC14() throws InterruptedException {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		investoractions.inv14(wb);


	}

	@Test
	public void TC15() throws InterruptedException {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		investoractions.inv15(wb);

	}

	@Test
	public void TC16() throws InterruptedException {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		investoractions.inv16(wb);
	}
	@Test
	public void TC17() throws InterruptedException {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		investoractions.inv17(wb);
	}
	@Test
	public void TC18() throws InterruptedException {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String username=PropertyFileReader.propertymap.get("UserName1");
		String userlastnam=PropertyFileReader.propertymap.get("userlastName");
		loginaction.login(LoginID, Password);
		investoractions.inv18(wb,username,userlastnam);

	}
	@Test
	public void TC19() throws InterruptedException {
		PropertyFileReader.propertyRead();
		String creemail=PropertyFileReader.propertymap.get("UserCredentialsEmail");
		String crePassword=PropertyFileReader.propertymap.get("UserCredentialsPassword");
		loginaction.login(creemail, crePassword);
		investoractions.inv19(wb);

}
}
