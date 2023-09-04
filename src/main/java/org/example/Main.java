package org.example;

public class Main {
    public static void main(String[] args) {

        //* In einer main-Methode, erstellt mehrere Animals.
        Animal animal1 = new Animal(1,"Mischu","bear",12);
        Animal animal2 = new Animal(2,"Wanja","bear",12);

       //Ruft die automatisch im Record generierten Methoden auf, und prüft, ob sie das tun, was ihr erwartet (equals, toString).
        System.out.println(animal1.equals(animal2));//false
        System.out.println(animal1);// 1, Mischu, bear, 12

    }
}