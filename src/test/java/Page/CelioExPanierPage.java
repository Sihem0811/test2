package Page;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

import Helper.Config;

public class CelioExPanierPage {

	@FindBy(xpath="/html/body/main/div/section/div[2]/div/div[5]/div[2]/div/div/div[2]/form/div[1]/div/div/div[2]/div/div ")
	List<WebElement> Tailles;


	@FindBy(xpath= "/html/body/main/div/section/div[2]/div/div[5]/div[2]/div/div/div[2]/form/div[1]/div/div/div[1]/div/div")
	List<WebElement> Couleurs;


	@FindBy(xpath="/html/body/main/div/section/div[2]/div/div[5]/div[2]/div/div/div[2]/form/div[2]/div[4]/div[2]/div[2]/button/span")
	WebElement Ajoutpanier;


	@FindBy(xpath="/html/body/div[2]/div/div[1]/div[2]/div/div[3]/button")
	WebElement CONTINUEZVOSACHATS;



	@FindBy(xpath="/html/body/main/div/header/div[1]/div/div/div[3]/div/div[4]/a")
	WebElement popuppanier;


	@FindBy(xpath="/html/body/main/div/header/div[1]/div/div/div[3]/div/div[4]/div/div/div/div/div[1]/ol/li/div/div[2]/strong/a")
	WebElement produitdanspanier;






	public CelioExPanierPage() {

		PageFactory.initElements(Config.driver, this);
	}

	public void choisirTaille(String tailleSouhaitee) {
		WebDriverWait wait = new WebDriverWait(Config.driver, Duration.ofSeconds(15));
		for (WebElement Taille : Tailles) {
			String Actualtext = Taille.getText();
			if (Actualtext.contains(tailleSouhaitee)) {
				wait.until(ExpectedConditions.elementToBeClickable(Taille)).click();

			}
		}
	}

	public void choisirCouleur(String couleurSouhaitee) {
		WebDriverWait wait = new WebDriverWait(Config.driver, Duration.ofSeconds(15));
		for (WebElement Couleur : Couleurs) {
			try {
				String ActualText = Couleur.getText();
				if (ActualText.contains(couleurSouhaitee.toLowerCase())) {
					wait.until(ExpectedConditions.elementToBeClickable(Couleur)).click();

				}
			}catch (Exception e) {
				// TODO: handle exception
			}

		}
	}

	public void ajouterAuPanierEtContinuer() {
		WebDriverWait wait = new WebDriverWait(Config.driver, Duration.ofSeconds(15));
		Ajoutpanier.click();

		wait.until(ExpectedConditions.visibilityOf(CONTINUEZVOSACHATS));
		wait.until(ExpectedConditions.elementToBeClickable(CONTINUEZVOSACHATS)).click();

	}

	public void ouvrirPanierDepuisPopupPanier() {
		WebDriverWait wait = new WebDriverWait(Config.driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(popuppanier)).click();


	}
	public void retourNomProduit(String verif) {
		WebDriverWait wait = new WebDriverWait(Config.driver, Duration.ofSeconds(15));
		Assert.assertEquals(produitdanspanier.getText(),verif);


	}

}




















