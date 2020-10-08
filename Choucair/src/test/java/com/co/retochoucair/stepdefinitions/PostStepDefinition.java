package com.co.retochoucair.stepdefinitions;

import com.co.retochoucair.models.Credentials;
import com.co.retochoucair.models.DataEditPage;
import com.co.retochoucair.models.PageData;
import com.co.retochoucair.models.PostData;
import com.co.retochoucair.questions.CaptureLogo;
import com.co.retochoucair.questions.CapturePage;
import com.co.retochoucair.questions.CapturePost;
import com.co.retochoucair.questions.CapturePostUpdate;
import com.co.retochoucair.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class PostStepDefinition {
    @Managed(driver = "chrome")
    private WebDriver hisBrowser;

    @Before
    public void setUp() {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("User");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));

    }

    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage(List<Credentials> objCredential) {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://s1.demo.opensourcecms.com/wordpress/wp-login.php"));
        OnStage.theActorInTheSpotlight().wasAbleTo(Login.toLogin(objCredential.get(0)));
    }

    @Then("^He looks at the message$")
    public void heLooksAtTheMessage() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CaptureLogo.toCaptureLogo(), Matchers.is(true)));
    }

    @When("^the user creates the post$")
    public void theUserCreatesThePost(List<PostData> objPost) {
        OnStage.theActorInTheSpotlight().attemptsTo(CreatePost.toCreatePost(objPost.get(0)));
    }

    @Then("^He validates that the post has been published(.*)$")
    public void heValidatesThatThePostHasBeenPublished(String message) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CapturePost.toCapturePost(), Matchers.equalTo(message)));
    }

    @When("^the user creates a post to later edit it$")
    public void theUserCreatesAPostToLaterEditIt(List<PostData> objPost) {
        OnStage.theActorInTheSpotlight().attemptsTo(CreatePost.toCreatePost(objPost.get(0)));
    }

    @When("^the user edits the text of the publication$")
    public void theUserEditsTheTextOfThePublication(List<PostData> ojbPost) {
        OnStage.theActorInTheSpotlight().attemptsTo(EditPost.toEditPost(ojbPost.get(0)));
    }

    @Then("^He validates that the post was modified(.*)$")
    public void heValidatesThatThePostWasModified(String message) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CapturePostUpdate.toPostUpdate(), Matchers.equalTo(message)));
    }




    @When("^the user creates the page$")
    public void theUserCreatesThePage(List<PageData> objPage) {
        OnStage.theActorInTheSpotlight().attemptsTo(CreatePage.toCreatePage(objPage.get(0)));

    }

    @Then("^He validates that the page has been published (.*)$")
    public void heValidatesThatThePageHasBeenPublished(String message) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CapturePage.toCapturePage(), Matchers.equalTo(message)));

    }

    @When("^the user creates a page to later edit it$")
    public void theUserCreatesAPageToLaterEditIt(List<PageData> objPage) {
        OnStage.theActorInTheSpotlight().attemptsTo(CreatePage.toCreatePage(objPage.get(0)));
    }

    @When("^the user edits the text of the page$")
    public void theUserEditsTheTextOfThePage(List<DataEditPage> objPag) {
        OnStage.theActorInTheSpotlight().attemptsTo(EditPage.toEditPage(objPag.get(1)));
    }

    @Then("^He validates that the page was modified (.*)$")
    public void heValidatesThatThePageWasModified(String message) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CapturePage.toCapturePage(), Matchers.equalTo(message)));
    }


}
