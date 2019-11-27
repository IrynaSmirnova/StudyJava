package ru.stqa.pft.shocase.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.shocase.appmanager.DriverActions;

public class MainPage extends DriverActions {
    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnProfilePage() {
        driver.findElement(By.xpath("//a[@class='sis-header-profile']")).click();
    }
}
