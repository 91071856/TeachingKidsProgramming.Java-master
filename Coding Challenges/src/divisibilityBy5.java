import java.util.Scanner;

public class divisibilityBy5
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter an integer. Integer must be greater than zero.");
    int num = sc.nextInt();
    if (num < 1)
    {
      System.out.println("Invalid input. Integer must be greater than zero.");
    }
    if (num % 5 == 0)
    {
      System.out.println("Yes");
    }
    else
    {
      System.out.println("No");
    }
  }
}
