package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ConditionalMethods {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");

        //isDisplayed()- used for checking static web-elements
        boolean logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
        System.out.println("Display status "+logo);

        //.isEnabled() - used for checking input fields, drop down buttons, radio buttons
        //we can check the enable/disable status of the element/operational element
        boolean input = driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
        System.out.println("Enable status "+input);

        //.isSelected- we can use it to check if the element is selected or not
        WebElement male = driver.findElement(By.xpath("//input[@id='gender-male']"));
        WebElement female = driver.findElement(By.xpath("//input[@id='gender-female']"));
        System.out.println("Before selection: male-"+male.isSelected()+", female-"+female.isSelected());
        //male.click();
        female.click();
        System.out.println("After selection: male-"+male.isSelected()+", female-"+female.isSelected());

        boolean newsteller = driver.findElement(By.xpath("//input[@id='Newsletter']")).isSelected();
        System.out.println("NewsTeller status :"+newsteller);
        driver.quit();


    }
}
