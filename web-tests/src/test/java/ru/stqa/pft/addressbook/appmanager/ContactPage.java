package ru.stqa.pft.addressbook.appmanager;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.GroupData;


public class ContactPage extends HelperBase {
    public ContactPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnNextButton() {
        click(By.cssSelector("input:nth-child(8)"));

    }

    public void fillFirstName(String firstName) {


    }

    public void fillLastName(String lastName) {

    }

    public void fillContactForm(ContactData contactData, boolean creation) {
        type(By.name("firstname"), contactData.getFirstName());
        type(By.name("lastname"), contactData.getLastName());

        if (creation) {
            new Select(driver.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
        } else {
            Assert.assertFalse(isElementPresent(By.name("new_group")));
        }

        }



    public void clickOnEnterButton() {
        click(By.name("submit"));

    }

    public void initContactModification() {
        click(By.cssSelector("tr:nth-child(6) > .center:nth-child(8) img"));
    }

    public void clickOnUpdateButton() {
        click(By.cssSelector("input:nth-child(86)"));
    }


}
