package StepDef;

import org.junit.Assert;

import Helper.Config;

import Helper.Utils;
import Page.CelioExJeanPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CelioExJeanPageStepDef {
	
	@Given("Admin is on Jean page {string}")
	public void admin_is_on_jean_page(String url) throws Exception {
		
		Config.confchrome();
		Config.maximizeWindow();
		Config.driver.get(Utils.getproprety("Web_Portal_Link1"));

	}

	@When("Admin click on product {string}")
	public void admin_click_on_product(String productName) {
		
		CelioExJeanPage objet = new CelioExJeanPage();
		objet.clickOnProductByName(productName);

	}

	@Then("Admin is directed to the page {string}")
	public void admin_is_directed_to_the_page(String verifpageproduct) {
		
		CelioExJeanPage objet = new CelioExJeanPage();
		objet.clickOnProductByName (verifpageproduct);
		
		
	}




}
