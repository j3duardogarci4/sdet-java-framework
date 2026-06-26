package cl.j3duardogarci4.sdet.tests;

import test.java.pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    void loginCorrecto(){

        LoginPage login = new LoginPage(driver);
    }

}