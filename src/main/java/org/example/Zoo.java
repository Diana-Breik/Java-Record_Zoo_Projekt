package org.example;

import java.util.List;
// Implementiere einen "Zoo"-Record, der eine Liste aller Animals hat und den Gesamtfutterbedarf aller Tiere im Zoo berechnen kann.
public record Zoo(List<Animal> allAnimals) {
    public double calculateTheTotalFeedRequirementOfAllAnimals(){
        double sum = 0;
        for(Animal animal : allAnimals){
            sum = sum + animal.species().feedRequirementInGramsPerDay();
        }
        return sum;
    }
}
