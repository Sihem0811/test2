#Author: Sihem
 
Feature: CelioExHome

  Scenario: Selectionner un produit
  
    Given Admin is on home page
   
    When Admin mousehover on menu "Collection" 
    
    And click on submenu "Jeans" 
							
    Then Admin is directed to the page "Jeans"
   

