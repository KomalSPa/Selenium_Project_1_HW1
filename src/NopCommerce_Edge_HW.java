import com.sun.org.apache.xpath.internal.objects.XString;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NopCommerce_Edge_HW {


    /**
     * 1. Setup chrome browser
     * 2. Open URL
     * 3. Print the title of the page
     * 4. Print the current url
     * 5. Print the page source
     * 6. Enter the email to email field
     * 7. Enter the password to password field
     * 8. Close the browser
     */
    public static void main(String[] args) {
        // 1. Setup Edge browser
        String baseURL = "https://demo.nopcommerce.com/";
        WebDriver driver = new EdgeDriver();

        // 2. Open URL
        driver.get(baseURL);

        // 3. Print the title of the page
        String title = driver.getTitle();
        System.out.println("Page Title is " + title);

        // 4. Print the current url
        System.out.println("Currunt URL : " + driver.getCurrentUrl());

        // 5. Print the page source
        System.out.println("Page source : " + driver.getPageSource());

        //6.1 For Enter Login detals need to Maximize the Page
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

        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser name");
            //8. Close the browser
            driver.close();
        }
    }

    static String browser = "Firefox";
    static String baseURL = "https://demo.nopcommerce.com/";
    static WebDriver driver;
}

