package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserMethods {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
        Thread.sleep(3000);
        driver.close();       //close only one individual window
        driver.quit();       //close all the open browser windows at a time
    }
}
