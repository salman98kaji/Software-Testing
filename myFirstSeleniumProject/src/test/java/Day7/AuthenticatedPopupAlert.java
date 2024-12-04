package Day7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AuthenticatedPopupAlert {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        //driver.get("https://the-internet.herokuapp.com/basic_auth");

        //syntax= http://username:password@url
        //inject the username and password with the URL
        driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
    }
}
