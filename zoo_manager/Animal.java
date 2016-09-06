package zoo_manager;

import java.util.*;
import behaviours.*;

public abstract class Animal {

  String name;
  SexType sex;
  double value;
  ArrayList<Edible> belly;

  public Animal( String name, SexType sex, double value ) {
    this.name = name;
    this.sex = sex;
    this.value = value;
    this.belly = new ArrayList<Edible>();
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

  public int foodCount() {
    return belly.size();
  }

  public void eat(Edible food) {
    belly.add(food);
  }

}