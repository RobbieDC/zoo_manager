package zoo_manager;

import java.util.*;

public class Zoo {

  ArrayList<Enclosure> enclosures;

  public Zoo() {
    this.enclosures = new ArrayList<Enclosure>();
  }

  public ArrayList<Enclosure> getEnclosures() {
    return this.enclosures;
  }

}