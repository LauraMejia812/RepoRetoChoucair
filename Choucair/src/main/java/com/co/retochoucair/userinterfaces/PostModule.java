package com.co.retochoucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PostModule {
    public static final Target BUTTON_POST= Target.the("Select button post").locatedBy("//a[@class='wp-has-submenu wp-not-current-submenu menu-top menu-icon-post open-if-no-js menu-top-first']//div[@class='wp-menu-name']");
    public static final Target BUTTON_ADD_NEW= Target.the("Select button 'Agregar nuevo'").locatedBy("//a[@class='page-title-action']");
    public static final Target TITLE= Target.the("enter post title").locatedBy("//textarea[@id='post-title-0']");
    public static final Target TEXT= Target.the("enter post text").locatedBy("//body/div[@id='wpwrap']/div[@id='wpcontent']/div[@id='wpbody']/div[@id='wpbody-content']/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/p[1]");
    public static final Target PUBLISH_BUTTON= Target.the("Select publish button").locatedBy("//button[@class='components-button editor-post-publish-panel__toggle is-button is-primary']");
    public static final Target CONFIRM_PUBLICATION= Target.the("Confirm publish button").locatedBy("//button[@class='components-button editor-post-publish-button is-button is-default is-primary is-large']");
    public static final Target CAPTURE_TITLE= Target.the("Capture 'del titulo del post'").locatedBy("//header/h1[1]");
    public static final Target VIEW_POST= Target.the("Capture 'del titulo del post'").locatedBy("//a[@class='components-button is-button is-default']");
    public static final Target BUTTON_EDIT= Target.the("Select button 'editar'").locatedBy("//a[@class='post-edit-link']");
    public static final Target UPDATE_BUTTON= Target.the("Select button 'Actualizar'").locatedBy("//button[@class='components-button editor-post-publish-button is-button is-default is-primary is-large']");
    public static final Target EDITE_TITLE= Target.the("Capture edite title").locatedBy("//header/h1[1]");
    public static final Target PREVIEW_BUTTON= Target.the("view update").locatedBy("//a[contains(text(),'View Post')]");

}
