package StepDef;


import Helper.Config;
import Helper.Utils;
import Page.CelioExPanierPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CelioExPanierPageStepDef {
	CelioExPanierPage panierPage;
	
	


	@Given("Admin is on page {string}")
	public void admin_is_on_page(String string) throws Exception {
		
		Config.confchrome();
		Config.maximizeWindow();
		Config.driver.get(Utils.getproprety("Web_Portal_Link2"));
		panierPage = new CelioExPanierPage();
	}

	@When("Admin click on color {string}")
	public void admin_click_on_color(String Couleur) {
		
		
		panierPage.choisirCouleur(Couleur);
	  
	}

	@When("Admin click on lengh {string}")
	public void admin_click_on_lengh(String Taille) {
		
	
		panierPage.choisirTaille(Taille);
	}

	@When("Admin click on {string}")
	public void admin_click_on(String AJOUTERPANIER) {
		panierPage.ajouterAuPanierEtContinuer();
	}
		
		@When("Admin click on botton {string}")
		public void admin_click_on_botton(String CONTINUEZVOSACHATS) {
			panierPage.ouvrirPanierDepuisPopupPanier();
		   
		}

	@Then("Product {string} is added to the cart shopping")
	public void product_is_added_to_the_cart_shopping(String AAAA) {
		
		CelioExPanierPage page = new CelioExPanierPage ();
		page.retourNomProduit(AAAA);
		
		
    }
	

		}
		
		

		
	   
	





	