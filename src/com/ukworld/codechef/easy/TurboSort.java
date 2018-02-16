package com.ukworld.codechef.easy;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Random;

/**
 * Problem Name and Code: Turbo Sort (TSORT)
 * problem link: https://www.codechef.com/problems/TSORT
 */
public class TurboSort {

  private static Random random = new Random();
  private static String lineSeparator = System.lineSeparator();

  public static void main(String[] args) throws IOException {
    final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in),
        32768);
    int n = Integer.parseInt(bufferedReader.readLine());
    int a[] = new int[n];
    for (int index = 0; index < n; index++) {
      a[index] = Integer.parseInt(bufferedReader.readLine());
    }
    quickSort(a, 0, n - 1);

    final BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder stringBuilder = new StringBuilder();
    for (int num : a) {
      stringBuilder.append(num);
      stringBuilder.append(lineSeparator);
    }
    bufferedReader.close();
    bufferedWriter.write(stringBuilder.toString());
    bufferedWriter.close();
  }

  /**
   * Sort is using the Quick quickSort Algorithm
   *
   * @param a array of integers
   * @param start index of array a.
   * @param end last index of .
   */
  private static void quickSort(int[] a, int start, int end) {
    if (start < end) {
      int pIndex = randomizedPartition(a, start, end);
      quickSort(a, pIndex + 1, end);
      quickSort(a, start, pIndex - 1);
    }
  }

  private static int randomizedPartition(int[] a, int start, int end) {
    int pIndex = random.nextInt((end - start) + 1) + start;
    swap(a, pIndex, end);
    return partition(a, start, end);
  }

  /**
   * Selecting the pivot element and and placing it to to position where
   * all small values are on left and greater are on right.
   *
   * @param a array of integers
   * @param start start index of the array segment
   * @param end end index of the array segment
   * @return pivot index after rearranging
   */
  private static int partition(int[] a, int start, int end) {
    int pivot = a[end];
    int pIndex = start;
    for (int i = start; i < end; i++) {
      if (a[i] <= pivot) {
        swap(a, i, pIndex++);
      }
    }
    swap(a, pIndex, end);
    return pIndex;
  }

  private static void swap(int[] a, int i, int pIndex) {
    int temp = a[i];
    a[i] = a[pIndex];
    a[pIndex] = temp;
  }
}
