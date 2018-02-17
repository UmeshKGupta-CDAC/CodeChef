package com.ukworld.codechef.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class TheLeadGame {

  public static void main(String[] args) throws IOException {
    final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in),
        32768);

    int p1Total, p2Total, maxLead, w, lead;
    p1Total = p2Total = maxLead = w = lead = 0;
    int n = Integer.parseInt(bufferedReader.readLine());
    String[] scores;
    for (int index = 0; index < n; index++) {
      scores = bufferedReader.readLine().split(" ");
      p1Total += Integer.parseInt(scores[0]);
      p2Total += Integer.parseInt(scores[1]);
      if (p1Total > p2Total) {
        lead = p1Total - p2Total;
        if (lead > maxLead) {
          maxLead = lead;
          w = 1;
        }
      } else if (p2Total > p1Total) {
        lead = p2Total - p1Total;
        if (lead > maxLead) {
          maxLead = lead;
          w = 2;
        }
      }
    }
    System.out.println(w + " " + maxLead);
  }

}
