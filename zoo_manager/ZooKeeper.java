package zoo_manager;

import java.util.*;

public class ZooKeeper {

  String name;
  Zoo zoo;

  public ZooKeeper(String name, Zoo zoo) {
    this.name = name;
    this.zoo = zoo;
  }

  public String getName() {
    return this.name;
  }

  public Zoo getZoo() {
    return this.zoo;
  }

  public int getNumEnclosures() {
    return zoo.getEnclosures().size();
  }

  public void addEnclosure( Enclosure enclosure ) {
    zoo.getEnclosures().add( enclosure );
  }

  public Enclosure getEnclosure( Enclosure enclosure ) {
    ArrayList<Enclosure> enclosures = zoo.getEnclosures();
    int enclosureIndex = enclosures.indexOf(enclosure);
    return enclosures.get(enclosureIndex);
  } 

}