package Part1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadMe {

    /*
        1) Navigate to  http://demoqa.com/text-box

        2) Enter full name as "Automation"

        3) Enter Email as "Testing@gmail.com"

        4) Enter Current Address 1 as "Testing Current Address part 1"

        5) Enter Current Address 2 "Testing Current Address part 2"

        6) Click on submit button

        7) Print the name

        8) Print Email is containing the "Testing"

     */


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/bulut/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver(); // this will open the chrome browser
        driver.get("http://demoqa.com/text-box");
        driver.findElement(By.id("userName")).sendKeys("Automation");
        driver.findElement(By.id("userEmail")).sendKeys("Testing@gmail.com");
        driver.findElement(By.id("currentAddress")).sendKeys("Testing Current Address part 1");
        driver.findElement(By.id("permanentAddress")).sendKeys("Testing Current Address part 2");


        driver.findElement(By.id("submit")).click();

        WebElement name = driver.findElement(By.id("name"));
        System.out.println(name.getText());

        WebElement email = driver.findElement(By.id("email"));
        System.out.println(email.getText());
    }
}
