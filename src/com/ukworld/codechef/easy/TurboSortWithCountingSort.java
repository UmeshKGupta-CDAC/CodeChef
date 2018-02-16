package com.ukworld.codechef.easy;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * Problem Name and Code: Turbo Sort (TSORT)
 * problem link: https://www.codechef.com/problems/TSORT
 * Using Counting Sort
 */
public class TurboSortWithCountingSort {

  private static String lineSeparator = System.lineSeparator();

  public static void main(String[] args) throws IOException {
    final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in),
        32768);
    final int n = Integer.parseInt(bufferedReader.readLine());

    final int a[] = new int[(int) (Math.pow(10, 6) + 1)];
    int input;
    for (int index = 0; index < n; index++) {
      input = Integer.parseInt(bufferedReader.readLine());
      a[input] = a[input] + 1;
    }
    final BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
    final StringBuilder stringBuilder = new StringBuilder();

    for (int index = 0; index < a.length; index++) {
      if (a[index] > 0) {
        for (int f = 1; f <= a[index]; f++) {
          stringBuilder.append(index);
          stringBuilder.append(lineSeparator);
        }
      }
    }
    bufferedReader.close();
    bufferedWriter.write(stringBuilder.toString());
    bufferedWriter.close();
  }

}
