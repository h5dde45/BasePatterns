package com.basepatterns.creation.factory;

public class CppDeveloperFactory  implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
