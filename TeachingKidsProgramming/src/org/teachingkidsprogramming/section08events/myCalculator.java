package org.teachingkidsprogramming.section08events;

import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class myCalculator
{
  public static void main(String[] args)
  {
    int num1 = MessageBox.askForNumericalInput("Please enter the first number.");
    MessageBox.showMessage("You entered : " + num1);
    int num2 = MessageBox.askForNumericalInput("Please enter the second number.");
    MessageBox.showMessage("You entered : " + num2);
    int input = MessageBox
        .askForNumericalInput("Addition - 1, Subtrction - 2, Multipliction - 3, Division - 4, Powers - 5");
    if (input == 1)
    {
      addition(num1, num2);
    }
    else if (input == 2)
    {
      subtraction(num1, num2);
    }
    else if (input == 3)
    {
      multiplication(num1, num2);
    }
    else if (input == 4)
    {
      division(num1, num2);
    }
    else if (input == 5)
    {
      powers(num1, num2);
    }
  }
  private static void powers(int num1, int num2)
  {
    int answer = pow(num1, num2);
    MessageBox.showMessage(num1 + " to the power of " + num2 + " is " + answer + ".");
  }
  private static void division(int num1, int num2)
  {
    int quotient = divide(num1, num2);
    if (quotient == -1) { return; }
    MessageBox.showMessage("The quotient of your numbers is : " + quotient);
  }
  private static void multiplication(int num1, int num2)
  {
    int product = multiply(num1, num2);
    MessageBox.showMessage("The product of your numbers is : " + product);
  }
  private static void subtraction(int num1, int num2)
  {
    int difference = subtract(num1, num2);
    MessageBox.showMessage("The difference of your numbers is : " + difference);
  }
  private static void addition(int num1, int num2)
  {
    int sum = add(num1, num2);
    MessageBox.showMessage("The sum of your numbers is : " + sum);
  }
  public static int add(int n1, int n2)
  {
    return n1 + n2;
  }
  public static int subtract(int n1, int n2)
  {
    return n1 - n2;
  }
  public static int multiply(int n1, int n2)
  {
    return n1 * n2;
  }
  public static int divide(int n1, int n2)
  {
    if (n2 == 0)
    {
      MessageBox.showMessage("Error. Division by zero.");
      return -1;
    }
    else
      return n1 / n2;
  }
  public static int pow(int base, int exp)
  {
    int answer = 1;
    for (int i = 0; i < exp; i++)
    {
      answer = answer * base;
    }
    return answer;
  }
}