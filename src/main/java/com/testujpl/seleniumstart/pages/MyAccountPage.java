package com.testujpl.seleniumstart.pages;

import com.testujpl.seleniumstart.driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {

    @FindBy(css = ".header_user_info")
    private WebElement userProfileLink;

    public MyAccountPage() {
        PageFactory.initElements(Driver.getInstance(), this);
    }

    public boolean isUserLogged(String userFirstName, String userLastname){
        return userProfileLink.getText().equals(userFirstName+ " " + userLastname);
    }
}
