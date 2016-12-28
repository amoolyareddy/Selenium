import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButton {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\testing\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
				
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		int count =driver.findElements(By.xpath("//input[@name='group1']")).size();
		
		for(int i=0;i<count;i++)
		{
			String str=driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
			if(str.equals("Cheese"))
			{
				driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			}
		}
		

	}

}
