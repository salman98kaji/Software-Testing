package Day7;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HandleAlerts {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

        //1) normal alert with OK button
//        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
//        Thread.sleep(3000);

//        driver.switchTo().alert().accept();       //close the alert window

//        Alert myAlert = driver.switchTo().alert(); //to get any text from the alert window
//        System.out.println(myAlert.getText());
//        myAlert.accept();

        //2) Confirmation alert
//        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
//        Thread.sleep(3000);
//
//        driver.switchTo().alert().accept();        //closes the alert with OK
//        driver.switchTo().alert().dismiss();       //closes the alert with cancel
//        System.out.println(driver.switchTo().alert().getText());

        //3) Prompt alert
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
        Alert myprompt = driver.switchTo().alert();
        myprompt.sendKeys("Welcome");
        Thread.sleep(3000);
        myprompt.accept();

        //driver.quit();
    }
}
