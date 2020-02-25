
package login;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Login1 {
public static void main(String[] args) {

WebDriver driver = new FirefoxDriver();     
driver.get("stgclient.vetty.co/client/login");  // Navigate to URL
  
driver.manage().window().maximize(); // Maximize the window.// 
driver.findElement(By.id("email")).sendKeys("vijay@tweeny.in");// Enter UserName	
driver.findElement(By.id("ssn")).sendKeys("123456");// Enter Password

driver.findElement(By.xpath("//button[contains(text(),'Log In')]")).click();// Click on 'Sign In' button

driver.findElement(By.xpath("//a[contains(text(),'New Candidate')]")).click();

driver.findElement(By.id("firstname")).sendKeys("madhavi");

driver.findElement(By.id("lastname")).sendKeys("kadam");

driver.findElement(By.id("email")).sendKeys("abc123@vdi.com");
Select drpCountry = new Select(driver.findElement(By.formcontrolname("selectedPackage")));
 drpCountry.selectByVisileText("Test");
driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
driver.close();
}
}
