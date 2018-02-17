package com.ukworld.codechef.easy;

import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * https://www.codechef.com/problems/MUFFINS3
 */
public class PackagingCupcakes {

  public static void main(String[] args) {
    InputReader in = new InputReader(System.in);
    int t = in.nextInt();
    while (t-- > 0) {
      System.out.println(in.nextInt() / 2 + 1);
    }
  }

  static class InputReader {

    private static BufferedReader reader;
    private static StringTokenizer tokenizer;

    public InputReader(InputStream inputStream) {
      reader = new BufferedReader(new InputStreamReader(inputStream), 32768);
    }

    private String next() {
      while (tokenizer == null || !tokenizer.hasMoreTokens()) {
        try {
          tokenizer = new StringTokenizer(reader.readLine());
        } catch (IOException e) {
          throw new RuntimeException();
        }
      }
      return tokenizer.nextToken();
    }

    private int nextInt() {
      return parseInt(next());
    }
  }
}
