package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait {
    //explicit wait works based on conditions
    //finding element is inclusive (for some conditions)
    //it will wait for the conditions to be true, then consider the time
    //we need to write multiple statements for multiple elements


    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();

        WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(10)); //declaration

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.manage().window().maximize();

        WebElement textUsername = myWait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
        textUsername.sendKeys("Admin");

        WebElement txtPassword = myWait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
        txtPassword.sendKeys("admin123");

        WebElement loginBtn = myWait.until(ExpectedConditions
                .elementToBeClickable(By.xpath("//button[normalize-space()='Login']")));
        loginBtn.click();

    }
}
