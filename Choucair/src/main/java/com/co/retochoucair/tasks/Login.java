package com.co.retochoucair.tasks;

import com.co.retochoucair.models.Credentials;
import com.co.retochoucair.userinterfaces.LoginModule;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;

public class Login implements Task {

    private Credentials objCredential;

    public Login(Credentials objCredential) {
        this.objCredential = objCredential;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(Enter.theValue(objCredential.getUser()).into(LoginModule.EMAIL_OR_USER),
                Enter.theValue(objCredential.getPassword()).into(LoginModule.PASSWORD),
                Click.on(LoginModule.BUTTON_LOGIN));
    }
    public static Login toLogin(Credentials objCredential){
        return Tasks.instrumented(Login.class,objCredential);
    }
}
