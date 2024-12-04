package Day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.w3c.dom.stylesheets.LinkStyle;

import java.time.Duration;
import java.util.List;

public class SelectDropdown {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/2018/09/automation-form.html");

        WebElement dropCountryElem = driver.findElement(By.xpath("//select[@id='country']"));
        Select drpCntry = new Select(dropCountryElem);

        //select options from the dropdown
//        drpCntry.selectByVisibleText("France");
//        drpCntry.selectByValue("france");

        //capture the options from the dropdown
        List<WebElement> options = drpCntry.getOptions();
        System.out.println("Number of options in the dropdown: "+options.size());

        //print options
        for(int i=0; i<options.size(); i++){
            System.out.println(options.get(i).getText());
        }

        driver.quit();

    }
}
