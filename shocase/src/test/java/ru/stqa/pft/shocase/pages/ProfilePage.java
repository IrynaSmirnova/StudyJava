package ru.stqa.pft.shocase.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.shocase.appmanager.DriverActions;

public class ProfilePage extends DriverActions {
    public ProfilePage(WebDriver driver) {
        super(driver);
    }

    public void clickOnResumeButton() {
        driver.findElement(By
                .xpath("//a[@class='sis-profile-nav-item sis-header-mini-uppercase sis-icon-lines-after']")).click();
    }

    public void clickOnSummaryField() {
        driver.findElement(By.xpath("//pre[@class='sis-resume-summary ng-binding']")).click();
    }

    public String getTextFromSummaryField() {
        click(By.xpath("//textarea[@name='summary']"));
        return driver.findElement(By.xpath("//textarea[@name='summary']")).getAttribute("value");
    }

    public void deleteTextFromSummaryField() {
        click(By.xpath("//textarea[@name='summary']"));
        driver.findElement(By.xpath("//textarea[@name='summary']")).clear();
    }

    public void typeNewTextInSummaryField(String text) {
        click(By.xpath("//textarea[@name='summary']"));
        driver.findElement(By.xpath("//textarea[@name='summary']")).sendKeys(text);
    }

    public void clickOnSaveButton() {
        driver.findElement(By.xpath("//button[@data-submit-text='Saving']")).click();
    }
}
