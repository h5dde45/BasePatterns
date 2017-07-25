package com.basepatterns.structural.facade;

public class Developer {
    public void doJobBeForDeadLine(BugTracker bugTracker){
        if(bugTracker.isActiveSprint()){
            System.out.println("Developer solves problems");
        }else {
            System.out.println("The developer is looking for a solution to the problems");
        }
    }
}
