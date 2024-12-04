package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CssSelector {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        //tag id                    tag#id
//        driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T shirts");
//        driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("iphone");

        //tag class                 tag.classname
//        driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("hello");
//        driver.findElement(By.cssSelector(".search-box-text")).sendKeys("hello");

        //tag attribute             tag[attribute="value"]
//        driver.findElement(By.cssSelector("input[name='q']")).sendKeys("bye");
//        driver.findElement(By.cssSelector("[name='q']")).sendKeys("bye");

        //tag class attribute       tag.classname[attribute="value"]
//        driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("yooo");

    }
}
