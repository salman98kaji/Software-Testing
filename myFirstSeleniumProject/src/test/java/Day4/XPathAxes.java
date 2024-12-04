package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class XPathAxes {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://money.rediff.com/gainers/bse/daily/groupa");

        //self - Selects the current node
        String text = driver.findElement(By.xpath("//a[normalize-space()='Jai Corp Ltd.']/self::a")).getText();
        System.out.println(text);

        //parent - selects the parent of the current node(always one)
        String text1 = driver.findElement(By.xpath("//a[normalize-space()='Jai Corp Ltd.']/parent::td")).getText();
        System.out.println(text1);

        //Child - selects all children of the current node(oe or many)
        List<WebElement> child = driver.findElements(By.xpath("//a[normalize-space()='Jai Corp Ltd.']/ancestor::tr/child::td"));
        System.out.println("Number of child elements "+child.size());

        //Ancestor - selects all ancestors(parent, grandparent, etc)
        String text2 = driver.findElement(By.xpath("//a[normalize-space()='Jai Corp Ltd.']/ancestor::tr")).getText();
        System.out.println(text2);

        //Descendant - selects all descendants of the current node(children or grandchildren)
        List<WebElement> descendant = driver.findElements(By.xpath("//a[normalize-space()='Jai Corp Ltd.']/ancestor::tr/descendant::*"));
        System.out.println("Number of Descendant are "+descendant.size());

        //Following everything in the document after the closing tag of the current node
        List<WebElement> following = driver.findElements(By.xpath("//a[normalize-space()='Jai Corp Ltd.']/ancestor::tr/following::tr"));
        System.out.println("Following nodes are "+following.size());

        //Following-Sibling - selects all siblings after the current node
        List<WebElement> followingSibling = driver.findElements(By.xpath("//a[normalize-space()='Jai Corp Ltd.']/ancestor::tr/following-sibling::tr"));
        System.out.println("Following sibling are "+followingSibling.size());

        //preceding
        List<WebElement> preceding = driver.findElements(By.xpath("//a[normalize-space()='Jai Corp Ltd.']/ancestor::tr/preceding::tr"));
        System.out.println("Num fo preceding nodes are "+preceding.size());

        //preceding-sibling
        List<WebElement> precedingSiblings = driver.findElements(By.xpath("//a[normalize-space()='Jai Corp Ltd.']/ancestor::tr/preceding-sibling::tr"));
        System.out.println("Preceding-siblings are "+precedingSiblings.size());


        driver.quit();
    }
}
