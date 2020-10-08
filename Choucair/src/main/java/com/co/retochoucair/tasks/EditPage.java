package com.co.retochoucair.tasks;

import com.co.retochoucair.models.DataEditPage;
import com.co.retochoucair.userinterfaces.PagesModule;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class EditPage implements Task {
    private DataEditPage objPag;

    public EditPage(DataEditPage objPag) {
        this.objPag = objPag;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PagesModule.EDIT_BUTTON),
                Enter.theValue(objPag.getTitle()).into(PagesModule.PAGE_TITLE),
                Click.on(PagesModule.UPDATE_BUTTON),
                Click.on(PagesModule.PREVIEW_BUTTON));
    }
    public static EditPage toEditPage(DataEditPage objPag){
        return Tasks.instrumented(EditPage.class,objPag);
    }
}
