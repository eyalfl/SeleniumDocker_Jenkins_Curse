package com.test;



public class Test {
  public static void main(String[] args) {
    System.out.println("Square");

    int num = Integer.parseInt(args[0]);

    for(int i = 1; i <= num; i++) {
      System.out.println("Square for number " + i + " is " + i * i);
    }
  }
}