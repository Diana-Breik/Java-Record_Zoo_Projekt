package org.example;

import java.util.List;

//In Eurer main-Methode, lasst mehrere `Animal`-Objekte die gleiche `Species` haben.
public class Main {
    public static void main(String[] args) {

        //* In einer main-Methode, erstellt mehrere Animals.
        Animal animal1 = new Animal(1,"Mischu","cat",12, new Owner("Bob",23,"Berlin"), new Species("aa",20.05));
        Animal animal2 = new Animal(2,"Wanja","cat",12, new Owner("Sara",33,"Hamburg"), new Species("aa",20.05));

       //Ruft die automatisch im Record generierten Methoden auf, und prüft, ob sie das tun, was ihr erwartet (equals, toString).
        System.out.println(animal1.equals(animal2));//false
        System.out.println(animal1);// 1, Mischu, cat, 12 + Informationen des Tierbesitzers und der Spezies

        // Änderung an den Infos bei einem Tier mithilfe einer Objekt-Kopie
        Animal animal1copy = new Animal(animal1.id(), animal1.name(), animal1.type(), 6,animal1.owner(),animal1.species());//age=6 statt 12 beim Tier
        System.out.println(animal1copy);

        Owner owner1copy = new Owner(animal1copy.owner().name(),50,"Hamburg");//Veränderungen der Informationen beim Tierbesitzer

        Animal animal2copy = new Animal(animal1copy.id(), animal1copy.name(), animal1copy.type(), animal1copy.age(), owner1copy,animal1.species());
        System.out.println(animal2copy);


        System.out.println("--------------------------");
        //Aufrufe der Methode ,um die ID zu ändern
        // System.out.println(animal1.withId(100));


        // Aufrufe der Methode im record (Zoo), die den Gesamtfutterbedarf aller Tiere im Zoo berechnen kann.
        System.out.println("How much feed requirement does a zoo have per day?");
        System.out.println(new Zoo(List.of(animal1,animal2)).calculateTheTotalFeedRequirementOfAllAnimals());
    }
}