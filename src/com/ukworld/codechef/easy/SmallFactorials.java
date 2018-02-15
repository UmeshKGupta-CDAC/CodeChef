package com.ukworld.codechef.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * Problem Name and Code: Small factorials(FCTRL2)
 * problem link: https://www.codechef.com/problems/FCTRL2
 */
public class SmallFactorials {

  public static void main(String[] args) throws IOException {
    final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in),
        32768);
    int testCases = Integer.parseInt(bufferedReader.readLine());
    int n;
    BigInteger factorial;
    while (testCases-- > 0) {
      n = Integer.parseInt(bufferedReader.readLine());
      factorial = BigInteger.ONE;
      while (n > 0) {
        factorial = factorial.multiply(BigInteger.valueOf(n--));
      }
      System.out.println(factorial.toString());
    }
  }
}
