package zoo_manager;

import java.util.*;
import behaviours.*;

public class BambooForest extends Enclosure {

  ArrayList<BambooForestable> occupants;

  public BambooForest(int capacity) {
    super(capacity);
    this.occupants = new ArrayList<BambooForestable>();
  }

  public int getNumOccupants() {
    return this.occupants.size();
  }

  public ArrayList<BambooForestable> getOccupants() {
    return this.occupants;
  }

  public void addAnimal(BambooForestable animal) {
    occupants.add(animal);
  }

  public BambooForestable removeAnimal(BambooForestable animal) {
    int animalIndex = occupants.indexOf(animal);
    return occupants.remove(animalIndex);
  }

}