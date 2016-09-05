package zoo_manager;

import java.util.*;
import behaviours.*;

public class Arctic extends Enclosure {

  ArrayList<Arcticable> occupants;

  public Arctic(int capacity) {
    super(capacity);
    this.occupants = new ArrayList<Arcticable>();
  }

}