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
    //Methoden um einen Wert innerhalb des Records zu verändern
    public Animal withId(int id){
          return new Animal(id,this.name,this.type(),this.age(),this.owner(),this.species());
      }
    public Animal withName(String name){
        return new Animal(this.id,name,this.type(),this.age(),this.owner(),this.species());
    }
    public Animal withType(String type){
        return new Animal(this.id,this.name,type,this.age(),this.owner(),this.species());
    }
    public Animal withAge(int age){
        return new Animal(this.id,this.name,this.type(),age,this.owner(),this.species());
    }
    public Animal withOwner(Owner owner){
        return new Animal(this.id,this.name,this.type(),this.age(),owner,this.species());
    }
    public Animal withSpecies(Species species){
        return new Animal(this.id,this.name,this.type(),this.age(),this.owner,species);
    }

}
