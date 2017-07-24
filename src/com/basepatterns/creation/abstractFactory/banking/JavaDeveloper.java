package com.basepatterns.creation.abstractFactory.banking;

import com.basepatterns.creation.abstractFactory.Developer;

public class JavaDeveloper implements Developer{
    @Override
    public void writeCode() {
        System.out.println("Java developer writes java code..");
    }
}
