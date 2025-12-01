#Author: Sihem

Feature: JeanPage CelioEx   


  Scenario: Select product on jean page and verify redirection to jean page
  
    Given Admin is on Jean page "https://celio.tn/collection/jeans.html"
  
    When Admin click on product "Bermuda baggy en jean - beige"
    
    Then Admin is directed to the page "Bermuda baggy en jean - beige"

