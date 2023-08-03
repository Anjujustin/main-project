package org.ict.pages;
import java.time.Duration;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
	
	public class login1 {
	    //private static final Duration 400 = null;
		//private static final Duration timeout = null;
	    WebDriver driver;
	    public WebElement userName;
	    public WebElement password;
	    public WebElement login;
	    public WebElement checkboxLabel;
	    public WebElement signup;
	    public WebElement sign;
	    public WebElement profile;
	    public WebElement myProfileLink;
	    public WebElement Editclick ;
	    public login1(WebDriver driver) {
	        this.driver = driver;
	    }
	    
	 /*   public void signup() {
	    	signup=driver.findElement(By.xpath("//a[@href='/login']"));
	    	signup.click();
	    }*/
	    public void setUserName(String testUser) {
	    	userName = driver.findElement(By.name("Username"));
	    	userName.sendKeys(testUser);
	    }

	    public void setPassword(String testPass) {
	    	password = driver.findElement(By.name("pass"));
	    	password.sendKeys(testPass);
	    }
	    public void scroll()
	    {
	    JavascriptExecutor js=(JavascriptExecutor) driver;
		 //  js.executeScript("window.scrollBy(0,document.body.scrollHeight");
	    js.executeScript("window.scrollBy(10,300)"); 
	    //System.out.println("sss");
	    }
			// TODO Auto-generated method stub
	    public void scrollup()
	    {
	    JavascriptExecutor js=(JavascriptExecutor) driver;
		 //  js.executeScript("window.scrollBy(0,document.body.scrollHeight");
	    js.executeScript("window.scrollBy(10,-1200)"); 
	    //System.out.println("sss");
	    }
		
	    public void selectcheckbox() throws InterruptedException
		   {
	    	WebElement element1 = driver.findElement(By.cssSelector("input#checkbox[name='checkbox']"));
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", element1);
			
	    	
			
	    	//checkboxLabel=driver.findElement(By.xpath("//label[@class='label-checkbox100']"));
		///	Thread.sleep(400, 400);
	    	//WebDriverWait wait= (new WebDriverWait(driver, 5));
	    	//wait.until(ExpectedConditions . elementToBeClickable (checkboxLabel)));
	    //	System.out.println("aa");
	    	// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
	        //    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(1000));

			//if(!checkboxLabel.isSelected())
				//{
					//checkboxLabel.click() ;
				//}
			// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		   }
	   
	    public void loginclick() {
	        login= driver.findElement(By.xpath("//button[normalize-space()='Login']"));
	        
	        login.sendKeys(Keys.ENTER);
	        
	    }
	    public void w() {
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
	    }
	    public void clickMyProfileLink() {
			myProfileLink = driver.findElement(By.xpath("//a[text()='My Profile']"));
			JavascriptExecutor  js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView;", myProfileLink);
			js.executeScript("arguments[0].click();", myProfileLink);
		}
	    public void clickEdit() {
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
			Editclick = driver.findElement(By.xpath("//a[text()='Edit Profile']"));
			JavascriptExecutor  js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView;", Editclick);
			js.executeScript("arguments[0].click();", Editclick);
		}

		
	}
