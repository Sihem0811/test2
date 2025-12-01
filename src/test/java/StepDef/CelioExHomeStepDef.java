package StepDef;

import Helper.Config;
import Helper.Utils;
import Page.CelioExHomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CelioExHomeStepDef {
	
	@Given("Admin is on home page")
	public void admin_is_on_home_page() throws Exception {
		Config.confchrome();
		Config.maximizeWindow();
		Config.driver.get(Utils.getproprety("Web_Portal_Link"));
		
	 
	}

	@When("Admin mousehover on menu {string}")
	public void admin_mousehover_on_menu(String menuTitle) {
		CelioExHomePage page = new CelioExHomePage();
		page.mousehoverOnMenu(menuTitle);
				
		
	   
	}

	@When("click on submenu {string}")
	public void click_on_submenu(String submenuTitle) {
		
		CelioExHomePage page = new CelioExHomePage();
		page.clickOnsubmenu(submenuTitle);
		
	}
	@Then("Admin Admin is directed to the page {string}")
	public void admin_admin_is_directed_to_the_page(String verifpage) {
		CelioExHomePage page = new CelioExHomePage();
		page.clickOnsubmenu(verifpage);
	  
	}



}
