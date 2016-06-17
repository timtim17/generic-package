package me.timtim17.dev.java.genericpackage;

/**
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
