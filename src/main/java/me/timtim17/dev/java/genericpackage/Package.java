package me.timtim17.dev.java.genericpackage;

/**
 * A wrapper class for Object that preserves the object's type.
 * One simple class that's the same for all data types for storing in
 * collections (i.e. {@code List<Package<?>>}).
 *
 * @author Austin Jenchi (timtim17)
 */
public class Package<T> {
  private T value;

  public Package(T value) {
    this.value = value;
  }

  public void setValue(T newValue) {
    value = newValue;
  }

  public T getValue() {
    return value;
  }
}
