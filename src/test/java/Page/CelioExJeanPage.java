package Page;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class CelioExJeanPage {
	
	@FindBy(xpath="/html/body/main/div/section/div[3]/div[1]/div[4]/ol/li/div[2]/h5/a")
	List<WebElement> productsList;

	@FindBy(xpath="/html/body/main/div/section/div[2]/div/div[5]/div[2]/div/div/h1")
	WebElement product;

	@FindBy(xpath="/html/body/main/div/div[2]/div/ul/li[2]")
	
	WebElement verifpageproduct;

	
	
	

	public CelioExJeanPage(){
		
		PageFactory.initElements(Config.driver, this);
	}

	public void clickOnProductByName(String productName) {
		try {

			for(WebElement objet: productsList) {
				if(objet.getText().contains(productName)) {
					
					objet.click();
					Config.attente(10);

					String actualText = verifpageproduct.getText().toLowerCase();

					Assert.assertEquals("Nom du produit non trouvé sur la liste",productName.toLowerCase(), actualText);
					
					String currentUrl = Config.driver.getCurrentUrl();
	                System.out.println("URL actuelle: " + currentUrl);
	                Assert.assertTrue("Redirection incorrecte : URL ne contient pas le nom du produit",
	                                  currentUrl.toLowerCase().contains("bermuda-baggy-en-jean-beige"));
				}


				
				
			}
		}catch (Exception e) {
			// TODO: handle exception
		}

	}
}
