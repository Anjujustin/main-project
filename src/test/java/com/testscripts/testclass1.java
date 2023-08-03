package com.testscripts;
import java.io.IOException;
import java.time.Duration;

import org.ict.pages.login1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import orgict.constants.Expectedconstant;
import orgict.constants.Expectedconstant;

import org.ict.pages.Edit;
import orgictkerala.utility.Excelutility2;



	
	public class testclass1 extends testbase1 {
	    
		Edit Ed;
		//login=new login1(driver);
	@Test(priority=1)
		public void Login() throws  IOException, InterruptedException 
    	{ 
		login1 login;
    	     login = new login1(driver);
    	   
    	    String Username = Excelutility2.getData(0, 0);
    		String Passwrd = Excelutility2.getData(0, 1);
    	    login.setUserName(Username);
    	    Thread.sleep(300);
    	    login.setPassword(Passwrd);
    	    Thread.sleep(300);
    	    login.scroll();
    	    login.selectcheckbox();
    	   Thread.sleep(300);
           login.loginclick();
          Thread.sleep(300);
          // driver.navigate().forward();  
         //  driver.get("http://167.71.226.96/profilehome");
          // login.w();
           
          login.clickMyProfileLink();
          Thread.sleep(300);
          login.clickEdit();
      // login.scrollup();
    	}
    
    
	  @Test(priority=2)
	public void Edittitle() throws IOException, InterruptedException 
	{//login.scroll();
		Ed=new Edit(driver); 
		//Ed.up();
		String actualtitle=Ed.gettitle();
		Assert.assertEquals(actualtitle, Expectedconstant.Expectedtitle);
		Thread.sleep(300);
	}
	 @Test(priority=3)
	 public void name() throws IOException, InterruptedException
	  {
		 login1 login;
 	    login = new login1(driver);
 	   
 	    String Username = Excelutility2.getData(0, 0);
 		String Passwrd = Excelutility2.getData(0, 1);
 	    login.setUserName(Username);
 	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));   
 	    login.setPassword(Passwrd);
 	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));  
 	    login.scroll();
 	    login.selectcheckbox();
 	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));  
        login.loginclick();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));  
       // driver.navigate().forward();  
       // driver.get("http://167.71.226.96/profilehome");
       // login.w();
        
       login.clickMyProfileLink();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));  
       login.clickEdit();
		  Ed=new Edit(driver);
		// String name1=driver.getCurrentUrl();
	//	 System.out.println(name1);
		// Ed.up();
	     // Em=new Edit(driver);
		 Ed.setFullname();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));  
	      // login.clickEdit();
		// WebElement name=driver.findElement(By.id("name"));
			String actualname=Ed.setFullname();
			System.out.println(actualname);
			Assert.assertEquals(actualname, Expectedconstant.Expectedname);
			//Thread.sleep(300);
		}
	/*  @Test(priority=4)
	  public void gendered() throws IOException, InterruptedException
	  {
		 Ed=new Edit(driver);
		 Ed.up();
		 Thread.sleep(300);
		 Ed.SetGender();
	  }*/
@Test(priority =4)
	 public void  Emailid() throws InterruptedException, IOException
	  {login1 login ;
	    login = new login1(driver);
  	   
	    String Username = Excelutility2.getData(0, 0);
		String Passwrd = Excelutility2.getData(0, 1);
	    login.setUserName(Username);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));  
	    login.setPassword(Passwrd);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));  
	    login.scroll();
	    login.selectcheckbox();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));  
	 //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
    login.loginclick();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));  
   // driver.navigate().forward();  
   // driver.get("http://167.71.226.96/profilehome");
   // login.w();
    
   login.clickMyProfileLink();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));  
   login.clickEdit();
	Ed=new Edit(driver);
		 
		 // login = new login1(driver);
		   
		    
		 Ed.setEmailid();
		
			String actualEmail=Ed.setEmailid();
			//System.out.println(actualEmail);
			Assert.assertEquals(actualEmail, Expectedconstant.ExpectedEmail);
		}
  @Test(priority=5)
	public void Date() throws InterruptedException, IOException
	  {login1 login;
	     login = new login1(driver);
  	   
	    String Username = Excelutility2.getData(0, 0);
		String Passwrd = Excelutility2.getData(0, 1);
	    login.setUserName(Username);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));  
	    login.setPassword(Passwrd);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));  
	    login.scroll();
	    login.selectcheckbox();
	   Thread.sleep(300);
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
    login.loginclick();
  // Thread.sleep(300);
   // driver.navigate().forward();  
   // driver.get("http://167.71.226.96/profilehome");
   // login.w();
    
   login.clickMyProfileLink();
   Thread.sleep(300);
   login.clickEdit();
	  Ed=new Edit(driver);
		 Ed.SetDOBMonth();
		// WebElement name=driver.findElement(By.id("name"));
			String actualdate=Ed.SetDOBMonth();
			System.out.println(actualdate);
			Assert.assertEquals(actualdate, Expectedconstant.Expecteddate);
		}
 /* @Test(priority=6)
  public void Hboard() throws InterruptedException, IOException
  {login1 login;
     login = new login1(driver);
	   
    String Username = Excelutility2.getData(0, 0);
	String Passwrd = Excelutility2.getData(0, 1);
    login.setUserName(Username);
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));  
    login.setPassword(Passwrd);
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));  
    login.scroll();
    login.selectcheckbox();
   Thread.sleep(300);
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
login.loginclick();
// Thread.sleep(300);
// driver.navigate().forward();  
// driver.get("http://167.71.226.96/profilehome");
// login.w();

login.clickMyProfileLink();
Thread.sleep(300);
login.clickEdit();
   Ed = new Edit(driver);
	 Ed.sethighschoolboard();
	// WebElement name=driver.findElement(By.id("name"));
		String actualboard=Ed.sethighschoolboard();
		System.out.println(actualboard);
		Assert.assertEquals(actualboard, Expectedconstant.Expectedboard);
	}
  @Test(priority=7)
 	public void phone() throws InterruptedException, IOException
 	  {login1 login;
 	     login = new login1(driver);
   	   
 	    String Username = Excelutility2.getData(0, 0);
 		String Passwrd = Excelutility2.getData(0, 1);
 	    login.setUserName(Username);
 	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));  
 	    login.setPassword(Passwrd);
 	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));  
 	    login.scroll();
 	    login.selectcheckbox();
 	   Thread.sleep(300);
 	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
     login.loginclick();
   // Thread.sleep(300);
    // driver.navigate().forward();  
    // driver.get("http://167.71.226.96/profilehome");
    // login.w();
     
    login.clickMyProfileLink();
    Thread.sleep(300);
    login.clickEdit();
 	  Ed=new Edit(driver);
 		 Ed.setphonenumber();
 		// WebElement name=driver.findElement(By.id("name"));
 			String actualphone=Ed.setphonenumber();
 			System.out.println(actualphone);
 			Assert.assertEquals(actualphone, Expectedconstant.Expectedphone);
 		}*/
	  }
	  
	public void Fullname()
	{
		Ed=new Edit(driver);
				Ed.setFullname();
		Ed.setFullname().clear();
		
	}

