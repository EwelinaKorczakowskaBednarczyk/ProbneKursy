import org.junit.Test;
import org.openqa.selenium.By;

import static helpers.CommonUtils.*;
import static strings.DemoQATestStrings.DEMO_URL;
import static drivers.DriverFactory.driver;
import static selectors.DemoQATestSelectors.*;
import static org.junit.Assert.assertEquals;
import static strings.DemoQATestStrings.FILE;

public class DemoQATest {


    @Test
    public void test1() {

        //1. Włącz przeglądarkę i kliknij w link
        driver.get(DEMO_URL);
        assertEquals(DEMO_URL, driver.getCurrentUrl());

        //2.Wpisz imię i nazwisko
        type(FIRST_NAME, "Jaś");
        //driver.findElement(By.id("firstName")).sendKeys("Jaś");
        type(LAST_NAME, "Przykładowy");
        //driver.findElement(By.id("lastName")).sendKeys("Przykładowy");

        //3.Wpisz mail
        type(EMAIL, getRandomMail());

        //4.Kliknij w MALE
        click(MALE);
        //driver.findElement(MALE).click();

        //5. Wpisz numer telefonu
        type(PHONE_NUMBER, "123456789");

        //6. Wgraj plik
        fileUpload(UPLOAD, FILE);
        //driver.findElement(UPLOAD).sendKeys(FILE);


    }

    @Test
    public void test2() {

        //1. Włącz przeglądarkę i kliknij w link
        driver.get(DEMO_URL);
        assertEquals(DEMO_URL, driver.getCurrentUrl());

        //2.Wpisz imię i nazwisko
        type(FIRST_NAME, "Jaś");
        //driver.findElement(By.id("firstName")).sendKeys("Jaś");
        type(LAST_NAME, "Przykładowy");
        //driver.findElement(By.id("lastName")).sendKeys("Przykładowy");

        //3.Wpisz mail
        type(EMAIL, getRandomMail());

        //4.Kliknij w MALE
        click(MALE);
        //driver.findElement(MALE).click();

        //5. Wpisz numer telefonu
        type(PHONE_NUMBER, "123456789");

        //6. Wgraj plik
        fileUpload(UPLOAD, FILE);
        //driver.findElement(UPLOAD).sendKeys(FILE);

        driver.quit();


    }

}
