package org.teachingkidsprogramming;

import java.util.Scanner;

public class HelloName
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter your first name: ");
    String name = scan.next();
    System.out.println(name);
  }
}
