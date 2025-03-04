package edu.grinnell.csc207.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import java.util.Arrays;

/**
 * A variety of utilities for getting input.
 *
 * @author Samuel A. Rebelsky
 */
public class IOUtils {
  // +------------------+--------------------------------------------
  // | Provided methods |
  // +------------------+

  /**
   * Prompt for a string and return it.
   */
  public static String readLine(PrintWriter pen, BufferedReader eyes,
      String prompt) throws IOException {
    pen.print(prompt);
    pen.flush();
    return eyes.readLine();
  } // readLine(PrintWriter, BufferedReader, String)

  /**
   * Read an integer.
   *
   * @param pen
   *   Where to print the prompt.
   * @param eyes
   *   How to read input.
   * @param prompt
   *   The prompt to print.
   *
   * @return the integer read
   *
   * @throws IOException
   *   If an I/O exception occurs.
   */
  public static int readInt(PrintWriter pen, BufferedReader eyes,
      String prompt) throws IOException {
    int result = 0;
    boolean done = false;
    while (!done) {
      pen.print(prompt);
      pen.flush();
      String response = eyes.readLine();
      try {
        result = Integer.parseInt(response);
        done = true;
      } catch (NumberFormatException e) {
        pen.printf("I'm sorry, but '%s' isn't an integer.\n", response);
      } // try/catch
    } // while
    return result;
  } // readInt(PrintWriter, BufferedReader, String)

} // class IOUtils
