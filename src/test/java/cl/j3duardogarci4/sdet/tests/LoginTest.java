package cl.j3duardogarci4.sdet.tests;

import cl.j3duardogarci4.sdet.base.BaseTest;
import cl.j3duardogarci4.sdet.pages.LoginPage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class LoginTest extends BaseTest {

    @Test
    public void successfulLogin() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.open();

        loginPage.login(
                "tomsmith",
                "SuperSecretPassword!"
        );
        
        Assertions.assertTrue(

        loginPage
                .getSuccessMessage()
                .contains("You logged into a secure area!")

        );

    }
}