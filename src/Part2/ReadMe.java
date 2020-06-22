package Part2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadMe {

    /*
        1) Navigate to https://demo.applitools.com/

        2) Enter the username as "ttechno@gmail.com"

        3) Enter the password as "techno123."

        4) Click on sign in button

        5) Get the following text and print it -->  Your nearest branch closes in: 30m 5s is displayed

        6) Print the URL
     */
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/bulut/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver(); // this will open the chrome browser

        driver.navigate().to("https://demo.applitools.com/");

        // driver.findElement(By.id("username")).sendKeys("ttechno@gmail.com");  this is other way

        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("ttechno@gmail.com");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("techno123.");

        WebElement clickSignIn = driver.findElement(By.id("log-in"));
        clickSignIn.click();

        WebElement headline = driver.findElement(By.id("time"));
        System.out.println(headline.getText());

        String URL = driver.getCurrentUrl();
        System.out.println(URL);
    }
}


