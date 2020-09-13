package com.newbie.behavioral.template;

public class WebSitesRunner {
    public static void main(String[] args) {
        WebSiteTemplate newsPage = new NewsPage();
        newsPage.showPage();
        System.out.println();

        WebSiteTemplate internetStore = new InternetStore();
        internetStore.showPage();

    }
}
