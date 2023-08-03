package com.testscripts;
import java.io.IOException;
import java.time.Duration;

import org.ict.pages.login1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import orgictkerala.utility.Excelutility2;

	
	    public class testbase1 {
	        WebDriver driver;
			//protected login1 login;

	        @BeforeTest
	       public void setUp() {
	            driver = new ChromeDriver();
	          //  driver.get("http://167.71.226.96/");	           
	            driver.manage().window().maximize();
	         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	         //   driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(1000));

	        }
	    //    @BeforeTest
	        @BeforeMethod
	        public void setUp1() {
	           // driver = new ChromeDriver();
	            driver.get("http://167.71.226.96/login");	           
	          // driver.manage().window().maximize();
	        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        }}
	        
	      /*  public void login() throws InterruptedException, IOException  
	        	{ 
	    		login1 login;
	        	     login = new login1(driver);
	        	   
	        	    String Usernam = Excelutility2.getData(0, 0);
	        		String Passwrd = Excelutility2.getData(0, 1);
	        	    login.setUserName(Usernam);
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
	    }}          /*                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
	        
			//private void Login() {
				// TODO Auto-generated method stub
				
			
	       // {driver=new FirefoxDriver();   
	        //	driver.navigate().to("http://167.71.226.96/editform");
	    
//driver.navigate to
	  /*  @AfterMethod
	        public void close() {
	        driver.quit();
	        }
	        }*/

