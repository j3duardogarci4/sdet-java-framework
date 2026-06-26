package cl.j3duardogarci4.sdet.pages;
public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void open(){
        driver.get("...");
    }

    public void login(String user,String pass){

    }

}