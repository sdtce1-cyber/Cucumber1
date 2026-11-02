
package com.Step_definitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.object.repo.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {

    public WebDriver driver;
    LoginPage L;

    @Given("Navigate to the application")
    public void navigate_to_the_application() {
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        L = new LoginPage(driver);
    }

    @Given("User enter the username")
    public void user_enter_the_username() {

        WebElement userName = L.getUserName();
        userName.sendKeys("Admin");
    }

    @Given("User enter the password")
    public void user_enter_the_password() {

        WebElement passWord = L.getPassWord();
        passWord.sendKeys("admin123");
    }

    @When("User click the login button")
    public void user_click_the_login_button() {

        WebElement submit = L.getSubmit();
        submit.click();
    }

    @Then("Login should be successful")
    public void login_should_be_successful() {

        WebElement text = driver.findElement(By.className("oxd-userdropdown-name"));

        String actual = text.getText();
        System.out.println(actual);
        driver.quit();
    }
    @When("Login should be failed")
    public void login_should_be_failed() {

        WebElement failed = driver.findElement(By.xpath("//p[text()='Invalid credentials']"));
        String actual_failed = failed.getText();
        System.out.println(actual_failed);
        driver.quit();
    }
}
