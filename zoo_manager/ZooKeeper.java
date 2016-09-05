package zoo_manager;

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

}