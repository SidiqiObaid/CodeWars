package com.pluralsight;

public class EligiableForBonus {
    public static void main(String[] args) {

       /* It's bonus time in the big city! The fatcats are rubbing their paws in anticipation...
       but who is going to make the most money?

        Build a function that takes in two arguments (salary, bonus).
        Salary will be an integer, and bonus a boolean.

        If bonus is true, the salary should be multiplied by 10.
        If bonus is false, the fatcat did not make enough money and must receive only his stated salary.*/

        System.out.println(elegibleForBonus(1000,true));




    }
    public static String elegibleForBonus (int salary, boolean bonus){
        int totalSalary;
        if (bonus){
          totalSalary = salary*10;
        }
        String result = "Your salary is "+ totalSalary
        return result;
    }

}
