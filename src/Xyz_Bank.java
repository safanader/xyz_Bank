import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xyz_Bank {

	public static void main(String[] args) {
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[2]/button")).click();
		
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/button[1]")).click();
	
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input")).sendKeys("safa");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[2]/input")).sendKeys("Hiamour");
		
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[3]/input")).sendKeys("123cba");
		
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/button")).click();
		
		driver.switchTo().alert().accept();
		
		driver.navigate().back();
		driver.navigate().back();
		
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[1]/button")).click();
		WebElement element= driver.findElement(By.xpath("//*[@id=\"userSelect\"]"));
		 Select option = new Select(element);
			option.selectByVisibleText("safa Hiamour");
			driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/button")).click();
	WebElement mylist = driver.findElement(By.xpath("//*[@id=\"userSelect\"]"));
		Select option1 =new Select(mylist);
	option1.selectByIndex(6);
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/button")).click();
		
	}}
