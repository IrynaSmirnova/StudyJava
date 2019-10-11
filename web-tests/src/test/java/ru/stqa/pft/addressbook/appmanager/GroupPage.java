package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.ArrayList;
import java.util.List;

public class GroupPage extends HelperBase {

    public GroupPage(WebDriver driver) {
        super(driver);
    }

    public void returnToGroupPage() {
        click(By.linkText("group page"));
    }

    public void clickOnEnterInformationButton() {
        click(By.name("submit"));
    }

    public void fillGroupForm(GroupData groupData) {
        type(By.name("group_name"), groupData.getName());
        type(By.name("group_header"), groupData.getHeader());
        type(By.name("group_footer"), groupData.getFooter());
    }


    public void clickOnNewGroupButton() {

        waitElementAndClick(By.name("new"), 15000);
    }

    public void deleteSelectedGroups() {

        click(By.name("delete"));
    }

    public void selectGroup(int index) {
        driver.findElements(By.name("selected[]")).get(index).click();

    }

    public void initGroupModification() {
        click(By.name("edit"));
    }

    public void submitGroupModification() {
        click(By.name("update"));
    }

    public void createGroup(GroupData group) {
        clickOnNewGroupButton();
        fillGroupForm(group);
        clickOnEnterInformationButton();
        returnToGroupPage();
    }

    public boolean isThereAGroup() {
        return isElementPresent(By.name("selected[]"));
    }

    public int groupCount() {
        return driver.findElements(By.name("selected[]")).size();
    }

    public List<GroupData> groupList() {
        List<GroupData> groups = new ArrayList<GroupData>();
        String locatorOnGroupPage = "//input[@type='checkbox']";
        int counter = 0;
        List<WebElement> elements = driver.findElements(By.xpath(locatorOnGroupPage));
        for (WebElement element : elements) {
            String name = element.getAttribute("title");
            System.out.println("Counter is " + counter + name.substring(8, name.length() - 1));
            GroupData group = new GroupData(name, null, null);
            groups.add(group);
            counter++;
        }
        return groups;
    }

    public void makeSureGroupPageIsOpened() {
        if (isElementPresent(By.tagName("h1"))
        && driver.findElement(By.tagName("h1")).getText().equals("Groups")
        && isElementPresent(By.name("new"))) {
        return;
        }
        click(By.linkText("groups"));
    }
}
