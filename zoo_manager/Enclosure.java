package zoo_manager;

import java.util.*;

public abstract class Enclosure {

  int capacity;
  ArrayList<Animal> occupants;

  public Enclosure(int capacity) {
    this.capacity = capacity;
    this.occupants = new ArrayList<Animal>();
  }

  public int getCapacity() {
    return this.capacity;
  }

  public ArrayList<Animal> getOccupants() {
    return this.occupants;
  }

  public void setCapacity(int newCapacity) {
    this.capacity = newCapacity;
  }

}