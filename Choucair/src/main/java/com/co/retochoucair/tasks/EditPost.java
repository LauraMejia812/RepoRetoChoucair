package com.co.retochoucair.tasks;

import com.co.retochoucair.interactions.Wait;
import com.co.retochoucair.models.PostData;
import com.co.retochoucair.userinterfaces.PagesModule;
import com.co.retochoucair.userinterfaces.PostModule;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class EditPost implements Task {
    private PostData objPost;

    public EditPost(PostData objPost) {
        this.objPost = objPost;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PostModule.BUTTON_EDIT),
                Enter.theValue(objPost.getTitle()).into(PostModule.TITLE),
                Click.on(PostModule.UPDATE_BUTTON),
                Click.on(PagesModule.POP_UP_WINDOW_BUTTON),
                Click.on(PostModule.PREVIEW_BUTTON),
                Wait.just(3000));

    }

    public static EditPost toEditPost(PostData objPost){
        return Tasks.instrumented(EditPost.class,objPost);
    }
}
