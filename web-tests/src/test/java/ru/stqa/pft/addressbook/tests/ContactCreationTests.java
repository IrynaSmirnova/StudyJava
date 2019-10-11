package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;


public class ContactCreationTests extends TestBase {

    @Test
    public void createContact() {
        app.navigationBar().clickOnAddNew();
        app.contactPage().clickOnNextButton();
        app.contactPage().fillContactForm(new ContactData("test", "test", "test"), true);
        app.contactPage().clickOnEnterButton();
    }
}
