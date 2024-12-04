package Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class HandleFrames {
    //driver.switchTo().frame(name)
    //driver.switchTo().frame(id)
    //driver.switchTo().frame(webElement)
    //driver.switchTo().frame(index)

    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://ui.vision/demo/webtest/frames/");
        driver.manage().window().maximize();

//        Frame 1
        WebElement frame1 = driver.findElement(By.xpath("/html[1]/frameset[1]/frame[1]"));
        driver.switchTo().frame(frame1);
        driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("welcome");

//        Frame 2
//        cannot switch from one frame to another.
//        We need to come out of the present frame to the web page and then switch to the another frame.
        driver.switchTo().defaultContent(); //go back to page

        WebElement frame2 = driver.findElement(By.xpath("//frameset//frameset//frame[1]"));
        driver.switchTo().frame(frame2);
        driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("HEllo");

//        Frame 3
        driver.switchTo().defaultContent();
        WebElement frame3 = driver.findElement(By.xpath("//frameset//frameset//frame[2]"));
        driver.switchTo().frame(frame3);
        driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Java..");

//        inner iframe - part of frame 3
        driver.switchTo().frame(0); //since our driver is in on frame 3, so we can move to iframe through index
        driver.findElement(By.xpath("//div[@id='i9']//div[@class='AB7Lab Id5V1']")).click();

    }
}
