package com.co.retochoucair.questions;

import com.co.retochoucair.userinterfaces.LoginModule;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

public class CaptureLogo implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Visibility.of(LoginModule.ICON_WORDPRESS).viewedBy(actor).asBoolean();

    }

    public static CaptureLogo toCaptureLogo(){
        return new CaptureLogo();
    }

}
