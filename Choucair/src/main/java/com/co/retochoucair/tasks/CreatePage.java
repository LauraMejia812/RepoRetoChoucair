package com.co.retochoucair.tasks;

import com.co.retochoucair.models.PageData;
import com.co.retochoucair.userinterfaces.PagesModule;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class CreatePage implements Task {
    private PageData objPage;

    public CreatePage(PageData objPage) {
        this.objPage = objPage;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PagesModule.PAGES_BUTTON),
                Click.on(PagesModule.ADD_NEW_PAGE),
                Click.on(PagesModule.POP_UP_WINDOW_BUTTON),
                Enter.theValue(objPage.getTitle()).into(PagesModule.PAGE_TITLE),
                Click.on(PagesModule.ADD_COMPLEMENT),
                Click.on(PagesModule.ADD_IMAGE),
                Click.on(PagesModule.URL_BUTTON),
                Enter.theValue(objPage.getUrl()).into(PagesModule.URL_TEXT_BOX),
                Click.on(PagesModule.ADD_URL),
                Click.on(PagesModule.TO_POST),
                Click.on(PagesModule.CONFIRM_PUBLICATION),
                Click.on(PagesModule.VIEW_PAGE));
    }

    public static CreatePage toCreatePage(PageData objPage){
        return Tasks.instrumented(CreatePage.class,objPage);
    }
}
