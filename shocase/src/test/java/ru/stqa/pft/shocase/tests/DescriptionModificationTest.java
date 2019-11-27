package ru.stqa.pft.shocase.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DescriptionModificationTest extends TestBase {

    @Test
    public void aboutFormModificationTests() {
        app.driver.get("https://www.shocase.com/go/signup");
        app.signUpPage().clickOnSignInButton();
        app.signUpPage().enterEmail("irena.smirnowa@gmail.com");
        app.signUpPage().enterPassword("3402283Iren");
        app.signUpPage().clickOnSignIn();
        //TODO: make sure the page is opened
        app.mainPage().clickOnProfilePage();
        app.profilePage().clickOnResumeButton();
        app.profilePage().clickOnSummaryField();
        String textBefore = app.profilePage().getTextFromSummaryField();
        app.profilePage().deleteTextFromSummaryField();
        app.profilePage().typeNewTextInSummaryField(textBefore + ".");
        app.profilePage().clickOnSaveButton();
        app.driver.get("https://www.shocase.com/go/signup");
        app.mainPage().clickOnProfilePage();
        app.profilePage().clickOnResumeButton();
        app.profilePage().clickOnSummaryField();
        String textAfter = app.profilePage().getTextFromSummaryField();
        Assert.assertEquals(textBefore + ".", textAfter);







    }

}
