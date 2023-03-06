import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework8Try1 {
    public static WebDriver driver;
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","D:\\QA\\QA Automation\\homework\\JQA\\Homework8\\src\\test\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
//        driver.get("https://www.toffeeweb.com");
        driver.manage().window().maximize();

        //System.out.println("Launching google chrome ");
        //WebDriverManager.chromedriver().setup();
        //driver = new ChromeDriver();
        //driver.get("https://www.toffeeweb.com");

        // Navigate to the demoqa.com website
        driver.get("https://demoqa.com/");

        // Find the "Text Box" link using the findBy method and perform a click action on it
        WebElement textBoxLink = driver.findElement(By.linkText("Text Box"));
        textBoxLink.click();

        // Find the "Full Name" input field using the findBy method and enter a value in it
        WebElement fullNameField = driver.findElement(By.id("userName"));
        fullNameField.sendKeys("John Doe");

        // Find the "Submit" button using the findBy method and perform a click action on it
        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();

        // Close the browser
        driver.quit();


    }
}
