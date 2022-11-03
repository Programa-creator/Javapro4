package org.example;

public class Dog extends Animals{
    protected String bobik = "Бобiк";
    protected String jeus = "Зевс";

    protected void dogrun(String name, int distance) {
        if (distance <= 500) {
            System.out.print(name + " пробiг:" + distance + "м");
        } else {
            System.out.print(name + " не змiг пробiгти:" + distance + "м");
        }
    }

    protected void dogswim(int distance, String name) {
        if (distance <= 10) {
            System.out.print(name + " проплив: " + distance + "м");
        } else {
            System.out.print(name + " не змiг проплити: " + distance + "м");
        }
    }
}
