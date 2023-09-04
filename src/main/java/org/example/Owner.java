package org.example;

//Nun verwenden wir einen Record als Attribut eines anderen Records.
//
//* Legt nun einen `Owner`-Record an, der einige Eigenschaften eines Tierbesitzers speichert (Name, Alter, Adresse).
//* Lasst jedes `Animal` einen `Owner` haben.
public record Owner(String name,
                    int age,
                    String address) {


}
