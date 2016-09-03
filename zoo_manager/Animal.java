package zoo_manager;

public abstract class Animal {

  String name;
  String sex;
  double value;

  public Animal( String name, String sex, double value ) {
    this.name = name;
    this.sex = sex;
    this.value = value;
  }

  public String getName() {
    return this.name;
  };

  public String getSex() {
    return this.sex;
  }

  public double getValue() {
    return this.value;
  }

  public void setValue( double newValue ) {
    this.value = newValue;
  }

}