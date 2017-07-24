package com.basepatterns.creation.abstractFactory.website;

import com.basepatterns.creation.abstractFactory.ProjectManager;

public class WebSitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("WebSitePM manages project..");
    }
}
