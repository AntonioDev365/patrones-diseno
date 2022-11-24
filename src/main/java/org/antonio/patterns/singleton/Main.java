package org.antonio.patterns.singleton;

public class Main {
    public static void main(String[] args) {

        System.out.println("Implementing Singleton Design Pattern in Java: ");

        Singleton classSingleton1 = Singleton.getInstance();

        System.out.println(classSingleton1.getInfo());

        Singleton classSingleton2 = Singleton.getInstance();
        classSingleton2.setInfo("New class info");

        System.out.println(classSingleton1.getInfo());
        System.out.println(classSingleton2.getInfo());
    }
}
