package zoo_manager;

import behaviours.*;

public class PolarBear extends Animal implements Arcticable, Rampageable {

  public PolarBear(String name, SexType sex, Double value) {
    super(name, sex, value);
  }

}