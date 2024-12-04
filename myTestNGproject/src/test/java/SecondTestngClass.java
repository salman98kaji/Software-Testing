import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SecondTestngClass {

    WebDriver driver;

    @BeforeTest
    public void prepare() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        Thread.sleep(3000);
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void openBrowser() throws InterruptedException {
        System.out.println("openning browser");
        driver.navigate().to("https://www.facebook.com");
        Thread.sleep(3000);
    }
    @Test
    public void signUp(){
        System.out.println("Sighning up");
    }
    @Test
    public void login(){
        System.out.println("Logging in");
    }
    @Test
    public void addToCart(){
        System.out.println("added to cart");
    }
    @Test
    public void chekcout(){
        System.out.println("Checking out");
    }
}
