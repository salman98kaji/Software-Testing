package Day0;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("https://www.google.com");
        String windHandl = driver.getWindowHandle();
        System.out.println(windHandl);
//        String gglepageSor = driver.getPageSource();
//        System.out.println(gglepageSor);
//        String googleTitle = driver.getTitle();
//        System.out.println("The title is :"+googleTitle);
//        driver.navigate().to("https://www.udemy.com");
//        String udemyUrl = driver.getCurrentUrl();
//        System.out.println("The udemy url is : "+udemyUrl);
//        String udemyTitle = driver.getTitle();
//        System.out.println("Udemy title is :"+udemyTitle);
//        driver.navigate().back();
//        driver.getCurrentUrl();
//        String googleUrl = driver.getCurrentUrl();
//        System.out.println("Google url is: " +googleUrl);
//        //driver.manage().window().maximize();
//        driver.navigate().refresh();
//        driver.navigate().forward();
//        Thread.sleep(3000);
        driver.quit();
    }
}
