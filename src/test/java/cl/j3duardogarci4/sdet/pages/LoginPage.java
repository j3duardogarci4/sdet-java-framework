package cl.j3duardogarci4.sdet.pages;

import cl.j3duardogarci4.sdet.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    private By username = By.id("username");
    private By password = By.id("password");
    private By loginButton = By.cssSelector("button[type='submit']");
    private By successMessage =  By.id("flash");

    public LoginPage(WebDriver driver){
        super(driver);
    }

    public void open(){
        driver.get("https://the-internet.herokuapp.com/login");
    }

    public void login(String user, String pass){

        type(username, user);
        type(password, pass);
        click(loginButton);

    }
    public String getSuccessMessage(){

         return getText(successMessage);

    }   

}