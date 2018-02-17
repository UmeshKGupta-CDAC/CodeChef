package com.ukworld.codechef.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by umesh on 17/2/18.
 */
public class AddTwoNumbers {

  public static void main(String[] args) {
    InputReader inputReader = new InputReader(System.in);
    int t = inputReader.nextInt();
    while (t-- > 0) {
      System.out.println(inputReader.nextInt() + inputReader.nextInt());
    }
  }

  static class InputReader {

    private static BufferedReader reader;
    private static StringTokenizer tokenizer;

    InputReader(InputStream inputStream) {
      reader = new BufferedReader(new InputStreamReader(inputStream), 32768);
    }

    int nextInt() {
      return Integer.parseInt(next());
    }

    String next() {
      while (tokenizer == null || !tokenizer.hasMoreTokens()) {
        try {
          tokenizer = new StringTokenizer(reader.readLine());
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
      return tokenizer.nextToken();
    }

  }

}
