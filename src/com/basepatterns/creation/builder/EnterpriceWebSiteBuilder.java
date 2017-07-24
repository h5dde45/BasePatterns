package com.basepatterns.creation.builder;

public class EnterpriceWebSiteBuilder extends WebSiteBuilder {
    @Override
    void buildName() {
        webSite.setName("Enterprice web site");
    }

    @Override
    void buildCms() {
        webSite.setCms(Cms.ALTFRESCO);
    }

    @Override
    void buildPrice() {
        webSite.setPrice(10000);
    }
}
