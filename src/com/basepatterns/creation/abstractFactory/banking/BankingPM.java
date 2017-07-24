package com.basepatterns.creation.abstractFactory.banking;

import com.basepatterns.creation.abstractFactory.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Banking projectManager manages project__");
    }
}
