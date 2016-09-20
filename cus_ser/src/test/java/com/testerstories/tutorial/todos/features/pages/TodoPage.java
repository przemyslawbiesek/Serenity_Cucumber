package com.testerstories.tutorial.todos.features.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.Keys;


@DefaultUrl("http://todomvc.com/examples/angularjs")
public class TodoPage extends PageObject {
    public void addActionCalled(String actionName) {
        $("//*[@id=\"new-todo\"]").type(actionName).then().sendKeys(Keys.ENTER);
    }

    public String getActions() {
        return findBy("//*[@id=\"todo-list\"]").getText();
    }
}
