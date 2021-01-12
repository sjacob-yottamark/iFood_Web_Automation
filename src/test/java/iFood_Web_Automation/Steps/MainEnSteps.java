package iFood_Web_Automation.Steps;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MainEnSteps {
	
	WebDriver driver;
	Actions action; //= new Actions(driver);
	
	@Before()
	public void setup() throws Exception {
		//System.setProperty("webdriver.chrome.driver", "//Users//sjacob//Development//2020//iFoods_Automation//HM_Portal_Automation//src//test//java//HM_Portal_Automation//resources//chromedriver 4");
		System.setProperty("webdriver.chrome.driver", "//Users//sjacob//drivers//chromedriver");
		this.driver = new ChromeDriver();
		this.action = new Actions(driver);
		//this.driver = new FirefoxDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);	
	}
	
	  @After() public void teardown() { driver.manage().deleteAllCookies();
	  driver.close(); driver.quit(); }
	 
	// New Tab
	  
	@Given("^User navigates to iFood toolbox for new tab$")
	public void user_navigates_to_iFood_toolbox_for_new_tab() throws Throwable {
		driver.get("https://test.ifooddecisionsciences.com:8443/TOOLBOXPhI/index.jsp");   
	}

	@Then("^User enters the username as \"([^\"]*)\" for new tab$")
	public void user_enters_the_username_as_for_new_tab(String username) throws Throwable  {
		driver.findElement(By.id("edit-name")).sendKeys(username); 
			
	}

	 @Then("^User enters the password as \"([^\"]*)\" for new tab$")
	public void user_enters_the_password_as_for_new_tab(String password) throws Throwable  {
		driver.findElement(By.id("edit-pass")).sendKeys(password);

	}

	 @Then("^User clicks on the sign in button for new tab$")
	 public void user_clicks_on_the_sign_in_button_for_new_tab() throws Throwable  {
		 driver.findElement(By.id("edit-submit")).click();
		 Thread.sleep(2000);
		 //WebElement newtext = driver.findElement(By.xpath("//h5[contains(text(), ' Field')]")); 
		 //Assert.assertEquals(true, newtext.isDisplayed()); 

	 }

	 @Then("^User should be taken to the successful login page for new tab$")
	 public void user_should_be_taken_to_the_successful_login_page_for_new_tab() throws Throwable {
		 Thread.sleep(2000);
		 System.out.println("Successful login page for New Tab");
	 }

	 @Then("^User clicks on the new tab$")
	 public void user_clicks_on_the_new_tab() throws Throwable {
		 driver.findElement(By.id("addNewLogs")).click();
		 System.out.println("Click on the new tab");
		 Thread.sleep(2000);
	 }
	 
	 @Then("^User enters \"([^\"]*)\" in search input$")
	 public void user_enters_in_search_input(String search) throws Throwable {
		 driver.findElement(By.id("searchText")).sendKeys(search);
		 System.out.println("Entered " + search + " for Search criteria");
	 }

	 @Then("^User clicks the search button$")
	 public void user_clicks_the_search_button() throws Throwable {
		 driver.findElement(By.id("searchItems")).click();
		 System.out.println("Click Search");
		 Thread.sleep(10000);
	 }
	 
	 @Then("^User clicks \"([^\"]*)\" link$")
	 public void user_clicks_link(String searchtxt) throws Throwable {
		 driver.findElement(By.linkText(searchtxt)).click();
		 System.out.println("Click " + searchtxt);
		 Thread.sleep(2000);
		 //WebElement newtext = driver.findElement(By.xpath("//h5[contains(text(), ' Field')]")); 
		 //Assert.assertEquals(true, newtext.isDisplayed()); 
	 }
	 
	 
	 @Then("^User mouseover on \"([^\"]*)\" link$")
	 public void user_mouseover_on_link(String submenu) throws Throwable {
	     // clicking on the popup submenu
		 WebElement submenutxt = driver.findElement(By.linkText(submenu));
		 action.moveToElement(submenutxt).build().perform();
		 System.out.println("MouseOver on " + submenu);
		 //List<WebElement> subsubmenu = submenutxt.findElements(By.tagName("a"));
		 //List<WebElement> subsubmenu = submenutxt.findElements(By.id("eraAssessSubMenu")); 
		 //System.out.println("Number of SubSubMenu " + subsubmenu.size());
		 //for(WebElement menu: subsubmenu) {
		 //	 System.out.println(menu.getText());
		 //}
		 
		 Thread.sleep(3000);
	        
	 }
	 
	 @Then("^User clicks Conduct Assessment link$")
	 public void user_clicks_Conduct_Assessment_link() throws Throwable {
		 driver.findElement(By.linkText("Conduct Assessment")).click();
		 System.out.println("Clicked Conduct Assessment");
		 Thread.sleep(3000);
	     
	 }
	 
	 @Then("^User Selects \"([^\"]*)\" from assessment type dropdown$")
	 public void user_Selects_from_assessment_type_dropdown(String arg1) throws Throwable {
		 WebElement assessmentype = driver.findElement(By.id("assessType"));
		 Select sel = new Select(assessmentype);
		 //sel.selectByIndex(3);
		 //sel.deselectByVisibleText("Daily Harvest");
		 sel.selectByValue("Daily-harvest");
		 
		 //List<WebElement> options = sel.getOptions();
		 //int size = options.size();
		 
		 //for (int i=0; i<size; i++) {
			 //String optionName = options.get(i).getText();
			 //System.out.println(optionName);
		 //}
		 
		 
	 }
	 
	 @Then("^User clicks on Review Assessments link$")
	 public void user_clicks_on_Review_Assessments_link() throws Throwable {
		 driver.findElement(By.linkText("Review Assessments")).click();
		 System.out.println("Clicked Review Assessments");
		 Thread.sleep(3000);
	 }
	 
	 @Then("^User clicks on View Assessment Reports link$")
	 public void user_clicks_on_View_Assessment_Reports_link() throws Throwable {
		 driver.findElement(By.linkText("View Assessment Reports")).click();
		 System.out.println("Clicked View Assessment Reports");
		 Thread.sleep(3000);
	 }



	  //Review Tab
	  
	  @Given("^User navigates to iFood toolbox for review tab$")
	  public void user_navigates_to_iFood_toolbox_for_review_tab() throws Throwable {
		  driver.get("https://test.ifooddecisionsciences.com:8443/TOOLBOXPhI/index.jsp");   
	  }

	  @Then("^User enters the username as \"([^\"]*)\" for review tab$")
	  public void user_enters_the_username_as_for_review_tab(String username) throws Throwable  {
		driver.findElement(By.id("edit-name")).sendKeys(username); 
		//driver.findElement(By.xpath(".//*[@id='user_email']")).sendKeys("dev@yottamark.com");
	  }

	  @Then("^User enters the password as \"([^\"]*)\" for review tab$")
	  public void user_enters_the_password_as_for_review_tab(String password) throws Throwable  {
		  driver.findElement(By.id("edit-pass")).sendKeys(password);
		  //driver.findElement(By.xpath(".//*[@id='user_password']")).sendKeys("bbb123");			     
	  }

	  @Then("^User clicks on the sign in button for review tab$")
	  public void user_clicks_on_the_sign_in_button_for_review_tab() throws Throwable  {
		  driver.findElement(By.id("edit-submit")).click();
		  Thread.sleep(2000);
		  
		  //WebElement Reviewtext = driver.findElement(By.xpath("//h5[contains(text(), ' Field')]")); 
		  //Assert.assertEquals(true, Reviewtext.isDisplayed());   
	  }
	  
	  @Then("^User should be taken to the successful login page for review tab$")
	  public void user_should_be_taken_to_the_successful_login_page_for_review_tab() throws Throwable {
		  Thread.sleep(2000);
		  System.out.println("Successful login page for Review Tab");
	  }

	  @Then("^User clicks on the review tab$")
	  public void user_clicks_on_the_review_tab() throws Throwable {
		  driver.findElement(By.id("reviewLogs")).click();
		  System.out.println("Click on the Review Tab");
		  Thread.sleep(2000);
	  }
	  
	  //Report Tab
	  
	  @Given("^User navigates to iFood toolbox for report tab$")
	  public void user_navigates_to_iFood_toolbox_for_report_tab() throws Throwable {
		  driver.get("https://test.ifooddecisionsciences.com:8443/TOOLBOXPhI/index.jsp");   
	  }

	  @Then("^User enters the username as \"([^\"]*)\" for report tab$")
	  public void user_enters_the_username_as_for_report_tab(String username) throws Throwable  {
		driver.findElement(By.id("edit-name")).sendKeys(username); 
		//driver.findElement(By.xpath(".//*[@id='user_email']")).sendKeys("dev@yottamark.com");
	  }

	  @Then("^User enters the password as \"([^\"]*)\" for report tab$")
	  public void user_enters_the_password_as_for_report_tab(String password) throws Throwable  {
		  driver.findElement(By.id("edit-pass")).sendKeys(password);
		  //driver.findElement(By.xpath(".//*[@id='user_password']")).sendKeys("bbb123");			     
	  }

	  @Then("^User clicks on the sign in button for report tab$")
	  public void user_clicks_on_the_sign_in_button_for_report_tab() throws Throwable  {
		  driver.findElement(By.id("edit-submit")).click();
		  Thread.sleep(2000);
		  
		  //WebElement reporttext = driver.findElement(By.xpath("//h5[contains(text(), ' Field')]")); 
		  //Assert.assertEquals(true, reporttext.isDisplayed());  
	  }

	  @Then("^User should be taken to the successful login page for report tab$")
	  public void user_should_be_taken_to_the_successful_login_page_for_report_tab() throws Throwable {
		  Thread.sleep(2000);
		  System.out.println("Successful login page for Report Tab");
	  }
	  
	  @Then("^User clicks on the report tab$")
	  public void user_clicks_on_the_report_tab() throws Throwable {
		  driver.findElement(By.id("reportLogs")).click();
		  System.out.println("Click on the Report Tab");
		  Thread.sleep(2000);
	  }
	  
	  // Data Tab
	  
	  @Given("^User navigates to iFood toolbox for data tab$")
	  public void user_navigates_to_iFood_toolbox_for_data_tab() throws Throwable {
		  driver.get("https://test.ifooddecisionsciences.com:8443/TOOLBOXPhI/index.jsp");   
	  }

	  @Then("^User enters the username as \"([^\"]*)\" for data tab$")
	  public void user_enters_the_username_as_for_data_tab(String username) throws Throwable  {
		driver.findElement(By.id("edit-name")).sendKeys(username); 
		
	  }

	  @Then("^User enters the password as \"([^\"]*)\" for data tab$")
	  public void user_enters_the_password_as_for_data_tab(String password) throws Throwable  {
		  driver.findElement(By.id("edit-pass")).sendKeys(password);
		  			     
	  }

	  @Then("^User clicks on the sign in button for data tab$")
	  public void user_clicks_on_the_sign_in_button_for_data_tab() throws Throwable  {
		  driver.findElement(By.id("edit-submit")).click();
		  Thread.sleep(2000);
		  //WebElement datatext = driver.findElement(By.xpath("//h5[contains(text(), ' Field')]")); 
		  //Assert.assertEquals(true, datatext.isDisplayed()); 
	   
	  }

	  @Then("^User should be taken to the successful login page for data tab$")
	  public void user_should_be_taken_to_the_successful_login_page_for_data_tab() throws Throwable {
		  Thread.sleep(2000);
		  System.out.println("Successful login page for Data Tab");
	  }
	  
	  @Then("^User clicks on the data tab$")
	  public void user_clicks_on_the_data_tab() throws Throwable {
		  driver.findElement(By.id("dataItems")).click();
		  System.out.println("Click on the data tab");
		  Thread.sleep(2000);
	  }

	// Analytics Tab
	  
	  @Given("^User navigates to iFood toolbox for analytics tab$")
	  public void user_navigates_to_iFood_toolbox_for_analytics_tab() throws Throwable {
		  driver.get("https://test.ifooddecisionsciences.com:8443/TOOLBOXPhI/index.jsp");   
	  }

	  @Then("^User enters the username as \"([^\"]*)\" for analytics tab$")
	  public void user_enters_the_username_as_for_analytics_tab(String username) throws Throwable  {
		  driver.findElement(By.id("edit-name")).sendKeys(username); 

	  }

	  @Then("^User enters the password as \"([^\"]*)\" for analytics tab$")
	  public void user_enters_the_password_as_for_analytics_tab(String password) throws Throwable  {
		  driver.findElement(By.id("edit-pass")).sendKeys(password);

	  }

	  @Then("^User clicks on the sign in button for analytics tab$")
	  public void user_clicks_on_the_sign_in_button_for_analytics_tab() throws Throwable  {
		  driver.findElement(By.id("edit-submit")).click();
		  Thread.sleep(2000);
		  //WebElement analyticstext = driver.findElement(By.xpath("//h5[contains(text(), ' Field')]")); 
		  //Assert.assertEquals(true, analyticstext.isDisplayed()); 

	  }

	  @Then("^User should be taken to the successful login page for analytics tab$")
	  public void user_should_be_taken_to_the_successful_login_page_for_analytics_tab() throws Throwable {
		  Thread.sleep(2000);
		  System.out.println("Successful login page for analytics Tab");
	  }

	  @Then("^User clicks on the analytics tab$")
	  public void user_clicks_on_the_analytics_tab() throws Throwable {
		  driver.findElement(By.id("analyzeData")).click();
		  System.out.println("Click on the Analytics tab");
		  Thread.sleep(2000);
	  }

	// Documents Tab
	  
	  @Given("^User navigates to iFood toolbox for documents tab$")
	  public void user_navigates_to_iFood_toolbox_for_documents_tab() throws Throwable {
		  driver.get("https://test.ifooddecisionsciences.com:8443/TOOLBOXPhI/index.jsp");   
	  }

	  @Then("^User enters the username as \"([^\"]*)\" for documents tab$")
	  public void user_enters_the_username_as_for_documents_tab(String username) throws Throwable  {
		  driver.findElement(By.id("edit-name")).sendKeys(username); 

	  }

	  @Then("^User enters the password as \"([^\"]*)\" for documents tab$")
	  public void user_enters_the_password_as_for_documents_tab(String password) throws Throwable  {
		  driver.findElement(By.id("edit-pass")).sendKeys(password);

	  }

	  @Then("^User clicks on the sign in button for documents tab$")
	  public void user_clicks_on_the_sign_in_button_for_documents_tab() throws Throwable  {
		  driver.findElement(By.id("edit-submit")).click();
		  Thread.sleep(2000);
		  //WebElement documentstext = driver.findElement(By.xpath("//h5[contains(text(), ' Field')]")); 
		  //Assert.assertEquals(true, documentstext.isDisplayed()); 

	  }

	  @Then("^User should be taken to the successful login page for documents tab$")
	  public void user_should_be_taken_to_the_successful_login_page_for_documents_tab() throws Throwable {
		  Thread.sleep(2000);
		  System.out.println("Successful login page for documents Tab");
	  }

	  @Then("^User clicks on the documents tab$")
	  public void user_clicks_on_the_documents_tab() throws Throwable {
		  driver.findElement(By.id("documentItems")).click();
		  System.out.println("Click on the documents tab");
		  Thread.sleep(2000);
	  }

	  //Home Screen
	  @Then("^User clicks on the home screen icon$")
	  public void user_clicks_on_the_home_screen_icon() throws Throwable {
		  //driver.findElement(By.className("goToHomeIcon1")).click();
		  //driver.findElement(By.cssSelector("div#goToHomeIcon")).click();
		  driver.findElement(By.xpath("//*[@id=\"goToHomeIcon\"]/a")).click();
		  
		  System.out.println("Clicked on the Home Screen Icon");
		  Thread.sleep(4000);
	  }

}
