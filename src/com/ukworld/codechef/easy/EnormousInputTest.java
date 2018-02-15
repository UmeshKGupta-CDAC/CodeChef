package com.ukworld.codechef.easy;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

/**
 * Problem Name and Code: Enormous Input Test (INTEST)
 * problem link: https://www.codechef.com/problems/INTEST
 */
public class EnormousInputTest {

  public static void main(String[] args) throws IOException {
    final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in),
        32768);
    String[] inputs = bufferedReader.readLine().split(" ");
    int n = Integer.parseInt(inputs[0]);
    int k = Integer.parseInt(inputs[1]);
    int total = 0;
    while (n > 0) {
      int number = Integer.parseInt(bufferedReader.readLine());
      if (number % k == 0) {
        total++;
      }
      n--;
    }
    System.out.println(total);
    bufferedReader.close();
  }
}
