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
    // ArrayList<Edible> foodStore = new ArrayList<Edible>();
    // System.out.println("burrito: " + burrito);
    // System.out.println("enclosure: " + enclosure);
    // System.out.println("enclosure.getfood(): " + enclosure.getFood());
    ArrayList<Edible> foodStore = enclosure.getFood();
    foodStore.add(burrito);
  }

}