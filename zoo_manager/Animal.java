package zoo_manager;

public abstract class Animal {

  String name;
  SexType sex;
  double value;

  public Animal( String name, SexType sex, double value ) {
    this.name = name;
    this.sex = sex;
    this.value = value;
  }

  public String getName() {
    return this.name;
  }

  public SexType getSex() {
    return this.sex;
  }

  public double getValue() {
    return this.value;
  }

  public void setValue( double newValue ) {
    this.value = newValue;
  }

}