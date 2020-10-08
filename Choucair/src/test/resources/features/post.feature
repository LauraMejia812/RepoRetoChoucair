Feature:As a user of the application I want to create a post and a page

  Background: User is Logged In
    Given I navigate to the login page
    |user|password|
    |opensourcecms|opensourcecms|
  @PageLoads
  Scenario: Verify that page loads correctly
    Then  He looks at the message

  @CreatePost
  Scenario: Validate that the platform allows the creation of post
    When  the user creates the post
    |title|text|
    |Prueba choucair2|se realiza una publicacion desde cero|
    Then  He validates that the post has been publishedPrueba choucair2

  @EditPost
  Scenario: Certify that the page allows editing an already created publication
    When the user creates a post to later edit it
    |title|text|
    |Prueba choucair2|se realiza una publicacion desde cero|
    And the user edits the text of the publication
    |title|text|
    |Prueba choucair25|se modifica la publicacion|
    Then He validates that the post was modifiedPrueba choucair25