package Day6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class NavigationalCommands {
    public static void main(String[] args) throws MalformedURLException {

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

//        driver.get("https://demo.nopcommerce.com/");   accepts URL only in the string format

        //navigate().to() - internally calls get() method only

        driver.navigate().to("https://demo.nopcommerce.com/");   //can be passed as a string
//        URL myurl = new URL("https://demo.nopcommerce.com/");  //or as an object
//        driver.navigate().to(myurl);

        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());  //https://demo.nopcommerce.com/

        driver.navigate().forward();
        System.out.println(driver.getCurrentUrl());  //https://opensource-demo.orangehrmlive.com/web/index.php/auth/login

        driver.navigate().refresh();


    }
}
