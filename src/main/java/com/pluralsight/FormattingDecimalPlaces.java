package com.pluralsight;

public class FormattingDecimalPlaces {
    public static void main(String[] args) {

       /* Each number should be formatted that it is rounded to two decimal places. You don't need to check whether the input is a valid number because only valid numbers are used in the tests.

        Example:
        5.5589 is rounded 5.56
        -3.3424 is rounded -3.34*/

        double d = twoDecimalPlaces(12.2551558);
        System.out.println(d);

    }
  public static double twoDecimalPlaces(double number)
        {
            number = Math.round(number * 100.0) / 100.0;
            //Write your code here
            return number;
        }
    }

