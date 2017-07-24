package com.basepatterns.creation.abstractFactory;

import com.basepatterns.creation.abstractFactory.website.WebSiteTeamfactory;

public class AuctionSiteProject {

    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebSiteTeamfactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("===============");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();

    }
}
