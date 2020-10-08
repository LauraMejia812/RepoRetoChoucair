package com.co.retochoucair.tasks;

import com.co.retochoucair.interactions.Wait;
import com.co.retochoucair.models.PostData;
import com.co.retochoucair.userinterfaces.PostModule;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class CreatePost implements Task {
    private PostData objPost;

    public CreatePost(PostData objPost) {
        this.objPost = objPost;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PostModule.BUTTON_POST),
                Click.on(PostModule.BUTTON_ADD_NEW),
                Enter.theValue(objPost.getTitle()).into(PostModule.TITLE));
                PostModule.TITLE.resolveFor(actor).sendKeys(Keys.ENTER);
                actor.attemptsTo(Enter.theValue(objPost.getText()).into(PostModule.TEXT),
                        Click.on(PostModule.PUBLISH_BUTTON),
                        Click.on(PostModule.CONFIRM_PUBLICATION),
                        Click.on(PostModule.VIEW_POST));
    }

    public static CreatePost toCreatePost(PostData objPost){
        return Tasks.instrumented(CreatePost.class,objPost);
    }
}
