package com.basepatterns.creation.factory;

public class PhpDeveloperFactory  implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new PhpDeveloper();
    }
}
