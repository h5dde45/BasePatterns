package com.basepatterns.creation.abstractFactory.website;

import com.basepatterns.creation.abstractFactory.Developer;
import com.basepatterns.creation.abstractFactory.ProjectManager;
import com.basepatterns.creation.abstractFactory.ProjectTeamFactory;
import com.basepatterns.creation.abstractFactory.Tester;

public class WebSiteTeamfactory implements ProjectTeamFactory{
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebSitePM();
    }
}
