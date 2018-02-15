package com.ukworld.codechef.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Problem Name and Code: Factorial(FCTRL)
 * problem link: https://www.codechef.com/problems/FCTRL
 * Study Material : http://www.purplemath.com/modules/factzero.htm
 */
public class TrailingZerosInFactorial {

  public static void main(String[] args) throws IOException {
    final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in),
        32768);
    int testCases = Integer.parseInt(bufferedReader.readLine());
    long n;
    while (testCases-- > 0) {
      n = Long.parseLong(bufferedReader.readLine());
      int noOfTrailingZero = 0;
      while (n > 0) {
        n = n / 5;
        noOfTrailingZero += n;
      }
      System.out.println(noOfTrailingZero);
    }
  }
}
