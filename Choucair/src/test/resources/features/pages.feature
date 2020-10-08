Feature:As a user of the platform, I want to interact with the Pages module to create and edit this

  Background: User is Logged In
    Given I navigate to the login page
      |user|password|
      |opensourcecms|opensourcecms|

  @CreatePage
  Scenario: Validate that the platform allows the creation of pages
    When  the user creates the page
      |title|url|
      |Prueba choucair2|https://computacioninteractiva.com/wp-content/uploads/2019/07/INVERTIR-EN-TECNOLOGIA.png|
    Then  He validates that the page has been published PRUEBA CHOUCAIR2

  @EditPage
  Scenario: Certify that the platform allows editing a page already created
    When the user creates a page to later edit it
      |title|url|
      |Prueba choucair2|https://computacioninteractiva.com/wp-content/uploads/2019/07/INVERTIR-EN-TECNOLOGIA.png|
    And the user edits the text of the page
      |title|
      |Prueba choucair25|
    Then He validates that the page was modified PRUEBA CHOUCAIR25