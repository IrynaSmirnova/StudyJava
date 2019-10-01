package ru.stqa.pft.addressbook.tests;// Generated by Selenium IDE


import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class CreateGroupTest extends TestBase {

  @Test
  public void createGroup() {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().initGroupCreation();
    app.getGroupHelper().fillGroupForm(new GroupData("test", "test1", "test2"));
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().returnToGroupPage();
  }

}