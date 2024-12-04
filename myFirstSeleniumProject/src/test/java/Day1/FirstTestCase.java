package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FirstTestCase {
    public static void main(String[] args) throws InterruptedException {
        //EdgeDriver driver = new EdgeDriver();
        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.opencart.com/");
        String title = driver.getTitle();
        if(title.equals("Your Store")){
            System.out.println("Test passed");
        }else{
            System.out.println("Test failed");
        }
        Thread.sleep(3000);
        driver.quit();
    }
}
