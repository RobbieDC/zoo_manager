package zoo_manager;

import java.util.*;
import behaviours.*;

public class BambooForest extends Enclosure {

  ArrayList<BambooForestable> occupants;

  public BambooForest(int capacity) {
    super(capacity);
    this.occupants = new ArrayList<BambooForestable>();
  }

}