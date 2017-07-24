package com.basepatterns.creation.builder;

public abstract class WebSiteBuilder {

    WebSite webSite;

    void createWebSite(){
        webSite=new WebSite();
    }

    abstract void buildName();
    abstract void buildCms();
    abstract void buildPrice();

    public WebSite getWebSite() {
        return webSite;
    }
}
