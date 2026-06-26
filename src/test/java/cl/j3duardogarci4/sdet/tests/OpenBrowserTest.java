package cl.j3duardogarci4.sdet.tests;

import cl.j3duardogarci4.sdet.base.BaseTest;
import org.junit.jupiter.api.Test;

public class OpenBrowserTest extends BaseTest {

    @Test
    public void shouldOpenGoogle() {
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
    }
}