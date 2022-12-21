package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class Homepage {

    WebDriver driver;

    @Given("Browser launched")
    public void browser_is_launched() {
        System.setProperty();
        System.out.println("Browser launched");
    }
    @When("URL given")
    public void ky_url_given() {
        System.out.println("URL given");
    }
    @And("KYLottery page logo appear")
    public void ky_logo_appears() {
        System.out.println("KYLottery page logo appear");
    }
    @Then("KYLottery page is launched")
    public void ky_lottery_launched() {
        System.out.println("KYLottery page is launched");
    }

}
