package com.testscripts;
import java.io.IOException;

import org.ict.pages.Edit;
import org.openqa.selenium.By;
//import org.ict.pages.Edit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import orgict.constants.Expectedconstant;
//import orgict.pages.Edit;
//import orgict.utility.Excelutility;
import orgictkerala.utility.Excelutility2;
//import orgictkerala.utility.Excelutility2;

//import orgictkerala.utility.Excelutility2;

public class testEditclass {
	
	//import orgictkerala.utility.Excelutility2;

	//import orgictkerala.utility.Excelutility2;

	public class Editclass {
		public class testEditclass1 extends testbase1 {
		    //private static final String Passwrd = null;
			Edit Ed;
		    
			

		@Test
		public void Edittitle() throws IOException, InterruptedException 
		{
		    Ed = new Edit(driver);
		   String actualtitle=Ed.gettitle();
		 //  System.out.println(actual);
		   Assert.assertEquals(actualtitle, Expectedconstant.Expectedtitle);
		  // driver.close();
		}
		@Test
		public void Fullname()throws IOException, InterruptedException {
			 Ed = new Edit(driver);
			String Fullname = Excelutility2.getData(1, 0);
			
			Ed.setFullname(Fullname);
			WebElement name=driver.findElement(By.id("name"));
			String actualname=name.getAttribute("value");
			Assert.assertEquals(actualname, Expectedconstant.Expectedname);
		}
		@Test
		public void Emailid()throws IOException, InterruptedException {
			 Ed = new Edit(driver);
			String Emailid= Excelutility2.getData(2, 0);
			
			Ed.setEmailid(Emailid);
			WebElement Email=driver.findElement(By.name("email_id"));
			String actualEmailid=Email.getAttribute("value");
			Assert.assertEquals(actualEmailid, Expectedconstant.ExpectedEmail);
		
		}//@Test
		/*public void phonenumber()throws IOException, InterruptedException {
			 Ed = new Editpage(driver);
			CharSequence[] phoneno= Excelutility.getData(2, 0);
			
			Ed.setphonenumber(phoneno);
			//WebElement phone=driver.findElement(By.name("phone"));
			// String actualphone = phone.getText();
		//	Assert.assertEquals(actualphone, Expectedconstants.Expectedphone);	
	}*/
	}}

}
