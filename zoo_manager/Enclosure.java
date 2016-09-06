package zoo_manager;

import java.util.*;
import behaviours.*;

public abstract class Enclosure {

  int capacity;
  ArrayList<Edible> food;
  // ArrayList<Animal> occupants;

  public Enclosure(int capacity) {
    this.capacity = capacity;
    this.food = food;
    // this.occupants = new ArrayList<Animal>();
  }

  public int getCapacity() {
    return this.capacity;
  }

  public void setCapacity(int newCapacity) {
    this.capacity = newCapacity;
  }

  public ArrayList<Edible> getFood() {
    return this.food;
  }

  // The following methods have been transferred to concrete classes of enclosure
  // NOT DRY

  // public ArrayList<Animal> getOccupants() {
  //   return this.occupants;
  // }

  // public int getNumOccupants() {
  //   return this.occupants.size();
  // }

  // public void addAnimal(Animal animal) {
  //   occupants.add(animal);
  // }

  // public Animal removeAnimal(Animal animal) {
  //   int animalIndex = occupants.indexOf(animal);
  //   return occupants.remove(animalIndex);
  // }

}