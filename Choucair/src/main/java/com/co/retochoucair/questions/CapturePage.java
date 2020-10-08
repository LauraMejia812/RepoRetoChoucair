package com.co.retochoucair.questions;

import com.co.retochoucair.userinterfaces.PagesModule;
import com.co.retochoucair.userinterfaces.PostModule;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class CapturePage implements Question<String>{
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(PagesModule.CAPTURE_TITLE).viewedBy(actor).asString();
    }
    public static CapturePage toCapturePage(){
        return new CapturePage();
    }
}
