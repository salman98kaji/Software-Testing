package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XPath {
//    XPath is an address of the element
//    DOM Document Object Model
//    2 types of XPath:-
//    1) Absolute XPath (Full path) = /html/body/header/div/div/div[2]/div/input
//    2) Relative XPath (Partial XPath) = //*[@id="search"]/input
//    Absolute XPath Starts with /  -->represents root node
//    Relative XPath starts with //
//    Absolute Xpath don't use attribute Relative XPath does use attribute.
//    Absolute Xpath traverse through each node till it finds the element.
//    Relative XPath directly jumps and find element by using the attribute.
//    Relative XPath is preferred over absolute XPath.
//    Relative XPath 1) Automatically -Devtools, Selectorshub 2) Manually
//    Syntax => //tagname[@attribute='value']  or  //*[@attribute='value']
//    <a href="https://xyz.com"> Click me </a>      linkText-Yes, inner text-Yes
//    <div>CLick me</div>                           linkText-No, inner text-Yes



    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();

        //XPath with single attribute
//        driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("mobile");

        //XPath with multiple attribute
//        driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("hello");

        //XPath with 'and', 'or' operators
//        driver.findElement(By.xpath("//input[@name='search' and @placeholder='Search']")).sendKeys("Tshirts");
//        driver.findElement(By.xpath("//input[@name='search' or @placeholder='Sech']")).sendKeys("Tshirts");

        //XPath with inner text()
//        boolean present = driver.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed();
//        System.out.println(present);
//        String value = driver.findElement(By.xpath("//h3[text()='Featured']")).getText();
//        System.out.println(value);

        //XPath with contains(), starts-with()
//        driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("Tshirts");
//        driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("Teasjd");

        //handling dynamic attribute
//        *[@id='start' or @id='stop'], *[contains(@id,'st')], *[starts-with(@id,'st')] - eg for; start stop

        //chained XPath= when we donot find any attribute for the web-element, we go to the parent and use its attribute
//        boolean status = driver.findElement(By.xpath("//div[@id='logo']/a/img")).isDisplayed();
//        System.out.println(status);


    }
}
