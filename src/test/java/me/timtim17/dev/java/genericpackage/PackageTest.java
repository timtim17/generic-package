package me.timtim17.dev.java.genericpackage;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author Austin Jenchi (timtim17)
 */
public class PackageTest {
  public static final Integer TEST_INTEGER = 5;
  public static final String TEST_STRING = "Test";

  @Test
  public void testGetValue() {
    Package<Integer> p = new Package<>(TEST_INTEGER);
    assertEquals(TEST_INTEGER, p.getValue());
  }

  @Test
  public void testSetValue() {
    Package<Integer> p = new Package<>(TEST_INTEGER);
    p.setValue(TEST_INTEGER + 1);
    assertEquals(new Integer(TEST_INTEGER + 1), p.getValue());
  }

  @Test
  public void testList() {
    List<Package<?>> list = new ArrayList<>();
    list.add(new Package<>(TEST_INTEGER));
    list.add(new Package<>(TEST_STRING));
    assertTrue(list.get(0).getValue() instanceof Integer);
    assertTrue(list.get(1).getValue() instanceof String);
  }
}