package com.newbie.behavioral.template;

public class NewsPage extends WebSiteTemplate{
    @Override
    public void showDifferentContent() {
        System.out.println("Other news from all world!");
    }
}
