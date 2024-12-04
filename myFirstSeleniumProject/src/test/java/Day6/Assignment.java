package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.List;

public class Assignment {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        //1) provide some string search for it
        driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']"))
                .sendKeys("tshirt");

        //2) count number of links on the browser window
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Number of links are -"+links.size());

        //3) click on each link using for loop
        for(int i=0; i<links.size(); i++){

        // Re-fetch the links to avoid stale element issues
            links = driver.findElements(By.tagName("a"));

            // Ensure the index is still valid after re-fetching
            if (i >= links.size()) {
                System.out.println("Index out of bounds after re-fetching links. Breaking the loop.");
                break;
            }

            WebElement link = links.get(i);
            String linkText = link.getText();
            String linkHref = link.getAttribute("href");

            // Skip links without an href attribute
            if (linkHref == null || linkHref.isEmpty()) {
                System.out.println("Skipping link " + (i + 1) + " as it has no URL.");
                continue;
            }

            // Skip links that are not displayed
            if (!link.isDisplayed()) {
                System.out.println("Skipping link " + (i + 1) + " as it is not visible.");
                continue;
            }

            // Scroll the link into view
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", link);

            System.out.println("Clicking on link: "+(i+1)+" "+linkText+" URL= "+linkHref);

            try{
                link.click();
                driver.navigate().back();

                // Allow time for the page to reload
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            }catch(Exception e){
                System.out.println("Error clicking link " + (i + 1) + ": " + e.getMessage());
                driver.navigate().back();
            }
        }

        driver.quit();
    }
}
