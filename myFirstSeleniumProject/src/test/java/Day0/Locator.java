package Day0;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Locator {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        //driver.get("https://the-internet.herokuapp.com/login");

        //id locator
//        driver.findElement(By.id("username")).sendKeys("tomsmith");
//        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");

        //name locator
//        driver.findElement(By.name("username")).sendKeys("tomsmith");
//        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");

        //linkText locator
//        driver.get("https://the-internet.herokuapp.com/");
//        driver.findElement(By.linkText("Form Authentication")).click();
//        driver.findElement(By.id("username")).sendKeys("tomsmith");
//        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");

        //partial LinkText
//        driver.get("https://the-internet.herokuapp.com/");
//        driver.findElement(By.partialLinkText("JavaScript onload")).click();
//        Thread.sleep(3000);

        driver.findElement(By.className("radius")).click();
        Thread.sleep(3000);
        driver.quit();
        driver.manage().window().maximize();
    }
}
