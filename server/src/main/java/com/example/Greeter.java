package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
   * @param name Name of a person
   * @return greeting String
   */
  public final String greet(final String name) {
    return String.format("Hello, %s!", name);
  }
}
