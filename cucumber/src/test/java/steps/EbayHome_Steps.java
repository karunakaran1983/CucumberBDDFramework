package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EbayHome_Steps {

	@Given("Ebay website is launched")
	public void ebay_website_is_launched() {
		System.out.println("Ebay website is launched");
	}

	@When("I click on Advanced Search button")
	public void i_click_on_advanced_search_button() {
		System.out.println("I click on Advanced Search button");
	}

	@Then("I see Advanced Search page")
	public void i_see_advanced_search_page() {
		System.out.println("I see Advanced Search page");
	}
}
