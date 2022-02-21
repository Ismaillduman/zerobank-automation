package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.get(), this);
    }
@FindBy(id = "signin_button")
    public WebElement signButton;
    @FindBy(id="user_login")
    public WebElement loginInPutBox;
    @FindBy(id="user_password")
    public WebElement passwordInPutBox;
    @FindBy(name = "submit")
    public WebElement submitButton;
    @FindBy(xpath = "//*[@class = 'alert alert-error']")
    public WebElement errorMessage;

   public void login(){

      signButton.click();
      loginInPutBox.sendKeys(ConfigurationReader.get("username"));
      passwordInPutBox.sendKeys(ConfigurationReader.get("password"));
      submitButton.click();
       BrowserUtils.waitFor(2);


   }

public void login(String username, String password){
    signButton.click();
    loginInPutBox.sendKeys(username);
    passwordInPutBox.sendKeys(password);
    submitButton.click();
    BrowserUtils.waitFor(2);
}

}
