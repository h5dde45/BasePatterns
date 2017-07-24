package com.basepatterns.creation.abstractFactory;

import com.basepatterns.creation.abstractFactory.banking.BankingTeamfactory;

public class SuperBankSystem {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory=new BankingTeamfactory();
        Developer developer=projectTeamFactory.getDeveloper();
        Tester tester=projectTeamFactory.getTester();
        ProjectManager projectManager=projectTeamFactory.getProjectManager();

        System.out.println("===============");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();

    }
}
