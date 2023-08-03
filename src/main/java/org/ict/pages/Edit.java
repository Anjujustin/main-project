package org.ict.pages;
import java.nio.charset.Charset;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Edit {
	
		//public WebElement Fullname;
		//public WebElement Emailid;
		public WebDriver driver;
		public WebElement phonenumber;
		public WebElement Gender;
		public Edit(WebDriver driver)
		{
	        this.driver = driver;
	    }
		public String gettitle() {
			String title;
			title= driver.getTitle();
			
			return title;
		}
		 public void up()
		    {
		    JavascriptExecutor je=(JavascriptExecutor) driver;
			 //  js.executeScript("window.scrollBy(0,document.body.scrollHeight");
		    je.executeScript("window.scrollBy(10,-1200)"); 
		    //System.out.println("sss");
		    }
		public String setFullname() {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement Fullname=driver.findElement(By.id("name"));
			js.executeScript("arguments[0].scrollIntoView(true);",Fullname);
			String name=Fullname.getAttribute("value");
			return	name;
			//Fullname.getCurrenturl
			//String Fullname = .getAttribute("value");
			//Fullname.getText();
			//return Fullname;
		}
		 public String SetDOBMonth()
		 { 
			 JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement DOBMonth=driver.findElement(By.xpath("//input[@id='date']"));
		js.executeScript("arguments[0].scrollIntoView(true);",DOBMonth);
		String Date=DOBMonth.getAttribute("value");
		return	 Date;
		 }
		public String setEmailid() {
		//String	Emailid = driver.findElement(By.id("email_id")).getAttribute("value");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Emailid=driver.findElement(By.xpath("//input[@name='email_id']"));
		js.executeScript("arguments[0].scrollIntoView(true);",Emailid);
		String Email=Emailid.getAttribute("value");
		return	 Email;
	}
		public String setphonenumber() {

			 JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement phone=driver.findElement(By.xpath("//input[@name='phone']"));
		js.executeScript("arguments[0].scrollIntoView(true);",phone);
		String Ephone=phone.getAttribute("value");
		return	 Ephone;
		}
//		}
	/*	 public void SetGender()
		 {
			 Gender=driver.findElement(By.xpath("/html/body/app-root/app-editprofile/div/form/p[4]/text()[1]"));
			 JavascriptExecutor  js = (JavascriptExecutor)driver;
				js.executeScript("arguments[0].scrollIntoView;", Gender);
				js.executeScript("arguments[0].click();", Gender);
			Gender.click();		 				 
		 }*/ 
		public String sethighschoolboard() {

			 JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement board=driver.findElement(By.xpath("//select[@id='edu_title']"));
		js.executeScript("arguments[0].scrollIntoView(true);",board);
		String boardhg=board.getAttribute("value");
		return	 boardhg;
		}
		}


