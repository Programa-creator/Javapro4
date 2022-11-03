package org.example;

public class Cat extends Animals{
    protected String barsik = "Barsik";
    protected String fill = "Fill";

    protected void catrun(String name, int distance) {
        if (distance <= 200) {
            System.out.print(name + " run:" + distance + "m\n");
        } else {
            System.out.print(name + " could not run:" + distance + "m\n");
        }
    }
    protected void catswim(String name, int distance) {
        System.out.print(name + " could not swim:" + distance + "m\n");
    }
}
