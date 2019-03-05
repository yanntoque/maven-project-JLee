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
   * 
   * @param someone Name of a human being
   * @return greeting String
   */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
