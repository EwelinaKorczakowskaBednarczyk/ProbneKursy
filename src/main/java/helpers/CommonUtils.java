package helpers;

import net.bytebuddy.utility.RandomString;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.DecimalFormat;
import java.time.Duration;

import static drivers.DriverFactory.driver;
import static selectors.DemoQATestSelectors.UPLOAD;
import static strings.DemoQATestStrings.FILE;

public class CommonUtils {

    public static WebDriverWait getWait() {
        return new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public static void click(By locator) {
        getWait().until(ExpectedConditions.elementToBeClickable(locator)).click();
        //driver.findElement(locator).click();

    }

    public static void type(By locator, String text) {
        getWait().until(ExpectedConditions.elementToBeClickable(locator)).sendKeys(text);
    }

    public static void maxBrowser() {
        driver.manage().window().maximize();

    }

    public static void fileUpload(By locator, String filePath) {
        driver.findElement(locator).sendKeys(filePath);
    }

    public static String getRandomNumberBetween(int min, int max) {
        DecimalFormat formatter = new DecimalFormat("#");
        return formatter.format(min + Math.floor(max - min) * Math.random());
    }
    public static String getRandomNumber(int numberAmount) {
        return RandomStringUtils.randomNumeric(numberAmount);
    }

    public static String getRandomPhone() {
        return getRandomNumberBetween(10000000, 999999999);
    }

    public static String getRandomName(int number) {
        return RandomStringUtils.randomAlphabetic(number).toLowerCase();
    }

    public static String getRandomMail() {
        return getTotalRandom(12) + "@gmail.com";
    }

    public static String getTotalRandom(int number) {
        return RandomStringUtils.randomAlphanumeric(number).toLowerCase();
    }
    public static String getHref(By locator){
        return getWait().until(ExpectedConditions.presenceOfElementLocated(locator)).getAttribute("href");
    }
















    public static String mainPage = "http://mqmvqjrcuo.cfolks.pl/blog/";


















    public static void main(String[] args) {
       System.out.println(getRandomMail());
    }

}

