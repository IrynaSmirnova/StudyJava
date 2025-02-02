package ru.stqa.pft.addressbook.tests;// Generated by Selenium IDE


import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.List;

public class CreateGroupTest extends TestBase {

  @Test
  public void createGroup() {
    app.navigationBar().clickOnGroups();
    app.groupPage().makeSureGroupPageIsOpened();
    List<GroupData> before = app.groupPage().groupList();
    app.groupPage().createGroup(new GroupData("test", null, null));
    List<GroupData> after = app.groupPage().groupList();
    Assert.assertEquals(after.size(), before.size() + 1);

  }

}
