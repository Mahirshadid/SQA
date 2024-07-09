package testcase1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;

public class firstTestCase {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver(); //browser
		driver.get("https://www.codechef.com/");
		String actual_title = driver.getTitle();
		
		if(actual_title.equals("CodeChef")) {
			System.out.println("Test Passed : "+ actual_title);
		}else {
			System.out.println("Test Failed : "+ actual_title);
		}
		
		driver.close();
		
		

	}

}
