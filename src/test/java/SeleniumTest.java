import net.bytebuddy.implementation.EqualsMethod;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static drivers.DriverFactory.*;
import static helpers.CommonUtils.getWait;
import static helpers.CommonUtils.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static selectors.SeleniumTestSelectors.*;
import static strings.SeleniumTestStrings.*;

public class SeleniumTest {


    public static void main(String[] args) {

//        1. Włącz przeglądarkę i wejdź w link
        maxBrowser();
        driver.get(TEST_URL);
        assertEquals(TEST_URL, driver.getCurrentUrl());

//        2. Kliknij guzik "Kliknij mnie"
        assertTrue(driver.findElement(ON_ME).isDisplayed());
        click(ON_ME);

//        3. Pobierz tekst i zamknij alert
        Alert alert = driver.switchTo().alert();
//        System.out.println(alert.getText());
        assertEquals("Hello world!", alert.getText());
        alert.accept();

//        4. Znajdź Pole "First name" i wpisz "Pomarańcza"
        type(ON_ME,"pomarańcza");
//        type(By.id("fname"),"Pomarańcza");
//        driver.findElement(By.id("fname")).sendKeys("Pomarańcza");

        //5. Wejdź w link W3Schools i wróć na poprzednią stronę
        click(W3_LINK);
        driver.navigate().back();

        //6. Wejdź w link IamWeirdLink i wróć na poprzednią stronę
        click(IAM_LINK);
        driver.navigate().back();

        //7. Zaznacz listę wyboru i wybierz opcję Saab
        click(SELECT);
        click(SAAB);

        //8. Zamknij przeglądarkę
        driver.quit();

    }


}
