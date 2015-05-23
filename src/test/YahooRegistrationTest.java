package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class YahooRegistrationTest {

	@Test(dataProvider="registerData")
	public void testRegister(String userName, String password, String email, String city){
		
		System.out.println(userName+"--"+password+"--"+email+"--"+city);
	}
	
	@DataProvider
	public Object[][] registerData(){
		Object[][] data = new Object[3][4];
		
		//first row
		data[0][0]="user1";
		data[0][1]="Pass1";
		data[0][2]="email1";
		data[0][3]="city1";
		
		//first row
		data[1][0]="user2";
		data[1][1]="Pass2";
		data[1][2]="email2";
		data[1][3]="city2";
		
		//third row
		data[2][0]="user3";
		data[2][1]="Pass3";
		data[2][2]="email3";
		data[2][3]="city3";
		
		return data;
	}

}
