package zoo_manager;

import java.util.*;
import behaviours.*;

public class Zoo {

  ArrayList<Enclosure> enclosures;
  ArrayList<Edible> edibles;

  public Zoo() {
    this.enclosures = new ArrayList<Enclosure>();
    this.edibles = new ArrayList<Edible>();
  }

  public ArrayList<Enclosure> getEnclosures() {
    return this.enclosures;
  }

}