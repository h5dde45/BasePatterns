package com.basepatterns.creation.abstractFactory.banking;

import com.basepatterns.creation.abstractFactory.Developer;
import com.basepatterns.creation.abstractFactory.ProjectManager;
import com.basepatterns.creation.abstractFactory.ProjectTeamFactory;
import com.basepatterns.creation.abstractFactory.Tester;

public class BankingTeamfactory implements ProjectTeamFactory{
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
