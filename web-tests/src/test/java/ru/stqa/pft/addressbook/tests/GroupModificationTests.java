package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.List;

public class GroupModificationTests extends TestBase {

    @Test
    public void testGroupModification () {
        app.navigationBar().clickOnGroups();

        if (! app.groupPage().isThereAGroup()); {
            app.groupPage().createGroup(new GroupData("test", null, null));
        }
        List<GroupData> before = app.groupPage().groupList();
        app.groupPage().selectGroup(before.size()- 1);
        app.groupPage().initGroupModification();
        app.groupPage().fillGroupForm(new GroupData("test", "test1", "test2"));
        app.groupPage().submitGroupModification();
        app.groupPage().returnToGroupPage();
        List<GroupData> after = app.groupPage().groupList();
        Assert.assertEquals(after.size(), before.size());

    }


}
