package com.ukworld.codechef.easy;

import java.util.Scanner;

/**
 * Problem Name and Code: Life, the Universe, and Everything (TEST)
 * problem link: https://www.codechef.com/problems/TEST
 */
public class LifeUniverseEverything {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (true) {
      int num = scanner.nextInt();
      if (num == 42) {
        break;
      } else {
        System.out.println(num);
      }
    }
    scanner.close();
  }
}
