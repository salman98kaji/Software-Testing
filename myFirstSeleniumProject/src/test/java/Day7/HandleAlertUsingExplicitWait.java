package Day7;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HandleAlertUsingExplicitWait {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(10));//explicit wait declaration

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
        Thread.sleep(5000);

        Alert myAlert = myWait.until(ExpectedConditions.alertIsPresent()); //waits for an alert window to open
        System.out.println(myAlert.getText());
        myAlert.accept();

    }
}
