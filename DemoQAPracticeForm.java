
    import dev.failsafe.internal.util.Assert;
    import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

import org.testng.Assert;


    public class DemoQAPracticeForm {

        public static WebDriver driver;

        public static void main(String[] args) {

            
            
System.setProperty("webdriver.chrome.driver","D:\\QA\\QA Automation\\homework\\JQA\\Homework8\\src\\test\\resources\\drivers\\chromedriver.exe");
        driver= new ChromeDriver();

        //Maximize window
        driver.manage().window().maximize();

        //Launch the Site.
        driver.get("https://www.lambdatest.com/selenium-playground/simple-form-demo");
            
            // Fill in the form

            driver.findElement(By.cssSelector("#firstName")).sendKeys("John");

            driver.findElement(By.cssSelector("#lastName")).sendKeys("Doe");

            driver.findElement(By.cssSelector("#userEmail")).sendKeys("johndoe@example.com");

            driver.findElement(By.cssSelector("#gender-radio-1")).click();

            driver.findElement(By.cssSelector("#userNumber")).sendKeys("1234567890");

            driver.findElement(By.cssSelector("#dateOfBirthInput")).click();

            driver.findElement(By.cssSelector(".react-datepicker__month-select")).click();

            new Select(driver.findElement(By.cssSelector(".react-datepicker__month-select"))).selectByVisibleText("June");

            driver.findElement(By.cssSelector(".react-datepicker__year-select")).click();

            new Select(driver.findElement(By.cssSelector(".react-datepicker__year-select"))).selectByVisibleText("1990");

            driver.findElement(By.cssSelector(".react-datepicker__day--015")).click();

            driver.findElement(By.cssSelector("#subjectsInput")).sendKeys("English");

            driver.findElement(By.cssSelector("#hobbies-checkbox-1")).click();

            driver.findElement(By.cssSelector("#uploadPicture")).sendKeys("D:\\Downloads");

            driver.findElement(By.cssSelector("#currentAddress")).sendKeys("123 Main St");

            driver.findElement(By.cssSelector("#stateCity-wrapper")).click();

            driver.findElement(By.cssSelector("#react-select-3-input")).sendKeys("NCR");

            driver.findElement(By.cssSelector("#react-select-3-option-0")).click();

            driver.findElement(By.cssSelector("#react-select-4-input")).sendKeys("Delhi");

            driver.findElement(By.cssSelector("#react-select-4-option-0")).click();


            // Submit the form

            driver.findElement(By.cssSelector("#submit")).click();


            // Assert the form submission message

            WebElement formSubmissionMessage = driver.findElement(By.cssSelector("#example-modal-sizes-title-lg"));

            String expectedFormSubmissionMessage = "Thanks for submitting the form";

            String actualFormSubmissionMessage = formSubmissionMessage.getText();

            Assert.assertEquals(actualFormSubmissionMessage, expectedFormSubmissionMessage, "The form submission message is incorrect");


            // Close the browser

            driver.quit();

        }

    }

