package com.basepatterns.structural.adapter;

public class DataBaseRunner {
    public static void main(String[] args) {
        Database database=new AdapterJavaDatabase();

        database.insert();
        database.update();
        database.select();
        database.remove();
    }
}
