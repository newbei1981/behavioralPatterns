package com.newbie.behavioral.template;

public abstract class WebSiteTemplate {
    public void showPage(){
        System.out.println("HEADER");
        showDifferentContent();
        System.out.println("FOOTER");
    }

    public abstract void showDifferentContent();
}
