package zoo_manager;

import java.util.*;
import behaviours.*;

public class Nutritionist {

  String name;
  Zoo zoo;

  public Nutritionist(String name, Zoo zoo) {
    this.name = name;
    this.zoo = zoo;
  }

  public String getName() {
    return this.name;
  }

  public void addFoodToEnclosure(Edible burrito, Enclosure enclosure) {
    ArrayList<Edible> foodStore = enclosure.getFoodStore();
    foodStore.add(burrito);
  }

}