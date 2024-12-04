package Day0;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AutomateBrowsers {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.udemy.com");
        String title = driver.getTitle();
        System.out.println("Title is :"+title);
        Thread.sleep(3000);
        //driver.quit();
        driver.close();
    }
}
