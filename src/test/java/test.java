import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test {
WebDriver driver;
@Test
public void init(){
    WebDriverManager.chromedriver().setup();
    driver  =new ChromeDriver();
    driver.get("https://fb.com");
}
}
