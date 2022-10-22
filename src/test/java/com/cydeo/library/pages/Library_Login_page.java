package com.cydeo.library.pages;

import com.cydeo.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Library_Login_page extends BasePage {


    @FindBy(id = "inputEmail")
    public WebElement username;

    @FindBy(id = "inputPassword")
    public WebElement password;

    @FindBy(xpath = "//button[.='Sign in']")
    public WebElement signinButton;

    @FindBy(className = "navbar-brand")
    public WebElement libraryLogo;

    @FindBy(id = "user_count")
    public WebElement userCount;

    @FindBy(xpath = "//h6[.='Users']")
    public WebElement users;

    @FindBy(xpath = "//div/ul//li/a[@href='#users']")
    public WebElement usersLink;

    @FindBy(xpath = "//table//thead//th")
    public List<WebElement> columns;

    @FindBy(xpath = "//div//ul[@class='navbar-nav  navbar-right']")
    public WebElement account;

    @FindBy(xpath = "//div//ul[@class='navbar-nav  navbar-right']/li/a/span")
    public WebElement accountName;


    @FindBy(linkText = "Log Out")
    public WebElement logOutBtn;


}
