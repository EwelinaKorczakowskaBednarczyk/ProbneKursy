package pageobjects;

import org.openqa.selenium.By;

import static drivers.DriverFactory.*;
import static helpers.CommonUtils.*;
import static org.junit.Assert.assertEquals;
import static selectors.testCaseSelectors.FIRST_CATEGORY_SELECTORS;

public class ShopHomePage {

    public static void openShopHomePage() {
        driver.get("http://mqmvqjrcuo.cfolks.pl/blog/");
        assertEquals("http://mqmvqjrcuo.cfolks.pl/blog/", driver.getCurrentUrl());
    }

    public static void openFirstCategory() {
        String FIRST_CATEGORY_URL = getHref(FIRST_CATEGORY_SELECTORS);
       driver.get(FIRST_CATEGORY_URL);
        assertEquals(FIRST_CATEGORY_URL, driver.getCurrentUrl());
    }

    public static void openCategory(int number) {
        String CATEGORY_URL = getHref(By.xpath("(//li[contains(@class,'product-category product')]/a)[" + number + "]"));
        driver.get(CATEGORY_URL);
    }

    public static void chooseProduct(int number) {
        openCategory(1);



    }


    public static void main(String[] args) {
        openShopHomePage();
        openFirstCategory();

    }


}
