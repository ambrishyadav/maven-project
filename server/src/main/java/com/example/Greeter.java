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
* @return greeting string
* @param someone the name of person
*/

  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
