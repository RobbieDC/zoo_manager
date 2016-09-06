package zoo_manager;

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

}