package org.example;

// Lege eine Java-Record-Klasse "Animal" an, die für ID, Name, Art und Alter folgende Eigenschaften haben soll. Wähle geeignete Feldnamen.
//Lasst jedes `Animal` einen `Owner` haben.
//Lasst jedes `Animal` eine `Species` haben.
public record Animal( int id,
                      String name,
                      String type,
                      int age,
                      Owner owner,
                      Species species){


}
