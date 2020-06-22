package Part3;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadMe {

    /*
        1) Navigate to https://www.snapdeal.com/

        2) Search for teddy bear click on search button

        3) Print the following text -->> We've got .... results for 'teddy bear'

        4) Print the URL

        5) Click on logo snepdeal logo

        6) Print the URL

     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/bulut/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver(); // this will open the chrome browser

        driver.get("https://www.snapdeal.com/");

        WebElement search = driver.findElement(By.id("inputValEnter"));
        search.sendKeys("teddy bear");

        WebElement submit = driver.findElement(By.className("searchTextSpan"));
        submit.click();

        Thread.sleep(2000);

        WebElement s1 = driver.findElement(By.className("nnn"));
        System.out.println(s1.getText());

        String URL = driver.getCurrentUrl();
        System.out.println(URL);

        driver.findElement(By.className("notIeLogoHeader")).click();

        String URL2 = driver.getCurrentUrl();
        System.out.println(URL2);
    }

}
