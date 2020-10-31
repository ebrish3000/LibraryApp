package com.cybertek.library.pages;

import com.cybertek.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUserPage extends BasePage {
    public AddUserPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//a[@class='btn btn-lg btn-outline btn-primary btn-sm']")
    public WebElement addUser;

    @FindBy(name = "full_name")
    public WebElement fullName;
    @FindBy(name = "password")
    public WebElement password;
    @FindBy(name = "email")
    public WebElement email;
    @FindBy(id = "address")
    public WebElement address;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveChange;

}
