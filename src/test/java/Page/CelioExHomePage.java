package Page;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class CelioExHomePage {
	@FindBy(xpath="/html/body/main/div/header/div[2]/div/div/div/div[1]/div/div[1]/nav/ul/li/a/span[1] ")

	List<WebElement> menus;

	@FindBy(xpath="/html/body/main/div/header/div[2]/div/div/div/div[1]/div/div[1]/nav/ul/li[3]/ul/li/div/div/div[1]/ul/li/a/span")
	List<WebElement> submenus;

	@FindBy(xpath="/html/body/main/div/div[2]/div/ul/li[3]/strong")
	WebElement verifpage;
	




	public CelioExHomePage () {
		PageFactory.initElements(Config.driver, this);
	}


	public void mousehoverOnMenu(String menuTitle) {


		try {
			for (WebElement menu:menus) {
				if(menu.getText().contains(menuTitle)) {
					Actions action = new Actions(Config.driver);
					action.moveToElement(menu).perform();

				}

			}
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void clickOnsubmenu(String submenuTitle){
		try {

			for(WebElement submenu:submenus) {
				if(submenu.getText().contains(submenuTitle)) {
					submenu.click();
					
					
					String actualText = verifpage.getText().toLowerCase();
					Assert.assertEquals(submenuTitle.toLowerCase(), actualText);


				}
			}

		}catch (Exception e) {
			// TODO: handle exception
		}

	}


	
	
	

}

























