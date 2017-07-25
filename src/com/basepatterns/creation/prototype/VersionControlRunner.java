package com.basepatterns.creation.prototype;

public class VersionControlRunner {
    public static void main(String[] args) {
        Project master=new Project(1,"SuperProject","Source code=new SourceCode();");
        System.out.println(master);

        Project masterClone=(Project) master.copy();
        System.out.println(masterClone);

        ProjectFactory factory=new ProjectFactory(master);
        Project masterClone2=factory.cloneProject();
        System.out.println(masterClone2);
    }
}
