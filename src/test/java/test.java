import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
     public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\rodro\\Desktop\\Monday\\first-app\\src\\driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
       System.out.println(driver.getTitle());

       driver.findElement(By.name("q")).sendKeys("Obama");
       driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).sendKeys(Keys.ENTER);
       Thread.sleep(2000);
       driver.quit();



    }
}
