package com.basepatterns.creation.abstractFactory.website;

import com.basepatterns.creation.abstractFactory.Tester;

public class ManualTester implements Tester{
    @Override
    public void testCode() {
        System.out.println("ManualTester tests website..");
    }
}
