import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTestngClass {

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

    @Test(priority = 0)
    public void openBrowser() throws InterruptedException {
        System.out.println("openning browser");
        driver.navigate().to("https://www.udemy.com");
        Thread.sleep(3000);
    }
    @Test(priority = 1)
    public void signUp(){
        System.out.println("Sighning up");
    }
    @Test(priority = 2)
    public void login(){
        System.out.println("Logging in");
    }
    @Test(priority = 3)
    public void addToCart(){
        System.out.println("added to cart");
    }
    @Test(priority = 4)
    public void chekcout(){
        System.out.println("Checking out");
    }
}
