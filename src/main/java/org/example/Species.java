package org.example;

//Erstellt einen `Species`-Record, der die Eigenschaften einer Tierart speichert (Name, Futterbedarf in Gramm pro Tag).
public record Species( String name,
                       double feedRequirementInGramsPerDay) {
}
