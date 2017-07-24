package com.basepatterns.creation.builder;

public class BuildeWebSiteRunner {
    public static void main(String[] args) {
        Director director=new Director();
        director.setBuilder(new VizitCardWebSiteBuilder());

        WebSite webSite=director.buildeWebSite();

        System.out.println(webSite);
    }
}
