package jenkinsdemo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class JenkinsDemo 
{
	@Test
	public void testgooglesearch()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//This will open the google page
		driver.get("http://google.in"); 
		
		//We expect the title “Google “ should be present 
		String Expectedtitle = "Google";
		
		//This will fetch the actual title 
		String Actualtitle = driver.getTitle();
		System.out.println("Before Assetion " + Expectedtitle + " " + Actualtitle);
		
		//This will compare actual title and expected title
		assertEquals(Actualtitle, Expectedtitle);
		
		//print out the result
		System.out.println("After Assertion " + Expectedtitle + " " + Actualtitle + " Title matched ");
		
		//Close Browser and quit
		driver.close();
		//driver.quit();
	 }
}
