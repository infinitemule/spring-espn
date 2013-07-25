package com.infinitemule.espn.common.lang;

public class Console {

  public static void printfn(String s) {
    System.out.printf(s + "\n");
  }
  
  public static void printfn(String s, Object ... params) {
    System.out.printf(s + "\n", params);
  }
  
  public static void println() {
    System.out.println();
  }
  
  public static void println(String s) {
    System.out.println(s);
  }
}
