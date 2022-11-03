package org.example;

public class Dog extends Animals{
    protected String bobik = "Bobik";
    protected String jeus = "Jeus";

    protected void dogrun(String name, int distance) {
        if (distance <= 500) {
            System.out.print(name + " run:" + distance + "m\n");
        } else {
            System.out.print(name + " could not run:" + distance + "m\n");
        }
    }

    protected void dogswim(String name, int distance) {
        if (distance <= 10) {
            System.out.print(name + " проплив: " + distance + "m\n");
        } else {
            System.out.print(name + " could not swim: " + distance + "m\n");
        }
    }
}
