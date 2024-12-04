package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class Locators {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();
//        driver.findElement(By.name("search")).sendKeys("mac");
//        boolean display = driver.findElement(By.id("logo")).isDisplayed();
//        System.out.println(display);
//        driver.findElement(By.linkText("Laptops & Notebooks")).click();
//        Thread.sleep(3000);
        //driver.findElement(By.partialLinkText("Phones")).click();

//        List<WebElement> totalElem = driver.findElements(By.className("list-inline-item"));
//        System.out.println(totalElem.size());

//        List<WebElement> links=driver.findElements(By.tagName("a"));
//        System.out.println(links.size());

        List<WebElement> image = driver.findElements(By.tagName("img"));
        System.out.println(image.size());

        Thread.sleep(3000);
        driver.quit();

    }
}
