package com.ukworld.codechef.easy;

import java.util.Scanner;

/**
 * https://www.codechef.com/problems/FLOW006
 */
public class SumOfDigits {

  public static void main(String[] args) {
    final Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    int sumOfDigit;
    int n;
    while (t-- > 0) {
      n = sc.nextInt();
      sumOfDigit = 0;
      while (n > 0) {
        sumOfDigit += n % 10;
        n = n / 10;
      }
      System.out.println(sumOfDigit);
    }
  }

}
