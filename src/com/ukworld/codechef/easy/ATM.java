package com.ukworld.codechef.easy;

import java.util.Scanner;

/**
 * Problem Name & Code: ATM (HS08TEST)
 * problem link: https://www.codechef.com/problems/HS08TEST
 */
public class ATM {

  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);
    int withdrawAmount = scanner.nextInt();
    float initialAmount = scanner.nextFloat();
    if (withdrawAmount % 5 == 0) {
      float totalDeduction = withdrawAmount + 0.50f;
      if (initialAmount >= totalDeduction) {
        initialAmount -= totalDeduction;
      }
    }
    System.out.printf("%.2f", initialAmount);
  }

}
