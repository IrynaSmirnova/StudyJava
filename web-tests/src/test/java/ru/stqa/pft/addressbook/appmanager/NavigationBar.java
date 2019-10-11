package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationBar extends HelperBase {

    public NavigationBar(WebDriver driver) {
        super(driver);
    }

    public void clickOnGroups() {
        if (isElementPresent(By.tagName("h1"))
            && driver.findElement(By.tagName("h1")).getText().equals("Groups")
            && isElementPresent(By.name("new"))) {
            return;
        }
        waitElementAndClick(By.linkText("groups"), 15000);
    }

    public void clickOnAddNew() {
        waitElementAndClick(By.linkText("add new"), 15000);
    }

    public void clickOnHomeButton() {
        if (isElementPresent(By.id("maintable"))) {
            return;
        }
        waitElementAndClick(By.linkText("home"), 15000);
    }

}
