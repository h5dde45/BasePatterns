package com.basepatterns.structural.facade;

public class WorkFlow {

    Developer developer=new Developer();
    Job job=new Job();
    BugTracker bugTracker=new BugTracker();

    public void solverProblems(){
        job.doJob();
        bugTracker.startSpring();
        developer.doJobBeForDeadLine(bugTracker);

    }

}
