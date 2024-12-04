package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Set;

public class GetMethods {
//  Get method works on the web pages not on the web-elements.
//  We can access these methods through web-driver instance.

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(3000);
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());                     //returns the source code of the page
        System.out.println("Window ID :"+ driver.getWindowHandle());    //returns the id of the single browser window
        driver.findElement(By.linkText("OrangeHRM, Inc")).click();
        Set<String> windows = driver.getWindowHandles();
        System.out.println(windows);

        driver.quit();
    }
}
