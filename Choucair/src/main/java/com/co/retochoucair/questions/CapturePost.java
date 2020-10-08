package com.co.retochoucair.questions;

import com.co.retochoucair.userinterfaces.PostModule;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class CapturePost implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(PostModule.CAPTURE_TITLE).viewedBy(actor).asString();
    }
    public static CapturePost toCapturePost(){
        return new CapturePost();
    }
}
