#Author: Sihem

Feature: Panier page CelioEx

  Scenario: Add Jean to shopping cart and verification its add

  
    Given Admin is on page " https://celio.tn/bermuda-baggy-en-jean-beige-lolargebm-beige.html" 
    
    When Admin click on color "Beige"
    
    And Admin click on lengh "40"
    
    And Admin click on "AJOUTER AU PANIER"
    
    And Admin click on botton "CONTINUEZ VOS ACHATS"
    
    Then Product "Bermuda baggy en jean - beige" is added to the cart shopping
 

 