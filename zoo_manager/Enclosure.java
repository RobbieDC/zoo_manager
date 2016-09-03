package zoo_manager;

import java.util.*;

public abstract class Enclosure {

  int capacity;
  ArrayList<Animal> occupants;

  public Enclosure(int capacity, ArrayList<Animal> occupants) {
    this.capacity = capacity;
    this.occupants = occupants;
  }

  public int getCapacity() {
    return this.capacity;
  }

  public int setCapacity(int newCapacity) {
    this.capacity = newCapacity;
  }

}