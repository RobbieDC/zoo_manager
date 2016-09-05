package zoo_manager;

import java.util.*;
import behaviours.*;

public class Arctic extends Enclosure {

  ArrayList<Arcticable> occupants;

  public Arctic(int capacity) {
    super(capacity);
    this.occupants = new ArrayList<Arcticable>();
  }

  public ArrayList<Arcticable> getOccupants() {
    return this.occupants;
  }

  public int getNumOccupants() {
    return this.occupants.size();
  }

  public void addAnimal(Arcticable animal) {
    occupants.add(animal);
  }

  public Arcticable removeAnimal(Arcticable animal) {
    int animalIndex = occupants.indexOf(animal);
    return occupants.remove(animalIndex);
  }

}