package org.example;

public class Cat extends Animals{
    protected String barsik = "Барсiк";
    protected String fill = "Фiлл";

    protected void catrun(String name, int distance) {
        if (distance <= 200) {
            System.out.print(name + " пробiг:" + distance + "м");
        } else {
            System.out.print(name + " не змiг пробiгти:" + distance + "м");
        }
    }
    protected void catswim(int distance, String name) {
            System.out.print(name + " не змiг проплити: " + distance + "м");
    }
}
