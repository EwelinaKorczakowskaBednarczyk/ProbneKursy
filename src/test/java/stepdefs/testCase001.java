package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageobjects.ShopHomePage;

public class testCase001 {
    @Given("I open shop website")
    public void iOpenShopWebsite() {
        ShopHomePage.openShopHomePage();

    }

    @When("I open first category")
    public void iOpenFirstCategory() {
        ShopHomePage.openFirstCategory();
    }

    @And("I choose second product")
    public void iChooseSecondProduct() {

    }

    @And("I click Add to the basket button")
    public void iClickAddToTheBasketButton() {
    }

    @And("I click check the basket")
    public void iClickCheckTheBasket() {
    }

    @And("I see my product in the basket")
    public void iSeeMyProductInTheBasket() {
    }
}
