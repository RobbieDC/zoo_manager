package zoo_manager;

public abstract class Enclosure {

  int capacity;

  public Enclosure(int capacity) {
    this.capacity = capacity;
  }

  public int getCapacity() {
    return this.capacity;
  }

  public int setCapacity(int newCapacity) {
    this.capacity = newCapacity;
  }

}