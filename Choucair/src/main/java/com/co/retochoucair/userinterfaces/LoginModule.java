package com.co.retochoucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginModule {

    public static final Target ICON_WORDPRESS= Target.the("capture icon").locatedBy("//li[@id='wp-admin-bar-wp-logo']//span[@class='ab-icon']\n");
    public static final Target EMAIL_OR_USER= Target.the("input email").located(By.id("user_login"));
    public static final Target PASSWORD= Target.the("input password").located(By.id("user_pass"));
    public static final Target BUTTON_LOGIN= Target.the("Select button login").located(By.id("wp-submit"));
}
