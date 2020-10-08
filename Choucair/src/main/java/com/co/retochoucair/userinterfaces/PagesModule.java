package com.co.retochoucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PagesModule {
    public static final Target PAGES_BUTTON= Target.the("Select pages button").locatedBy("//body/div[@id='wpwrap']/div[@id='adminmenumain']/div[@id='adminmenuwrap']/ul[@id='adminmenu']/li[@id='menu-pages']/a[1]/div[3]");
    public static final Target ADD_NEW_PAGE= Target.the("Add new page").locatedBy("//a[@class='page-title-action']");
    public static final Target PAGE_TITLE= Target.the("input page title").locatedBy("//textarea[@id='post-title-0']");
    public static final Target TO_POST= Target.the("to post page").locatedBy("//button[@class='components-button editor-post-publish-panel__toggle is-button is-primary']");
    public static final Target CONFIRM_PUBLICATION= Target.the("confirm publication").locatedBy("//button[@class='components-button editor-post-publish-button is-button is-default is-primary is-large']");
    public static final Target VIEW_PAGE= Target.the("view page").locatedBy("//a[@class='components-button is-button is-default']");
    public static final Target ADD_COMPLEMENT= Target.the("add complement").locatedBy("//body/div[@id='wpwrap']/div[@id='wpcontent']/div[@id='wpbody']/div[@id='wpbody-content']/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]");
    public static final Target POP_UP_WINDOW_BUTTON= Target.the("close pop up window").locatedBy("//button[@class='components-button components-icon-button nux-dot-tip__disable']");
    public static final Target ADD_IMAGE= Target.the("select add image").locatedBy("//body/div[@id='wpwrap']/div[@id='wpcontent']/div[@id='wpbody']/div[@id='wpbody-content']/div[4]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/button[1]");
    public static final Target URL_BUTTON= Target.the("select url button").locatedBy("//button[contains(text(),'Insert from URL')]");
    public static final Target URL_TEXT_BOX= Target.the("input url text box").locatedBy("//input[@class='editor-media-placeholder__url-input-field block-editor-media-placeholder__url-input-field' and @aria-label='URL']");
    public static final Target ADD_URL= Target.the("ADD_URL").locatedBy("//button[@class='components-button components-icon-button editor-media-placeholder__url-input-submit-button block-editor-media-placeholder__url-input-submit-button']");
    public static final Target CAPTURE_TITLE= Target.the("Capture Title").locatedBy("//header/h1[1]");
    public static final Target EDIT_BUTTON= Target.the("Select edit button").locatedBy("//span[@class='edit-link']");
    public static final Target UPDATE_BUTTON= Target.the("Select update button").locatedBy("//button[@class='components-button editor-post-publish-button is-button is-default is-primary is-large']");
    public static final Target PREVIEW_BUTTON= Target.the("Select preview button").locatedBy("//a[contains(text(),'View Page')]");

}
