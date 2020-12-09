package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pageobjects.TransferFundsPage;

public class TransferFundsStepDefs {

    private WebDriver driver;
    private TransferFundsPage transferFundsPage;

    public TransferFundsStepDefs() {
        this.driver = Hooks.driver;
        this.transferFundsPage = new TransferFundsPage(driver);
    }

    @Given("I click on Transfer Funds service on Home Page")
    public void i_click_on_transfer_funds_service_on_home_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("I validate I am on Transfer Funds page")
    public void i_validate_i_am_on_transfer_funds_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
