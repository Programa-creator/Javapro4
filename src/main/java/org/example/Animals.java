package org.example;

public class Animals {
    public static void main(String[] args) {

        System.out.print("Dogs: Bobik and Jeus \n" + "Cats: Barsik and Fill\n");

        Cat cats = new Cat();
        Dog dogs = new Dog();

        dogs.dogrun("Bobik", 170);
        cats.catswim("Fill",3);

    }


}

