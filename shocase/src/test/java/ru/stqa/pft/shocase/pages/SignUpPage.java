package ru.stqa.pft.shocase.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.shocase.appmanager.DriverActions;

public class SignUpPage extends DriverActions {

    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnSignInButton() {
        driver.findElement(By.xpath("//a[@class='sis-header-singup-link']")).click();
    }


    public void enterEmail(String email) {
        driver.findElement(By.name("email_address")).click();
        driver.findElement(By.name("email_address")).sendKeys(email);

    }

    public void enterPassword(String password) {
        driver.findElement(By.name("j_password")).click();
        driver.findElement(By.name("j_password")).sendKeys(password);
    }

    public void clickOnSignIn() {
        driver.findElement(By.id("sis-email-login-button")).click();
    }
}

