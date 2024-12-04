package Day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class HandleCheckboxes {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        //1) Select specific checkbox
//        driver.findElement(By.xpath("//input[@id='sunday']")).click();

        //2) Select all the checkboxes
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));

//        for(int i=0; i<checkboxes.size(); i++){
//            checkboxes.get(i).click();
//        }
//        for(WebElement checkbox : checkboxes){
//            checkbox.click();
//        }

        //select last 3 checkboxes
//        for(int i=4; i<checkboxes.size(); i++){
//            checkboxes.get(i).click();
//        }

        //select first 3 checkboxes
//        for(int i=0;i<3;i++){
//            checkboxes.get(i).click();
//        }

        //unselect checkboxes if they are already selected
        for(int i=0; i<3; i++){
            checkboxes.get(i).click();
        }
        Thread.sleep(5000);
        for(int i=0; i<checkboxes.size(); i++){
            if(checkboxes.get(i).isSelected()){
                checkboxes.get(i).click();
            }
        }
    }
}
