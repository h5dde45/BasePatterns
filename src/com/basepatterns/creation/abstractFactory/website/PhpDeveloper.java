package com.basepatterns.creation.abstractFactory.website;

import com.basepatterns.creation.abstractFactory.Developer;

public class PhpDeveloper implements Developer{
    @Override
    public void writeCode() {
        System.out.println("Php developer writes php code..");
    }
}
