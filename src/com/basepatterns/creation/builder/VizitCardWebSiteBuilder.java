package com.basepatterns.creation.builder;

public class VizitCardWebSiteBuilder extends WebSiteBuilder {

    @Override
    void buildName() {
        webSite.setName("Visit card");
    }

    @Override
    void buildCms() {
        webSite.setCms(Cms.WORDFRESCO);
    }

    @Override
    void buildPrice() {
        webSite.setPrice(500);
    }
}
