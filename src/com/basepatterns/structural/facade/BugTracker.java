package com.basepatterns.structural.facade;

public class BugTracker {
    private boolean activeSprint;

    public boolean isActiveSprint() {
        return activeSprint;
    }
    public void startSpring(){
        System.out.println("spring is active");
        activeSprint=true;
    }
    public void finishSpring(){
        System.out.println("spring is not active");
        activeSprint=false;
    }

}
