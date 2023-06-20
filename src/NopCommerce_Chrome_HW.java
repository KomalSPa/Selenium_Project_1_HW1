import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.time.Duration;

public class NopCommerce_Chrome_HW {

    /**
     * 1. Setup chrome browser                            Done, line 23-24
     * 2. Open URL                                        Done, line 27
     * 3. Print the title of the page                     Done, line 30-31
     * 4. Print the current url                           Done, line 34
     * 5. Print the page source                           Done, line 37
     * 6. Enter the email to email field                  Done, line 42-50
     * 7. Enter the password to password field            Done, line 53-54
     * 8. Close the browser                               Done, line 57
     */
    public static void main(String[] args) {
        // 1. Setup chrome browser
        String hWProject1 = "https://demo.nopcommerce.com/";
        WebDriver driver = new ChromeDriver();

        // 2. Open URL
        driver.get(hWProject1);

        // 3. Print the title of the page
        String title = driver.getTitle();
        System.out.println("Page Title is " + title);

        // 4. Print the current url
        System.out.println("Currunt URL : " + driver.getCurrentUrl());

        // 5. Print the page source
        System.out.println("Page source : " + driver.getPageSource());

        // 6.1 For Enter Login detals need to Maximize the Page
        driver.manage().window().maximize();

        // 6.2 Enter the email to email field (need to find "Where to login") Step 1.
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();

        // 6.3 Enter the email to email field (need to find "Where to") Step 2.
        WebElement emailField = driver.findElement(By.id("Email"));

        // 6.4 Enter the email to email field Step 3.
        emailField.sendKeys("komalspatel@prime.com");

        // 7. Enter the password to password field
        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys("LalaHula@.com");

        //8. Close the browser
        driver.close();
    }


}
