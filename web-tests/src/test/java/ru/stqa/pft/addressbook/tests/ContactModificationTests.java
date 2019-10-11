package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;


public class ContactModificationTests extends TestBase {

    @Test
    public void contactModification() {
        app.navigationBar().clickOnHomeButton();
        app.contactPage().initContactModification();
        app.contactPage().fillContactForm(new ContactData("test", "test", null), false);
        app.contactPage().clickOnUpdateButton();

    }
}
